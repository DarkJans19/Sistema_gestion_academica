package dominio;

public class Acudiente extends Persona {
    private int idAcudiente;

    public Acudiente() {}

    public Acudiente(int idPersona, String primerApellido, String primerNombre, String segundoApellido, String segundoNombre, Usuario usuario, int idAcudiente) {
        super(idPersona, primerApellido, primerNombre, segundoApellido, segundoNombre, usuario);
        this.idAcudiente = idAcudiente;
    }

    public int getIdAcudiente() { return idAcudiente; }
    public void setIdAcudiente(int idAcudiente) { this.idAcudiente = idAcudiente; }
}