package pg.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.DetallePedido;

public interface DetallePedidoRepository {

         // Create
    public void create(DetallePedido detallePedido);

    // Read por id
    public DetallePedido read(Integer id);

    // Update
    public void update(DetallePedido detallePedido);

    // Delete
    public void delete(Integer id);


}
