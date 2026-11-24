package pg.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.repository.ClienteRepository;

@ApplicationScoped 
public class ClienteRepositoryImpl implements  ClienteRepository{


    @Inject 
  private  EntityManager entityManager;


    @Override
    public void create(Cliente cliente) {
   this.entityManager.persist(cliente);
    }

    @Override
    public Optional <Cliente> read(Integer id) {
        Cliente pedido = this.entityManager.find(Cliente.class, id);

        return Optional.ofNullable(pedido);
   
    }

    @Override
    public void update(Cliente pedido) {

        this.entityManager.merge(pedido);
     
    }

    @Override
    public void delete(Integer id) {

   Optional<Cliente> cliente = this.read(id);
   cliente.ifPresent(this.entityManager::remove);
       
    }

    @Override
    public Optional<Cliente> readByNumber(String numero) {
           
        TypedQuery<Cliente> query = this.entityManager.createQuery("SELECT c FROM Cliente c WHERE c.numero = :numeroVariable", Cliente.class);

        query.setParameter("numeroVariable", numero);
        
        return Optional.ofNullable(query.getSingleResult());


       }

    @Override
    public List<Cliente> readAll() {
        return null;
       }

    
    

}
