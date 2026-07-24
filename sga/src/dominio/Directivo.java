package dominio;

public class Directivo extends Persona {
    private int idDirectivo;

    public Directivo() {}

    public Directivo(int idPersona, String primerApellido, String primerNombre, String segundoApellido, String segundoNombre, Usuario usuario, int idDirectivo) {
        super(idPersona, primerApellido, primerNombre, segundoApellido, segundoNombre, usuario);
        this.idDirectivo = idDirectivo;
    }

    public int getIdDirectivo() { return idDirectivo; }
    public void setIdDirectivo(int idDirectivo) { this.idDirectivo = idDirectivo; }
}