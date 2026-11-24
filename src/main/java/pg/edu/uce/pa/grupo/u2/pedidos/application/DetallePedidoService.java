package pg.edu.uce.pa.grupo.u2.pedidos.application;

import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.DetallePedido;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.repository.DetallePedidoRepository;

@ApplicationScoped 
@Transactional 
public class DetallePedidoService {

    @Inject 
    private DetallePedidoRepository detallePedidoRepository;

    public void guardar(DetallePedido detallePedido){
        this.detallePedidoRepository.create(detallePedido);
    }

    public Optional<DetallePedido> buscarPorId(Integer id){
        return this.detallePedidoRepository.read(id);

    }

    public Optional<DetallePedido> buscarPorNumero(String numero){
        return this.detallePedidoRepository.readByNumber(numero);

    }

    public void actualizar(DetallePedido detallePedido){

        this.detallePedidoRepository.update(detallePedido);

    }

    public void eliminarPorId(Integer id){
        this.detallePedidoRepository.delete(id);
    }

    

}
