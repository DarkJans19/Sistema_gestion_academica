package dominio;

public class CategoriaLogro {
    private int idCategoriaLogro;
    private String nombreCategoriaLogro;

    public CategoriaLogro() {}

    public CategoriaLogro(int idCategoriaLogro, String nombreCategoriaLogro) {
        this.idCategoriaLogro = idCategoriaLogro;
        this.nombreCategoriaLogro = nombreCategoriaLogro;
    }

    public int getIdCategoriaLogro() { return idCategoriaLogro; }
    public void setIdCategoriaLogro(int idCategoriaLogro) { this.idCategoriaLogro = idCategoriaLogro; }
    public String getNombreCategoriaLogro() { return nombreCategoriaLogro; }
    public void setNombreCategoriaLogro(String nombre) { this.nombreCategoriaLogro = nombre; }
}
