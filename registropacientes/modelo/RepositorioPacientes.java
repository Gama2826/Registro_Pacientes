package registropacientes.modelo;

import java.util.ArrayList;

public class RepositorioPacientes {

    private final ArrayList<Paciente> pacientes = new ArrayList<>();

    public void agregar(Paciente paciente) {
        pacientes.add(paciente);
    }

    public boolean existe(String numDocumento) {
        for (Paciente p : pacientes) {
            if (p.getNumDocumento().equals(numDocumento)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
}