package pg.edu.uce.pa.grupo.u2.pedidos.application;

import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.repository.ClienteRepository;
import pg.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository.ClienteRepositoryImpl;

@ApplicationScoped 
@Transactional 
public class ClienteService {

    @Inject 
    ClienteRepository clienteRepository;

    public void guardar(Cliente cliente){
        this.clienteRepository.create(cliente);
        
    }

    public Optional<Cliente> buscarPorId(Integer id){

        return this.clienteRepository.read(id);

    }

    public  Optional <Cliente> buscarPorNumero(String numero){
        return this.clienteRepository.readByNumber(numero);
    }

    public void actualizar(Cliente cliente){
        this.clienteRepository.update(cliente);
    }

    public void eliminarPorId(Integer id){

        this.clienteRepository.delete(id);

    }


}
