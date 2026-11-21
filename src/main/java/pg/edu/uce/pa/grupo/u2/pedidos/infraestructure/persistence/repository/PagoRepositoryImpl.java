package pg.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
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
    public Pago read(Integer id) {
        return this.entityManage.find(Pago.class, id);
       }

    @Override
    public void update(Pago pago) {

        this.entityManage.merge(pago);

        }

    @Override
    public void delete(Integer id) {
        this.entityManage.remove(this.read(id));
       }

}
