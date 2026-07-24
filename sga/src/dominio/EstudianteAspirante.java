package dominio;

import dominio.enums.EstadoAprobacion;

public class EstudianteAspirante {
    private int idEstudianteAspirante;
    private int edad;
    private EstadoAprobacion estadoAprobacion;
    private Grado gradoAspira;
    private String primerApellido;
    private String primerNombre;
    private String segundoApellido;
    private String segundoNombre;

    public EstudianteAspirante() {}

    public EstudianteAspirante(int idEstudianteAspirante, int edad, EstadoAprobacion estadoAprobacion, Grado gradoAspira, String primerApellido, String primerNombre, String segundoApellido, String segundoNombre) {
        this.idEstudianteAspirante = idEstudianteAspirante;
        this.edad = edad;
        this.estadoAprobacion = estadoAprobacion;
        this.gradoAspira = gradoAspira;
        this.primerApellido = primerApellido;
        this.primerNombre = primerNombre;
        this.segundoApellido = segundoApellido;
        this.segundoNombre = segundoNombre;
    }

    public void aprobar() {
        estadoAprobacion = EstadoAprobacion.APROBADO;
    }

    public void desistirProceso() {
        estadoAprobacion = EstadoAprobacion.CANCELADO;
    }

    public void ponerEnEspera() {
        estadoAprobacion = EstadoAprobacion.EN_ESPERA;
    }

    public void ponerEnPendiente() {
        estadoAprobacion = EstadoAprobacion.PENDIENTE;
    }
    public void rechazar() {
        estadoAprobacion = EstadoAprobacion.RECHAZADO;
    }

    public int getIdEstudianteAspirante() { return idEstudianteAspirante; }
    public void setIdEstudianteAspirante(int id) { this.idEstudianteAspirante = id; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public EstadoAprobacion getEstadoAprobacion() { return estadoAprobacion; }
    public void setEstadoAprobacion(EstadoAprobacion estadoAprobacion) { this.estadoAprobacion = estadoAprobacion; }
    public Grado getGradoAspira() { return gradoAspira; }
    public void setGradoAspira(Grado gradoAspira) { this.gradoAspira = gradoAspira; }
    public String getPrimerApellido() { return primerApellido; }
    public void setPrimerApellido(String primerApellido) { this.primerApellido = primerApellido; }
    public String getPrimerNombre() { return primerNombre; }
    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }
    public String getSegundoApellido() { return segundoApellido; }
    public void setSegundoApellido(String segundoApellido) { this.segundoApellido = segundoApellido; }
    public String getSegundoNombre() { return segundoNombre; }
    public void setSegundoNombre(String segundoNombre) { this.segundoNombre = segundoNombre; }
}