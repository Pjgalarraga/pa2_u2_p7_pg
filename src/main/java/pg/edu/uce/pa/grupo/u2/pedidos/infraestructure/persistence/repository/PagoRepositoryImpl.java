package pg.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pago;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.repository.PagoRepository;

@ApplicationScoped 
public class PagoRepositoryImpl implements PagoRepository{

    @Inject 
    private EntityManager entityManage;

    @Override
    public void create(Pago pago) {
        this.entityManage.persist(pago);

       }

    @Override
    public Optional <Pago> read(Integer id) {
        Pago pago = this.entityManage.find(Pago.class, id); 
        return Optional.ofNullable(pago);
       }

    @Override
    public void update(Pago pago) {

        this.entityManage.merge(pago);

        }

    @Override
    public void delete(Integer id) {
       Optional<Pago> pago = this.read(id);
       pago.ifPresent(this.entityManage::remove);
       }

    @Override
    public Optional<Pago> readByNumber(String numero) {
      TypedQuery <Pago> query = this.entityManage.createQuery("SELECT p FROM pago p WHERE p.numero = :numeroVariable", Pago.class);
      query.setParameter("numeroVariable", numero);

      return Optional.ofNullable(query.getSingleResult());
    
    }

    @Override
    public List<Pago> readAll() {
    return null;
 }

}
