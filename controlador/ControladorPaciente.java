package registropacientes.controlador;

import registropacientes.modelo.Paciente;
import registropacientes.modelo.RepositorioPacientes;
import registropacientes.vista.VistaPaciente;

public class ControladorPaciente {

    private final VistaPaciente vista;
    private final RepositorioPacientes repositorio;

    public ControladorPaciente(VistaPaciente vista, RepositorioPacientes repositorio) {
        this.vista = vista;
        this.repositorio = repositorio;

        this.vista.getBtnGuardar().addActionListener(e -> guardar());
        this.vista.getBtnCancelar().addActionListener(e -> vista.limpiar());
    }

    private void guardar() {
        // Campos obligatorios (los marcados con * en el formulario)
        if (vista.getNumDocumento().isEmpty()
                || vista.getNombres().isEmpty()
                || vista.getApellidos().isEmpty()
                || vista.getFechaNacimiento().isEmpty()
                || vista.getEdad().isEmpty()
                || vista.getTelCelular().isEmpty()
                || vista.getDireccion().isEmpty()) {
            vista.mostrarMensaje("Por favor complete todos los campos obligatorios (*).");
            return;
        }

        int edad;
        try {
            edad = Integer.parseInt(vista.getEdad());
        } catch (NumberFormatException ex) {
            vista.mostrarMensaje("La edad debe ser un número entero.");
            return;
        }

        if (repositorio.existe(vista.getNumDocumento())) {
            vista.mostrarMensaje("Ya existe un paciente con ese número de documento.");
            return;
        }

        Paciente paciente = new Paciente(
                vista.getTipoDocumento(),
                vista.getNumDocumento(),
                vista.getNombres(),
                vista.getApellidos(),
                vista.getFechaNacimiento(),
                edad,
                vista.getGenero(),
                vista.getTelFijo(),
                vista.getTelCelular(),
                vista.getCorreo(),
                vista.getDireccion(),
                vista.getEps(),
                vista.getRegimen(),
                vista.getOcupacion(),
                vista.getEstadoCivil(),
                vista.getCondMed(),
                vista.getObservaciones());

        repositorio.agregar(paciente);
        vista.mostrarMensaje("Paciente registrado correctamente. Total: "
                + repositorio.getPacientes().size());
        vista.limpiar();
    }
}