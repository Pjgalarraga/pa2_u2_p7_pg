package pg.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;

public interface ClienteRepository {
        // Create
    public void create(Cliente cliente);

    // Read por id
    public Cliente read(Integer id);

    // Update
    public void update(Cliente pedido);

    // Delete
    public void delete(Integer id);

}
