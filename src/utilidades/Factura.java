package utilidades;
//Importamos las clase que vamos a usar de otros paquetes
import articulos.Articulo;
import usuarios.Cliente;
public class Factura {
    //creamos los atribustos que se nos piden
    Articulo articulo;
    Cliente cliente;
    int numArticulos;
    int dias;
    //Creamos los constructores que se nos piden en esta caso seran 3

    public Factura(Articulo articulo, Cliente cliente, int numArticulos, int dias) {
        this.articulo = articulo;
        this.cliente = cliente;
        this.numArticulos = numArticulos;
        this.dias = dias;
    }

    public Factura() {
    }

    public Factura(Articulo articulo, Cliente cliente, int numArticulos) {
        this.articulo = articulo;
        this.cliente = cliente;
        this.numArticulos = numArticulos;
        this.dias = 7;
    }
    //Creamos los Getter and Setter

    public Articulo getArticulo() {
        return articulo;
    }


    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumArticulos() {
        return numArticulos;
    }

    public void setNumArticulos(int numArticulos) {
        this.numArticulos = numArticulos;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    //Creamos el metodo preciototal, sera double y nos dara el precio que imprimiremos en la factura
    public double getPrecioTotal() {
        return numArticulos * articulo.getPrecioPorDia() * dias;
    }

    @Override
    public String toString() {
        return "Factura para:" + cliente.getNombreUsuario() + " Total:" + getPrecioTotal();
    }
}
