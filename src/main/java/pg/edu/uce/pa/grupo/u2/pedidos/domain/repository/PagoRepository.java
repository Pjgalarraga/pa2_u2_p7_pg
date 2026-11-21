package pg.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Factura;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pago;

public interface PagoRepository {

     
         // Create
    public void create(Pago pago);

    // Read por id
    public Pago read(Integer id);

    // Update
    public void update(Pago pago);

    // Delete
    public void delete(Integer id);
    

}
