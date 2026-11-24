package pg.edu.uce.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table (name = "facturas")
public class Factura {

    @Id 
    @SequenceGenerator (name = "factura_seq", sequenceName = "fac_seq", allocationSize = 1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "factura_seq") 
    @Column (name="fac_id")
    private int id;

      @Column (name="fac_numFactura")
    private String numFactura;

      @Column (name="fac_fecha")
    private LocalDate fechaEmision;

      @Column (name="fac_subtotal")
    private double subtotal;

      @Column (name="fac_total")
    private double total;

      @Column(name="fac_numero")
    private String numero;

    



    
    @Override
    public String toString() {
        return "Factura [id=" + id + ", numFactura=" + numFactura + ", fechaEmision=" + fechaEmision + ", subtotal="
                + subtotal + ", total=" + total + ", numero=" + numero + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumFactura() {
        return numFactura;
    }
    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }
    public LocalDate getFechaEmision() {
        return fechaEmision;
    }
    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    } 


    


}
