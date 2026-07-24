package dominio;

import java.time.LocalDateTime;
import dominio.enums.EstadoHorarioEntrevista;

public class HorarioEntrevista {
    private int idHorarioEntrevista;
    private EstadoHorarioEntrevista estadoHorarioEntrevista;
    private LocalDateTime inicioHorario;
    private LocalDateTime finHorario;

    public HorarioEntrevista() {}

    public HorarioEntrevista(int idHorarioEntrevista, EstadoHorarioEntrevista estadoHorarioEntrevista, LocalDateTime inicioHorario, LocalDateTime finHorario) {
        this.idHorarioEntrevista = idHorarioEntrevista;
        this.estadoHorarioEntrevista = estadoHorarioEntrevista;
        this.inicioHorario = inicioHorario;
        this.finHorario = finHorario;
    }

    public void liberar() {
        estadoHorarioEntrevista = EstadoHorarioEntrevista.DISPONIBLE;
    }

    public void reservar() {
        estadoHorarioEntrevista = EstadoHorarioEntrevista.OCUPADO;
    }

    public boolean validarHorario(LocalDateTime inicioHorario, LocalDateTime finHorario) {
        if (inicioHorario.isBefore(finHorario)){
            return true;
        }
        return false;
    }

    public int getIdHorarioEntrevista() { return idHorarioEntrevista; }
    public void setIdHorarioEntrevista(int idHorarioEntrevista) { this.idHorarioEntrevista = idHorarioEntrevista; }
    public EstadoHorarioEntrevista getEstadoHorarioEntrevista() { return estadoHorarioEntrevista; }
    public void setEstadoHorarioEntrevista(EstadoHorarioEntrevista estadoHorarioEntrevista) { this.estadoHorarioEntrevista = estadoHorarioEntrevista; }
    public LocalDateTime getInicioHorario() { return inicioHorario; }
    public void setInicioHorario(LocalDateTime inicioHorario) { this.inicioHorario = inicioHorario; }
    public LocalDateTime getFinHorario() { return finHorario; }
    public void setFinHorario(LocalDateTime finHorario) { this.finHorario = finHorario; }
}
