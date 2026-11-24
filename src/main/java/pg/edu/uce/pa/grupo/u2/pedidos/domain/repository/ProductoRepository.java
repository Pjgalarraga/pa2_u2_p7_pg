package pg.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Producto;

public interface ProductoRepository {
     // Create
    public void create(Producto producto);

    // Read por id
    public Optional<Producto> read(Integer id);

    public Optional<Producto> readByNumber(String numero);
    
    public List<Producto> readAll();
    // Update
    public void update(Producto producto);

    // Delete
    public void delete(Integer id);

}
