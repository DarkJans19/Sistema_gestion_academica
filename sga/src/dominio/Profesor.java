package dominio;

public class Profesor extends Persona {
    private Integer idProfesor;

    public Profesor(Integer idPersona, String primerNombre, String segundoNombre, 
                    String primerApellido, String segundoApellido, Usuario usuario, 
                    Integer idProfesor) {
        
        super(idPersona, primerNombre, segundoNombre, primerApellido, segundoApellido, usuario);
        
        this.idProfesor = idProfesor;
    }

    public int getIdProfesor() { return idProfesor; }
    public void setIdProfesor(int idProfesor) { this.idProfesor = idProfesor; }
}
