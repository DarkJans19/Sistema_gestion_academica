package dominio;

public class Usuario {
    private int idUsuario;
    private String contraseña;
    private String correoElectronico;
    private String nombreUsuario;
    private Rol rol;
    private String telefono;

    public Usuario() {}

    public Usuario(int idUsuario, String contraseña, String correoElectronico, String nombreUsuario, Rol rol, String telefono) {
        this.idUsuario = idUsuario;
        this.contraseña = contraseña;
        if (!correoElectronico.contains("@")){
            throw new IllegalArgumentException("El correo es invalido");
        }
        this.correoElectronico = correoElectronico;
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
        this.telefono = telefono;
    }

    public boolean validarCredenciales(String credencial) {
        if (credencial.equals(contraseña)){
            return true;
        }
        return false;
    }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }
    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }
    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}