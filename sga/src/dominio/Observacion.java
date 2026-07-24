package dominio;

import java.time.LocalDate;

public class Observacion {
    private int idObservacion;
    private String descripcionObservacion;
    private LocalDate fechaObservacion;
    private Profesor profesor;

    public Observacion() {}

    public Observacion(int idObservacion, String descripcionObservacion, LocalDate fechaObservacion, Profesor profesor) {
        this.idObservacion = idObservacion;
        this.descripcionObservacion = descripcionObservacion;
        this.fechaObservacion = fechaObservacion;
        this.profesor = profesor;
    }

    public int getIdObservacion() { return idObservacion; }
    public void setIdObservacion(int idObservacion) { this.idObservacion = idObservacion; }
    public String getDescripcionObservacion() { return descripcionObservacion; }
    public void setDescripcionObservacion(String descripcion) { this.descripcionObservacion = descripcion; }
    public LocalDate getFechaObservacion() { return fechaObservacion; }
    public void setFechaObservacion(LocalDate fechaObservacion) { this.fechaObservacion = fechaObservacion; }
    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }
}
