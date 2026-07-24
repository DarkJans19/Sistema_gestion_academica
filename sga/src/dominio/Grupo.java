package dominio;

import java.util.List;

public class Grupo {
    private int idGrupo;
    private Profesor directorGrupo;
    private String nombreGrupo;
    private List<Profesor> profesores;

    public Grupo() {}

    public Grupo(int idGrupo, Profesor directorGrupo, String nombreGrupo, List<Profesor> profesores) {
        this.idGrupo = idGrupo;
        this.directorGrupo = directorGrupo;
        this.nombreGrupo = nombreGrupo;
        this.profesores = profesores;
    }

    public void añadirProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void eliminarProfesor(Profesor profesor) {
        profesores.remove(profesor);
    }

    // Bueno que esto es practicamente lo mismo que setDirector
    public void establecerDirector(Profesor profesor) {
        directorGrupo = profesor;
    }

    public int getIdGrupo() { return idGrupo; }
    public void setIdGrupo(int idGrupo) { this.idGrupo = idGrupo; }
    public Profesor getDirectorGrupo() { return directorGrupo; }
    public void setDirectorGrupo(Profesor directorGrupo) { this.directorGrupo = directorGrupo; }
    public String getNombreGrupo() { return nombreGrupo; }
    public void setNombreGrupo(String nombreGrupo) { this.nombreGrupo = nombreGrupo; }
    public List<Profesor> getProfesores() { return profesores; }
    public void setProfesores(List<Profesor> profesores) { this.profesores = profesores; }
}