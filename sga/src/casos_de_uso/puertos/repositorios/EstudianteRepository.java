package casos_de_uso.puertos.repositorios;
import dominio.Estudiante;
import dominio.enums.EstadoEstudiante;

import java.util.List;

public interface EstudianteRepository extends RepositorioGenerico<Estudiante> {
    List<Estudiante> buscarEstudiantesPorAcudiente(int idAcudiente);
    List<Estudiante> buscarPorEstado(EstadoEstudiante estadoEstudiante);
    List<Estudiante> buscarPorGrado(int idGrado);
    List<Estudiante> buscarPorGrupo(int idGrupo);
    List<Estudiante> buscarSinGrupo();
}
