package pg.edu.uce.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table(name = "detallePedidos") 
public class DetallePedido {

    @Id 
    @SequenceGenerator(name = "detallePedido_seq", sequenceName = "dePe_seq", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detallePedido_seq")
    @Column(name = "dePe_id")
    private int id;

     @Column(name = "dePe_cantidad")
    private int cantidad;

     @Column(name = "dePe_precioUnitario")
    private double precioUnitario;

     @Column(name = "dePe_subtotal")
    private double subtotal;

     @Column(name = "dePe_idProducto")
    private int idProducto;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    

}
