package dominio;

import dominio.enums.EstadoPeriodoAcademico;
import java.time.LocalDate;

public class PeriodoAcademico {
    private int idPeriodoAcademico;
    private EstadoPeriodoAcademico estadoPeriodoAcademico;
    private LocalDate inicioPeriodoAcademico;
    private LocalDate finPeriodoAcademico;

    public PeriodoAcademico() {}

    public PeriodoAcademico(int idPeriodoAcademico, EstadoPeriodoAcademico estadoPeriodoAcademico, LocalDate inicioPeriodoAcademico, LocalDate finPeriodoAcademico) {
        this.idPeriodoAcademico = idPeriodoAcademico;
        this.estadoPeriodoAcademico = estadoPeriodoAcademico;
        this.inicioPeriodoAcademico = inicioPeriodoAcademico;
        this.finPeriodoAcademico = finPeriodoAcademico;
    }

    public void abrirPeriodo() {
        estadoPeriodoAcademico = EstadoPeriodoAcademico.ABIERTO;
    }

    public void cerrarPeriodo() {
        estadoPeriodoAcademico = EstadoPeriodoAcademico.CERRADO; 
    }

    public int getIdPeriodoAcademico() { return idPeriodoAcademico; }
    public void setIdPeriodoAcademico(int idPeriodoAcademico) { this.idPeriodoAcademico = idPeriodoAcademico; }
    public EstadoPeriodoAcademico getEstadoPeriodoAcademico() { return estadoPeriodoAcademico; }
    public void setEstadoPeriodoAcademico(EstadoPeriodoAcademico estadoPeriodoAcademico) { this.estadoPeriodoAcademico = estadoPeriodoAcademico; }
    public LocalDate getInicioPeriodoAcademico() { return inicioPeriodoAcademico; }
    public void setInicioPeriodoAcademico(LocalDate inicio) { this.inicioPeriodoAcademico = inicio; }
    public LocalDate getFinPeriodoAcademico() { return finPeriodoAcademico; }
    public void setFinPeriodoAcademico(LocalDate fin) { this.finPeriodoAcademico = fin; }
}
