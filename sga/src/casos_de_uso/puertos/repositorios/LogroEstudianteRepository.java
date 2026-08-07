package casos_de_uso.puertos.repositorios;
import dominio.LogroEstudiante;

import java.util.List;
import java.time.LocalDate;

public interface LogroEstudianteRepository extends RepositorioGenerico<LogroEstudiante> {
    List<LogroEstudiante> buscarPorBibliotecaYVentanaFecha(int idBibliotecaLogro, LocalDate fechaInicio, LocalDate fechaFin);
    List<LogroEstudiante> buscarPorEstudiante(int idEstudiante);
    List<LogroEstudiante> buscarPorEstudianteYPeriodo(int idEstudiante, int idPeriodoAcademico);
    List<LogroEstudiante> buscarPorLogroYVentanaFecha(int idLogro, LocalDate fechaInicio, LocalDate fechaFin);
}
