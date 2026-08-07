package casos_de_uso.puertos.repositorios;
import dominio.Preinscripcion;

import java.util.List;
import java.time.LocalDate;

public interface PreinscripcionRepository extends RepositorioGenerico<Preinscripcion> {
    List<Preinscripcion> buscarPorFecha(LocalDate fecha);
}
