package articulos;
public class Articulo {
    //Creamos los atributos
    private String titulo;
    private int anyoLanzamiento;
    private double precioPorDia;
    private String descripcion;
    //Creamos los constructores uno completo y otro vacio


    public Articulo(String titulo, int anyoLanzamiento, double precioPorDia, String descripcion) {
        this.titulo = titulo;
        this.anyoLanzamiento = anyoLanzamiento;
        this.precioPorDia = precioPorDia;
        this.descripcion = descripcion;
    }

    public Articulo() {
    }
    //Creamos el constructor que se pide con el precio por defecto a 9.99

    public Articulo(String titulo, int anyoLanzamiento, double precioPorDia) {
        this.titulo = titulo;
        this.anyoLanzamiento = anyoLanzamiento;
        this.precioPorDia = 9.99;
    }

    //Creamos lo getter y lo setter

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public void setAnyoLanzamiento(int anyoLanzamiento) {
        this.anyoLanzamiento = anyoLanzamiento;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }
    //Creamos un metodo tipo double para que nos devuelva el precio total, teniendo en cuenta el numero de articulos y los dias que sea alquilado
    public double calcularPrecio(int numArticulos, int dias){
        double precio= numArticulos*(dias*this.precioPorDia);
        return precio;
    }

    @Override
    public String toString() {
        return "Artículo" + " " + this.titulo+ " (" + this.precioPorDia + "€/día )";
    }
}
