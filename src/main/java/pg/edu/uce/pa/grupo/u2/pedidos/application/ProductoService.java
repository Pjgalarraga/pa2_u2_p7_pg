package pg.edu.uce.pa.grupo.u2.pedidos.application;

import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Producto;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.repository.ProductoRepository;

@ApplicationScoped 
@Transactional 
public class ProductoService {

    @Inject 
    ProductoRepository productoRepository;

    public void guardar(Producto producto){
        this.productoRepository.create(producto);
    }

    public Optional<Producto> buscarPorId(Integer id){
        return  this.productoRepository.read(id);
    }

    public Optional<Producto> buscarPorNumero(String numero){
        return  this.productoRepository.readByNumber(numero);
    }

    public void actualizar(Producto producto){

        this.productoRepository.update(producto);

    }

    public void eliminarPorId(Integer id){
        this.productoRepository.delete(id);
    }

}
