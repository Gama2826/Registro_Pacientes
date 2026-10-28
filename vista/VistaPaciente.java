package registropacientes.vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaPaciente extends JFrame {

    private final JComboBox<String> cbTipoDocumento = new JComboBox<>(
            new String[]{"Cédula de ciudadanía", "Tarjeta de identidad", "Cédula de extranjería", "Pasaporte"});
    private final JTextField txtNumDocumento = new JTextField(12);
    private final JTextField txtNombres = new JTextField(12);
    private final JTextField txtApellidos = new JTextField(12);
    private final JTextField txtFechaNacimiento = new JTextField(12);
    private final JTextField txtEdad = new JTextField(12);
    private final JComboBox<String> cbGenero = new JComboBox<>(
            new String[]{"Masculino", "Femenino", "Otro"});
    private final JTextField txtTelFijo = new JTextField(12);
    private final JTextField txtTelCelular = new JTextField(12);
    private final JTextField txtCorreo = new JTextField(12);
    private final JTextField txtDireccion = new JTextField(12);
    private final JComboBox<String> cbEps = new JComboBox<>(
            new String[]{"Nueva EPS", "Sura", "Sanitas", "Compensar", "Famisanar", "Salud Total", "Coosalud", "Otra"});
    private final JComboBox<String> cbRegimen = new JComboBox<>(
            new String[]{"Contributivo", "Subsidiado", "Especial"});
    private final JTextField txtOcupacion = new JTextField(12);
    private final JComboBox<String> cbEstadoCivil = new JComboBox<>(
            new String[]{"Soltero(a)", "Casado(a)", "Unión libre", "Separado(a)", "Viudo(a)"});
    private final JComboBox<String> cbCondMed = new JComboBox<>(new String[]{"No", "Sí"});
    private final JTextField txtObservaciones = new JTextField(12);

    private final JButton btnCancelar = new JButton("Cancelar");
    private final JButton btnGuardar = new JButton("Guardar paciente");

    public VistaPaciente() {
        super("Registro de pacientes");

        // Panel con los campos en 2 columnas: etiqueta, campo, etiqueta, campo
        JPanel panelCampos = new JPanel(new GridLayout(0, 4, 5, 5));
        panelCampos.add(new JLabel("Tipo de documento *"));
        panelCampos.add(cbTipoDocumento);
        panelCampos.add(new JLabel("Número de documento *"));
        panelCampos.add(txtNumDocumento);

        panelCampos.add(new JLabel("Nombres *"));
        panelCampos.add(txtNombres);
        panelCampos.add(new JLabel("Apellidos *"));
        panelCampos.add(txtApellidos);

        panelCampos.add(new JLabel("Fecha nacimiento * (dd/mm/aaaa)"));
        panelCampos.add(txtFechaNacimiento);
        panelCampos.add(new JLabel("Edad *"));
        panelCampos.add(txtEdad);

        panelCampos.add(new JLabel("Género *"));
        panelCampos.add(cbGenero);
        panelCampos.add(new JLabel("Teléfono fijo"));
        panelCampos.add(txtTelFijo);

        panelCampos.add(new JLabel("Teléfono celular *"));
        panelCampos.add(txtTelCelular);
        panelCampos.add(new JLabel("Correo electrónico"));
        panelCampos.add(txtCorreo);

        panelCampos.add(new JLabel("Dirección de residencia *"));
        panelCampos.add(txtDireccion);
        panelCampos.add(new JLabel("EPS *"));
        panelCampos.add(cbEps);

        panelCampos.add(new JLabel("Régimen"));
        panelCampos.add(cbRegimen);
        panelCampos.add(new JLabel("Ocupación"));
        panelCampos.add(txtOcupacion);

        panelCampos.add(new JLabel("Estado civil"));
        panelCampos.add(cbEstadoCivil);
        panelCampos.add(new JLabel("¿Condición médica relevante?"));
        panelCampos.add(cbCondMed);

        panelCampos.add(new JLabel("Observaciones"));
        panelCampos.add(txtObservaciones);
        panelCampos.add(new JLabel(""));
        panelCampos.add(new JLabel(""));

        // Panel principal con los campos y los botones
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(panelCampos);
        panel.add(btnCancelar);
        panel.add(btnGuardar);

        add(panel);

        setSize(850, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    //Getters de los datos
    public int getTipoDocumento() { return cbTipoDocumento.getSelectedIndex(); }
    public String getNumDocumento() { return txtNumDocumento.getText().trim(); }
    public String getNombres() { return txtNombres.getText().trim(); }
    public String getApellidos() { return txtApellidos.getText().trim(); }
    public String getFechaNacimiento() { return txtFechaNacimiento.getText().trim(); }
    public String getEdad() { return txtEdad.getText().trim(); }
    public String getGenero() { return (String) cbGenero.getSelectedItem(); }
    public String getTelFijo() { return txtTelFijo.getText().trim(); }
    public String getTelCelular() { return txtTelCelular.getText().trim(); }
    public String getCorreo() { return txtCorreo.getText().trim(); }
    public String getDireccion() { return txtDireccion.getText().trim(); }
    public String getEps() { return (String) cbEps.getSelectedItem(); }
    public String getRegimen() { return (String) cbRegimen.getSelectedItem(); }
    public String getOcupacion() { return txtOcupacion.getText().trim(); }
    public String getEstadoCivil() { return (String) cbEstadoCivil.getSelectedItem(); }
    public String getCondMed() { return (String) cbCondMed.getSelectedItem(); }
    public String getObservaciones() { return txtObservaciones.getText().trim(); }

    //Acceso para el controlador
    public JButton getBtnGuardar() { return btnGuardar; }
    public JButton getBtnCancelar() { return btnCancelar; }

    public void limpiar() {
        cbTipoDocumento.setSelectedIndex(0);
        txtNumDocumento.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtFechaNacimiento.setText("");
        txtEdad.setText("");
        cbGenero.setSelectedIndex(0);
        txtTelFijo.setText("");
        txtTelCelular.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        cbEps.setSelectedIndex(0);
        cbRegimen.setSelectedIndex(0);
        txtOcupacion.setText("");
        cbEstadoCivil.setSelectedIndex(0);
        cbCondMed.setSelectedIndex(0);
        txtObservaciones.setText("");
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
}
