package pg.edu.uce.pa.grupo.u2;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import pg.edu.uce.pa.grupo.u2.pedidos.application.PedidoService;
import pg.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;

@QuarkusMain 
public class Main implements QuarkusApplication {

    @Inject 
    private PedidoService pedidoService;

    public static void main(String... args) {

        io.quarkus.runtime.Quarkus.run(Main.class, args);

    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello, Quarkus!");

        Pedido pedido = new Pedido();
        pedido.setProducto("Prueba");
        pedido.setPrecio(100.0);
        pedido.setFecha(LocalDateTime.now());

        this.pedidoService.guardar(pedido);
        return 0;
    }



}
