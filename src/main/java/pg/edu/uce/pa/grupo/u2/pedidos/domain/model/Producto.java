package pg.edu.uce.pa.grupo.u2.pedidos.domain.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table (name = "productos")
public class Producto {


 @Id 
    @SequenceGenerator(name="producto_seq", sequenceName="prod_seq", allocationSize =1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producto_seq") 
    @Column(name="prod_id") //nombre de la columna de la base de datos 
    private int id;

    @Column(name="prod_nombre")
    private String nombre;

    @Column(name="prod_descripcion")
    private String descripcion;

    @Column(name="prod_precio")
    private Double precio;
    
    @Column(name="prod_stock")
    private int stock;

      @Column(name="prod_numero")
    private String numero;



    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
                + ", stock=" + stock + ", numero=" + numero + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }


    


}
