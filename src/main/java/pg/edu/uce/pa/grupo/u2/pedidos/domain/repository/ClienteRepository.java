package pg.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;

public interface ClienteRepository {
        // Create
    public void create(Cliente cliente);

    // Read por id
     public Optional<Cliente> read(Integer id);

    public Optional<Cliente> readByNumber(String numero);
    
    public List<Cliente> readAll();

    // Update
    public void update(Cliente pedido);

    // Delete
    public void delete(Integer id);

}
