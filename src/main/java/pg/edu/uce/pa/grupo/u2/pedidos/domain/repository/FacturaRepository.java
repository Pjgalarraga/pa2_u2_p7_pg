package pg.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.DetallePedido;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Factura;

public interface FacturaRepository {
    
         // Create
    public void create(Factura factura);

    // Read por id
    public Factura read(Integer id);

    // Update
    public void update(Factura factura);

    // Delete
    public void delete(Integer id);

}
