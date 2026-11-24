package pg.edu.uce.pa.grupo.u2.pedidos.application;

import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Factura;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.repository.FacturaRepository;

@ApplicationScoped 
@Transactional 
public class FacturaService {

    @Inject 
    private FacturaRepository facturaRepository;

    public void guardar(Factura Factura){

        this.facturaRepository.create(Factura);
        
    }

    public Optional<Factura> buscarPorId(Integer id){

        return this.facturaRepository.read(id);

    }

    
    public Optional<Factura> buscarPorNumero(String numero){

        return this.facturaRepository.readByNumber(numero);

    }

    public void actualizar(Factura factura){
        this.facturaRepository.update(factura);
    }

    public void eliminarPorId(Integer id){
        this.facturaRepository.delete(id);
    }

}
