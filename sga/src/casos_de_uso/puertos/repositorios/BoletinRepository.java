package casos_de_uso.puertos.repositorios;
import dominio.Boletin;
import dominio.Estudiante;

import java.util.List;

public interface BoletinRepository extends RepositorioGenerico<Boletin> {
    List<Estudiante> buscarEstudiantesSinBoletin(int idPeriodo);
    Boletin buscarPorEstudiante(int idEstudiante);
    Boletin buscarPorEstudianteYPeriodo(int idEstudiante, int idPeriodo);
}
