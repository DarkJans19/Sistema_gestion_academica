package casos_de_uso.puertos.repositorios;
import dominio.Grupo;
import java.util.List;

public interface GrupoRepository extends RepositorioGenerico<Grupo> {
    List<Grupo> buscarPorGrado(int idGrado);
    List<Grupo> buscarSinDirector();
    int contarEstudiantesActivos(int idGrupo);
}