package casos_de_uso.puertos.repositorios;
import dominio.Logro;
import java.util.List;

public interface LogroRepository extends RepositorioGenerico<Logro> {
    List<Logro> buscarPorCategoria(int idCategoriaLogros);
}