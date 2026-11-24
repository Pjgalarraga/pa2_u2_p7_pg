package pg.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.DetallePedido;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Factura;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;

public interface FacturaRepository {
    
         // Create
    public void create(Factura factura);

    // Read por id
    public Optional<Factura> read(Integer id);

    public Optional<Factura> readByNumber(String numero);
    
    public List<Factura> readAll();

    // Update
    public void update(Factura factura);

    // Delete
    public void delete(Integer id);

}
