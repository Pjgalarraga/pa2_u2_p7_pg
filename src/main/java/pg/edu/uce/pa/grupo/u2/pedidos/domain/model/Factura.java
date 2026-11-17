package pg.edu.uce.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDate;

public class Factura {

    private int id;
    private String numFactura;
    private LocalDate fechaEmision;
    private double subtotal;
    private double total;
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


    


}
