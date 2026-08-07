package casos_de_uso.puertos.repositorios;
import dominio.HorarioEntrevista;

import java.util.List;
import java.time.LocalDateTime;

public interface HorarioEntrevistasRepository extends RepositorioGenerico<HorarioEntrevista> {
    List<HorarioEntrevista> buscarDisponibles(LocalDateTime fechaInicio, LocalDateTime fechaFin);
}