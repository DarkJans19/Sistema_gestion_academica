package dominio;

import java.time.LocalDate;

public class LogroEstudiante {
    private int idLogroEstudiante;
    private Estudiante estudiante;
    private LocalDate fechaLogro;
    private Logro logro;
    private PeriodoAcademico periodoAcademico;
    private Profesor profesor;

    public LogroEstudiante() {}

    public LogroEstudiante(int idLogroEstudiante, Estudiante estudiante, LocalDate fechaLogro, Logro logro, PeriodoAcademico periodoAcademico, Profesor profesor) {
        this.idLogroEstudiante = idLogroEstudiante;
        this.estudiante = estudiante;
        this.fechaLogro = fechaLogro;
        this.logro = logro;
        this.periodoAcademico = periodoAcademico;
        this.profesor = profesor;
    }

    public int getIdLogroEstudiante() { return idLogroEstudiante; }
    public void setIdLogroEstudiante(int id) { this.idLogroEstudiante = id; }
    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }
    public LocalDate getFechaLogro() { return fechaLogro; }
    public void setFechaLogro(LocalDate fechaLogro) { this.fechaLogro = fechaLogro; }
    public Logro getLogro() { return logro; }
    public void setLogro(Logro logro) { this.logro = logro; }
    public PeriodoAcademico getPeriodoAcademico() { return periodoAcademico; }
    public void setPeriodoAcademico(PeriodoAcademico periodo) { this.periodoAcademico = periodo; }
    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }
}