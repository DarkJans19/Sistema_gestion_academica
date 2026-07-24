package dominio;

import java.util.List;

public class Reporte {
    private int idReporte;
    private String descripcionReporte;
    private Estudiante estudiante;
    private List<LogroEstudiante> logrosEstudiante;
    private String nombreReporte;
    private PeriodoAcademico periodoAcademico;
    private Profesor profesor;

    public Reporte() {}

    public Reporte(int idReporte, String descripcionReporte, Estudiante estudiante, List<LogroEstudiante> logrosEstudiante, String nombreReporte, PeriodoAcademico periodoAcademico, Profesor profesor) {
        this.idReporte = idReporte;
        this.descripcionReporte = descripcionReporte;
        this.estudiante = estudiante;
        this.logrosEstudiante = logrosEstudiante;
        this.nombreReporte = nombreReporte;
        this.periodoAcademico = periodoAcademico;
        this.profesor = profesor;
    }

    public void agregarLogroEstudiante(LogroEstudiante logroEstudiante) {
        logrosEstudiante.add(logroEstudiante);
    }
    
    public void eliminarLogroEstudiante(LogroEstudiante logroEstudiante) {
        logrosEstudiante.remove(logroEstudiante);
    }

    public int getIdReporte() { return idReporte; }
    public void setIdReporte(int idReporte) { this.idReporte = idReporte; }
    public String getDescripcionReporte() { return descripcionReporte; }
    public void setDescripcionReporte(String descripcion) { this.descripcionReporte = descripcion; }
    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }
    public List<LogroEstudiante> getLogrosEstudiante() { return logrosEstudiante; }
    public void setLogrosEstudiante(List<LogroEstudiante> logros) { this.logrosEstudiante = logros; }
    public String getNombreReporte() { return nombreReporte; }
    public void setNombreReporte(String nombre) { this.nombreReporte = nombre; }
    public PeriodoAcademico getPeriodoAcademico() { return periodoAcademico; }
    public void setPeriodoAcademico(PeriodoAcademico periodo) { this.periodoAcademico = periodo; }
    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }
}