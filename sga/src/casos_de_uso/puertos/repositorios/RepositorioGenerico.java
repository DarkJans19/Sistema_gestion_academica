package casos_de_uso.puertos.repositorios;

import java.util.Optional;

public interface RepositorioGenerico<T> {
    Optional<T> actualizar(T entidad);
    Optional<T> consultarPorId(int id);
    void eliminar(T entidad);
    T guardar(T entidad);
}