package pg.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Factura;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.repository.FacturaRepository;

@ApplicationScoped 
public class FacturaRepositoryImpl implements FacturaRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Factura factura) {
        this.entityManager.persist(factura);

      }

    @Override
    public Optional <Factura> read(Integer id) {
        Factura factura = this.entityManager.find(Factura.class, id); 
        return Optional.ofNullable(factura);
        }

    @Override
    public void update(Factura factura) {
        this.entityManager.merge(factura);
        }

    @Override
    public void delete(Integer id) {
        Optional<Factura> factura = this.read(id);
        factura.ifPresent(this.entityManager::remove);
    }

    @Override
    public Optional<Factura> readByNumber(String numero) {
    
        TypedQuery <Factura> query = this.entityManager.createQuery("SELECT f FROM factura f WHERE f.numero = :numeroVariable", Factura.class); 
        query.setParameter("numeroVariable", numero);
        return Optional.ofNullable(query.getSingleResult());
    }

    @Override
    public List<Factura> readAll() {
  return null;
    }

}
