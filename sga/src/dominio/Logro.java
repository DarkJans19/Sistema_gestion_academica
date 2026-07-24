package dominio;

public class Logro {
    private int idLogro;
    private CategoriaLogro categoriaLogro;
    private String descripcionLogro;
    private String nombreLogro;

    public Logro() {}

    public Logro(int idLogro, CategoriaLogro categoriaLogro, String descripcionLogro, String nombreLogro) {
        this.idLogro = idLogro;
        this.categoriaLogro = categoriaLogro;
        this.descripcionLogro = descripcionLogro;
        this.nombreLogro = nombreLogro;
    }

    public int getIdLogro() { return idLogro; }
    public void setIdLogro(int idLogro) { this.idLogro = idLogro; }
    public CategoriaLogro getCategoriaLogro() { return categoriaLogro; }
    public void setCategoriaLogro(CategoriaLogro categoria) { this.categoriaLogro = categoria; }
    public String getDescripcionLogro() { return descripcionLogro; }
    public void setDescripcionLogro(String descripcion) { this.descripcionLogro = descripcion; }
    public String getNombreLogro() { return nombreLogro; }
    public void setNombreLogro(String nombre) { this.nombreLogro = nombre; }
}