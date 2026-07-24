package dominio;

import dominio.enums.EstadoEntrevista;;

public class Entrevista {
    private int idEntrevista;
    private EstadoEntrevista estadoEntrevista;
    private HorarioEntrevista horarioEntrevista;

    public Entrevista() {}

    public Entrevista(int idEntrevista, EstadoEntrevista estadoEntrevista, HorarioEntrevista horarioEntrevista) {
        this.idEntrevista = idEntrevista;
        this.estadoEntrevista = estadoEntrevista;
        this.horarioEntrevista = horarioEntrevista;
    }

    public void cancelarEntrevista() {}
    public void marcarRealizada() {}
    public void programarEntrevista(HorarioEntrevista horarioEntrevista) {}

    public int getIdEntrevista() { return idEntrevista; }
    public void setIdEntrevista(int idEntrevista) { this.idEntrevista = idEntrevista; }
    public EstadoEntrevista getEstadoEntrevista() { return estadoEntrevista; }
    public void setEstadoEntrevista(EstadoEntrevista estadoEntrevista) { this.estadoEntrevista = estadoEntrevista; }
    public HorarioEntrevista getHorarioEntrevista() { return horarioEntrevista; }
    public void setHorarioEntrevista(HorarioEntrevista horarioEntrevista) { this.horarioEntrevista = horarioEntrevista; }
}