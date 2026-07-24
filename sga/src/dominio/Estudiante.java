package dominio;

import java.util.List;
import dominio.enums.EstadoEstudiante;

public class Estudiante extends Persona {
    private int idEstudiante;
    private List<AcudienteEstudiante> acudientes;
    private EstadoEstudiante estadoEstudiante;
    private Grado grado;
    private Grupo grupo;

    public Estudiante() {}

    public Estudiante(int idPersona, String primerApellido, String primerNombre, String segundoApellido, String segundoNombre, Usuario usuario, int idEstudiante, List<AcudienteEstudiante> acudientes, EstadoEstudiante estadoEstudiante, Grado grado, Grupo grupo) {
        super(idPersona, primerApellido, primerNombre, segundoApellido, segundoNombre, usuario);
        this.idEstudiante = idEstudiante;
        this.acudientes = acudientes;
        this.estadoEstudiante = estadoEstudiante;
        this.grado = grado;
        this.grupo = grupo;
    }

    // Logica de negocio
    
    public void activar() {
        estadoEstudiante = EstadoEstudiante.ACTIVO;
    }

    public void agregarAcudiente(AcudienteEstudiante acudiente) {
        acudientes.add(acudiente);
    }

    public void asignarAcudientePrincipal(AcudienteEstudiante acudientePrincipal) {
        for (AcudienteEstudiante acudiente : acudientes){
            if (acudiente.equals(acudientePrincipal)){
                acudiente.marcarPrincipal();
            }
            else{
                acudiente.quitarPrincipal();
            }
        }
    }
    
    public void eliminarAcudiente(AcudienteEstudiante acudiente) {
        acudientes.remove(acudiente);
    }
    
    public void mandarVacaciones() {
        estadoEstudiante = EstadoEstudiante.VACACIONES;
    }
    
    public void retirar() {
        estadoEstudiante = EstadoEstudiante.RETIRADO;
    }

    // Getters y setters
    public int getIdEstudiante() { return idEstudiante; }
    public void setIdEstudiante(int idEstudiante) { this.idEstudiante = idEstudiante; }
    public List<AcudienteEstudiante> getAcudientes() { return acudientes; }
    public void setAcudientes(List<AcudienteEstudiante> acudientes) { this.acudientes = acudientes; }
    public EstadoEstudiante getEstadoEstudiante() { return estadoEstudiante; }
    public void setEstadoEstudiante(EstadoEstudiante estadoEstudiante) { this.estadoEstudiante = estadoEstudiante; }
    public Grado getGrado() { return grado; }
    public void setGrado(Grado grado) { this.grado = grado; }
    public Grupo getGrupo() { return grupo; }
    public void setGrupo(Grupo grupo) { this.grupo = grupo; }
}