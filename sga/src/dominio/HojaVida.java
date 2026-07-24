package dominio;

public class HojaVida {
    private int idHojaVida;
    private String alergias;
    private String aspectosRelevantes;
    private String enfermedades;
    private Estudiante estudiante;

    public HojaVida() {}

    public HojaVida(int idHojaVida, String alergias, String aspectosRelevantes, String enfermedades, Estudiante estudiante) {
        this.idHojaVida = idHojaVida;
        this.alergias = alergias;
        this.aspectosRelevantes = aspectosRelevantes;
        this.enfermedades = enfermedades;
        this.estudiante = estudiante;
    }

    public int getIdHojaVida() { return idHojaVida; }
    public void setIdHojaVida(int idHojaVida) { this.idHojaVida = idHojaVida; }
    public String getAlergias() { return alergias; }
    public void setAlergias(String alergias) { this.alergias = alergias; }
    public String getAspectosRelevantes() { return aspectosRelevantes; }
    public void setAspectosRelevantes(String aspectosRelevantes) { this.aspectosRelevantes = aspectosRelevantes; }
    public String getEnfermedades() { return enfermedades; }
    public void setEnfermedades(String enfermedades) { this.enfermedades = enfermedades; }
    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }
}