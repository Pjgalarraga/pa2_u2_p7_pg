package pg.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Factura;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pago;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;

public interface PagoRepository {

     
         // Create
    public void create(Pago pago);

    public Optional<Pago> read(Integer id);

    public Optional<Pago> readByNumber(String numero);
    
    public List<Pago> readAll();

    // Update
    public void update(Pago pago);

    // Delete
    public void delete(Integer id);
    

}
