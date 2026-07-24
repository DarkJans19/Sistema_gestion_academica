package dominio;

import java.util.List;

public class Grado {
    private int idGrado;
    private String nombreGrado;
    private List<Grupo> grupos;

    public Grado() {}

    public Grado(int idGrado, String nombreGrado, List<Grupo> grupos) {
        this.idGrado = idGrado;
        this.nombreGrado = nombreGrado;
        this.grupos = grupos;
    }

    public void añadirGrupo(Grupo grupo) {
        grupos.add(grupo);
    }
    public void eliminarGrupo(Grupo grupo) {
        grupos.remove(grupo);
    }

    public int getIdGrado() { return idGrado; }
    public void setIdGrado(int idGrado) { this.idGrado = idGrado; }
    public String getNombreGrado() { return nombreGrado; }
    public void setNombreGrado(String nombreGrado) { this.nombreGrado = nombreGrado; }
    public List<Grupo> getGrupos() { return grupos; }
    public void setGrupos(List<Grupo> grupos) { this.grupos = grupos; }
}