package pg.edu.uce.pa.grupo.u2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

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
  

        //Read(buscar)
        Optional<Pedido> pedido1= this.pedidoService.buscarPorId(2);
if(pedido1.isPresent()){
   System.out.println("Pedido encontrado:" + pedido1.get());
  
}else{
    
   System.out.println("Pedido no encontrado");
}

//Insertar 
        Pedido pedido2= new Pedido();
        pedido2.setNumero("PED-001");
        this.pedidoService.guardar(pedido2);
        System.out.println("Pedido insertado:" + pedido2);


//READ BY NUMBER

Optional<Pedido> pedidoByNumber= this.pedidoService.buscarPorNumero("PED-001");
if(pedidoByNumber.isPresent()){
   System.out.println("Pedido encontrado por número:" + pedidoByNumber.get());
  
}else{
    
   System.out.println("Pedido no encontrado por número");
}

         

      

        return 0;
    }



}
