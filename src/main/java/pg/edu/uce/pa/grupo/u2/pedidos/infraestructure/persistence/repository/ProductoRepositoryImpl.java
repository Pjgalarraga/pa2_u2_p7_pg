package pg.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
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
    public Optional <Producto> read(Integer id) {
        Producto producto = this.entityManager.find(Producto.class, id);
        return Optional.ofNullable(producto);
         }

    @Override
    public void update(Producto producto) {
        this.entityManager.merge(producto);
      }

    @Override
    public void delete(Integer id) {
         Optional<Producto> producto = this.read(id);

       producto.ifPresent(this.entityManager::remove);
        }

    @Override
    public Optional<Producto> readByNumber(String numero) {
      TypedQuery<Producto> query = this.entityManager.createQuery("SELECT p FROM Producto p WHERE p.numero = :numeroVariable", Producto.class);
      query.setParameter("numeroVariable", numero);
      return Optional.ofNullable(query.getSingleResult());
    }

    @Override
    public List<Producto> readAll() {
    return null;
 }

}
