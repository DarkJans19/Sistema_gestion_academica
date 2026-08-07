package casos_de_uso.puertos.repositorios;
import dominio.EstudianteAspirante;
import dominio.enums.EstadoAprobacion;

import java.util.List;

public interface EstudianteAspiranteRepository extends RepositorioGenerico<EstudianteAspirante> {
    List<EstudianteAspirante> consultarPorEstadoAspirante(EstadoAprobacion estadoAprobacion);
}