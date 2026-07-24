package dominio;

import java.util.List;

public class Observador {
    private int idObservador;
    private Estudiante estudiante;
    private List<Observacion> observaciones;
    private PeriodoAcademico periodoAcademico;

    public Observador() {}

    public Observador(int idObservador, Estudiante estudiante, List<Observacion> observaciones, PeriodoAcademico periodoAcademico) {
        this.idObservador = idObservador;
        this.estudiante = estudiante;
        this.observaciones = observaciones;
        this.periodoAcademico = periodoAcademico;
    }

    public void añadirObservacion(Observacion observacion) {
        observaciones.add(observacion);
    }
    
    public void eliminarObservacion(Observacion observacion) {
        observaciones.remove(observacion);
    }

    public int getIdObservador() { return idObservador; }
    public void setIdObservador(int idObservador) { this.idObservador = idObservador; }
    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }
    public List<Observacion> getObservaciones() { return observaciones; }
    public void setObservaciones(List<Observacion> observaciones) { this.observaciones = observaciones; }
    public PeriodoAcademico getPeriodoAcademico() { return periodoAcademico; }
    public void setPeriodoAcademico(PeriodoAcademico periodo) { this.periodoAcademico = periodo; }
}