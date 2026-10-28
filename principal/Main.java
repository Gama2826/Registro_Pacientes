package registropacientes.principal;

import javax.swing.SwingUtilities;
import registropacientes.controlador.ControladorPaciente;
import registropacientes.modelo.RepositorioPacientes;
import registropacientes.vista.VistaPaciente;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VistaPaciente vista = new VistaPaciente();
            RepositorioPacientes repositorio = new RepositorioPacientes();
            new ControladorPaciente(vista, repositorio);
            vista.setVisible(true);
        });
    }
}
