package dominio;

public class AcudienteEstudiante {
    private int idAcudienteEstudiante;
    private Acudiente acudiente;
    private boolean esPrincipal;
    private Estudiante estudiante;
    private String parentesco;

    public AcudienteEstudiante() {}

    public AcudienteEstudiante(int idAcudienteEstudiante, Acudiente acudiente, boolean esPrincipal, Estudiante estudiante, String parentesco) {
        this.idAcudienteEstudiante = idAcudienteEstudiante;
        this.acudiente = acudiente;
        this.esPrincipal = esPrincipal;
        this.estudiante = estudiante;
        this.parentesco = parentesco;
    }

    public void marcarPrincipal() {
        esPrincipal = true;
    }
    public void quitarPrincipal() {
        esPrincipal = false;
    }

    public int getIdAcudienteEstudiante() { return idAcudienteEstudiante; }
    public void setIdAcudienteEstudiante(int id) { this.idAcudienteEstudiante = id; }
    public Acudiente getAcudiente() { return acudiente; }
    public void setAcudiente(Acudiente acudiente) { this.acudiente = acudiente; }
    public boolean isEsPrincipal() { return esPrincipal; }
    public void setEsPrincipal(boolean esPrincipal) { this.esPrincipal = esPrincipal; }
    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }
    public String getParentesco() { return parentesco; }
    public void setParentesco(String parentesco) { this.parentesco = parentesco; }
}