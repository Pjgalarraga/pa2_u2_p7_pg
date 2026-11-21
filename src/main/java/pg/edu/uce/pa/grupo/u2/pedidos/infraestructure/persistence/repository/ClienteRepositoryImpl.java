package pg.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
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
    public Cliente read(Integer id) {

        return this.entityManager.find(Cliente.class, id);
   
    }

    @Override
    public void update(Cliente pedido) {

        this.entityManager.merge(pedido);
     
    }

    @Override
    public void delete(Integer id) {

        this.entityManager.remove(this.read(id));
       
    }
    

}
