package casos_de_uso.puertos.repositorios;
import dominio.Reporte;
import java.util.List;

public interface ReportesRepository extends RepositorioGenerico<Reporte> {
    List<Reporte> buscarPorEstudiante(int idEstudiante);
    List<Reporte> buscarPorEstudianteYPeriodo(int idEstudiante, int idPeriodo);
}
