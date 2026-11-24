package pg.edu.uce.pa.grupo.u2.pedidos.application;

import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pago;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.repository.PagoRepository;

@ApplicationScoped 
@Transactional 
public class PagoService {

    @Inject 
    private PagoRepository pagoRepository;

    public void guardar(Pago pago){
        this.pagoRepository.create(pago);
    }

    public Optional<Pago> buscarPorId(Integer id){
        return this.pagoRepository.read(id);
    }

     public Optional<Pago> buscarPorNumero(String numero){
        return this.pagoRepository.readByNumber(numero);
    }
    


    public void actualizar(Pago pago){
        this.pagoRepository.update(pago);
    }

    public void eliminarPorId(Integer id){
        this.pagoRepository.delete(id);

    }

}
