package pg.edu.uce.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table (name = "pagos")
public class Pago {

     @Id 
    @SequenceGenerator (name = "pagos_seq", sequenceName = "pag_seq", allocationSize = 1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pagos_seq") 
    @Column (name="pag_id")
    private int id;

     @Column (name="pag_metodoPago")
    private String metodoPago;

     @Column (name="pag_monto")
    private double monto;

     @Column (name="pag_fecha")
    private LocalDateTime fechaPago;

     @Column (name="pag_estado")
    private String estado;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public LocalDateTime getFechaPago() {
        return fechaPago;
    }
    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    

}
