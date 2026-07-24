package dominio;

import java.util.List;

public class Boletin {
    private int idBoletin;
    private Estudiante estudiante;
    private List<LogroEstudiante> logros;
    private PeriodoAcademico periodoAcademico;
    private Profesor profesor;

    public Boletin() {}

    public Boletin(int idBoletin, Estudiante estudiante, List<LogroEstudiante> logros, PeriodoAcademico periodoAcademico, Profesor profesor) {
        this.idBoletin = idBoletin;
        this.estudiante = estudiante;
        this.logros = logros;
        this.periodoAcademico = periodoAcademico;
        this.profesor = profesor;
    }

    public void añadirLogro(LogroEstudiante logro) {}

    public int getIdBoletin() { return idBoletin; }
    public void setIdBoletin(int idBoletin) { this.idBoletin = idBoletin; }
    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }
    public List<LogroEstudiante> getLogros() { return logros; }
    public void setLogros(List<LogroEstudiante> logros) { this.logros = logros; }
    public PeriodoAcademico getPeriodoAcademico() { return periodoAcademico; }
    public void setPeriodoAcademico(PeriodoAcademico periodo) { this.periodoAcademico = periodo; }
    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }
}
