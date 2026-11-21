package pg.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Producto;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.repository.ProductoRepository;

@ApplicationScoped 
public class ProductoRepositoryImpl implements ProductoRepository {

    @Inject 
    private  EntityManager entityManager;

    @Override
    public void create(Producto producto) {
        this.entityManager.persist(producto);
         }

    @Override
    public Producto read(Integer id) {
        return this.entityManager.find(Producto.class, id);
         }

    @Override
    public void update(Producto producto) {
        this.entityManager.merge(producto);
      }

    @Override
    public void delete(Integer id) {
        this.entityManager.remove(this.read(id));
        }

}
