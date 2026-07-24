package dominio;

import java.util.List;
import java.time.LocalDateTime;

public class Preinscripcion {
    private int idPreinscripcion;
    private LocalDateTime fechaPreinscripcion;
    private List<AcudienteAspirante> acudientesAspirantes;
    private List<Entrevista> entrevistas;
    private List<EstudianteAspirante> estudiantesAspirantes;

    public Preinscripcion() {}

    public Preinscripcion(int idPreinscripcion, LocalDateTime fechaPreinscripcion, List<AcudienteAspirante> acudientesAspirantes, List<Entrevista> entrevistas, List<EstudianteAspirante> estudiantesAspirantes) {
        this.idPreinscripcion = idPreinscripcion;
        this.fechaPreinscripcion = fechaPreinscripcion;
        this.acudientesAspirantes = acudientesAspirantes;
        this.entrevistas = entrevistas;
        this.estudiantesAspirantes = estudiantesAspirantes;
    }

    public void agregarAcudienteAspirante(AcudienteAspirante acudienteAspirante) {}
    public void agregarEntrevista(Entrevista entrevista) {}
    public void agregarEstudianteAspirante(EstudianteAspirante estudianteAspirante) {}
    public void eliminarAcudienteAspirante(AcudienteAspirante acudienteAspirante) {}
    public void eliminarEntrevista(Entrevista entrevista) {}
    public void eliminarEstudianteAspirante(EstudianteAspirante estudianteAspirante) {}
    public void evaluarEstado(EstudianteAspirante estudianteAspirante) {}

    public int getIdPreinscripcion() { return idPreinscripcion; }
    public void setIdPreinscripcion(int idPreinscripcion) { this.idPreinscripcion = idPreinscripcion; }
    public LocalDateTime getFechaPreinscripcion() { return fechaPreinscripcion; }
    public void setFechaPreinscripcion(LocalDateTime fechaPreinscripcion) { this.fechaPreinscripcion = fechaPreinscripcion; }
    public List<AcudienteAspirante> getAcudientesAspirantes() { return acudientesAspirantes; }
    public void setAcudientesAspirantes(List<AcudienteAspirante> acudientesAspirantes) { this.acudientesAspirantes = acudientesAspirantes; }
    public List<Entrevista> getEntrevistas() { return entrevistas; }
    public void setEntrevistas(List<Entrevista> entrevistas) { this.entrevistas = entrevistas; }
    public List<EstudianteAspirante> getEstudiantesAspirantes() { return estudiantesAspirantes; }
    public void setEstudiantesAspirantes(List<EstudianteAspirante> estudiantesAspirantes) { this.estudiantesAspirantes = estudiantesAspirantes; }
}
