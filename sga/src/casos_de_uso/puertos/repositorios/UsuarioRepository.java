package casos_de_uso.puertos.repositorios;
import dominio.Usuario;
import dominio.Rol;

import java.util.List;

public interface UsuarioRepository extends RepositorioGenerico<Usuario> {
    boolean existePorCorreo(String correoElectronico);
    Usuario buscarPorNombreUsuario(String nombreUsuario);
    List<Usuario> buscarPorRol(Rol rol);
}