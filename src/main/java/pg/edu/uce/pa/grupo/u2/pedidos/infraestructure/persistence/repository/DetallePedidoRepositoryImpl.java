package pg.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.DetallePedido;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.repository.ClienteRepository;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.repository.DetallePedidoRepository;

@ApplicationScoped 
public class DetallePedidoRepositoryImpl implements DetallePedidoRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(DetallePedido detallePedido) {

        this.entityManager.persist(detallePedido);
      }

    @Override
    public Optional <DetallePedido> read(Integer id) {
        DetallePedido detallePedido = this.entityManager.find(DetallePedido.class, id);

        return Optional.ofNullable(detallePedido);
     }

    @Override
    public void update(DetallePedido detallePedido) {
        this.entityManager.merge(detallePedido);
        }

    @Override
    public void delete(Integer id) {
        Optional<DetallePedido> detallePedido = this.read(id);
        detallePedido.ifPresent(this.entityManager::remove);
        }

    @Override
    public Optional<DetallePedido> readByNumber(String numero) {
    
        TypedQuery <DetallePedido> query = this.entityManager.createQuery("SELECT d FROM detallePedido d WHERE d.numero = :numeroVariable", DetallePedido.class);

        query.setParameter("numeroVariable", numero);

        return Optional.ofNullable(query.getSingleResult());
    }
    

    @Override
    public List<DetallePedido> readAll() {
   return null;
}

        


}
