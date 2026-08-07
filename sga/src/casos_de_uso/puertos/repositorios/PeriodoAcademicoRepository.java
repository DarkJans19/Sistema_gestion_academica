package casos_de_uso.puertos.repositorios;
import dominio.PeriodoAcademico;

import java.time.LocalDate;

public interface PeriodoAcademicoRepository extends RepositorioGenerico<PeriodoAcademico> {
    PeriodoAcademico buscarActivo();
    PeriodoAcademico buscarPorRangoFechas(LocalDate fechaInicio, LocalDate fechaFin);
}