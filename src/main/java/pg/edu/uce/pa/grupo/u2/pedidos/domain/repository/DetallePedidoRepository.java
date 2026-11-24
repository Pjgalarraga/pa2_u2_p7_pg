package pg.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.DetallePedido;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;

public interface DetallePedidoRepository {

         // Create
    public void create(DetallePedido detallePedido);

    // Read por id
     public Optional<DetallePedido> read(Integer id);

    public Optional<DetallePedido> readByNumber(String numero);
    
    public List<DetallePedido> readAll();

    // Update
    public void update(DetallePedido detallePedido);

    // Delete
    public void delete(Integer id);


}
