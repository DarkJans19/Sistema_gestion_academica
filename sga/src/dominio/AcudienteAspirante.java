package dominio;

public class AcudienteAspirante {
    private int idAcudienteAspirante;
    private Acudiente acudiente;
    private String correoElectronico;
    private boolean esPrincipal;
    private String parentesco;
    private String primerApellido;
    private String primerNombre;
    private String segundoApellido;
    private String segundoNombre;
    private String telefono;

    public AcudienteAspirante() {}

    public AcudienteAspirante(int idAcudienteAspirante, Acudiente acudiente, String correoElectronico, boolean esPrincipal, String parentesco, String primerApellido, String primerNombre, String segundoApellido, String segundoNombre, String telefono) {
        this.idAcudienteAspirante = idAcudienteAspirante;
        this.acudiente = acudiente;
        this.correoElectronico = correoElectronico;
        this.esPrincipal = esPrincipal;
        this.parentesco = parentesco;
        this.primerApellido = primerApellido;
        this.primerNombre = primerNombre;
        this.segundoApellido = segundoApellido;
        this.segundoNombre = segundoNombre;
        this.telefono = telefono;
    }

    public int getIdAcudienteAspirante() { return idAcudienteAspirante; }
    public void setIdAcudienteAspirante(int id) { this.idAcudienteAspirante = id; }
    public Acudiente getAcudiente() { return acudiente; }
    public void setAcudiente(Acudiente acudiente) { this.acudiente = acudiente; }
    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correo) { this.correoElectronico = correo; }
    public boolean isEsPrincipal() { return esPrincipal; }
    public void setEsPrincipal(boolean esPrincipal) { this.esPrincipal = esPrincipal; }
    public String getParentesco() { return parentesco; }
    public void setParentesco(String parentesco) { this.parentesco = parentesco; }
    public String getPrimerApellido() { return primerApellido; }
    public void setPrimerApellido(String primerApellido) { this.primerApellido = primerApellido; }
    public String getPrimerNombre() { return primerNombre; }
    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }
    public String getSegundoApellido() { return segundoApellido; }
    public void setSegundoApellido(String segundoApellido) { this.segundoApellido = segundoApellido; }
    public String getSegundoNombre() { return segundoNombre; }
    public void setSegundoNombre(String segundoNombre) { this.segundoNombre = segundoNombre; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}