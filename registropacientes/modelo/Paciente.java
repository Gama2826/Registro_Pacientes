package registropacientes.modelo;

public class Paciente {
    private int tipoDocumento = 0;
    private String numDocumento = "0";
    private String nombres = "0";
    private String apellidos = "0";
    private String fechaNacimiento = "0";
    private int edad = 0;
    private String genero = "0";
    private String telFijo = "0";
    private String telCelular = "0";
    private String correo = "0";
    private String direccion = "0";
    private String eps = "0";
    private String regimen = "0";
    private String ocupacion = "0";
    private String estadoCivil = "0";
    private String condMed = "0";
    private String observaciones = "0";

    public Paciente(int tipoDocumento,
            String numDocumento,
            String nombres,
            String apellidos,
            String fechaNacimiento,
            int edad,
            String genero,
            String telFijo,
            String telCelular,
            String correo,
            String direccion,
            String eps,
            String regimen,
            String ocupacion,
            String estadoCivil,
            String condMed,
            String observaciones) {
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.genero = genero;
        this.telFijo = telFijo;
        this.telCelular = telCelular;
        this.correo = correo;
        this.direccion = direccion;
        this.eps = eps;
        this.regimen = regimen;
        this.ocupacion = ocupacion;
        this.estadoCivil = estadoCivil;
        this.condMed = condMed;
        this.observaciones = observaciones;
    }

    public int getTipoDocumento() { return tipoDocumento; }
    public String getNumDocumento() { return numDocumento; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    public int getEdad() { return edad; }
    public String getGenero() { return genero; }
    public String getTelFijo() { return telFijo; }
    public String getTelCelular() { return telCelular; }
    public String getCorreo() { return correo; }
    public String getDireccion() { return direccion; }
    public String getEps() { return eps; }
    public String getRegimen() { return regimen; }
    public String getOcupacion() { return ocupacion; }
    public String getEstadoCivil() { return estadoCivil; }
    public String getCondMed() { return condMed; }
    public String getObservaciones() { return observaciones; }
}