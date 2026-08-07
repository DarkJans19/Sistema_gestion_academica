package casos_de_uso.puertos.repositorios;
import dominio.Observacion;
import dominio.Observador;

import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ObservadorRepository extends RepositorioGenerico<Observador> {
    List<Observacion> buscarObservacionesPorFecha(LocalDate fecha);
    List<Observacion> buscarObservacionPorProfesorYFecha(int idProfesor, LocalDateTime fecha);
    List<Observador> buscarPorEstudiante(int idEstudiante);
    List<Observador> buscarPorEstudianteYPeriodo(int idEstudiante, int idPeriodo);
}
