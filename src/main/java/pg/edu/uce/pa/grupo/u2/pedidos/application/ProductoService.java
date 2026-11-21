package pg.edu.uce.pa.grupo.u2.pedidos.application;

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

    public Producto buscarPorId(Integer id){
        return  this.productoRepository.read(id);
    }

    public void actualizar(Producto producto){

        this.productoRepository.update(producto);

    }

    public void eliminarPorId(Integer id){
        this.productoRepository.delete(id);
    }

}
