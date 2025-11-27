//Creamos el packaje y la clase
package articulos;
public class Album extends Articulo{
    private String autor;
    private int numCanciones;
    private boolean single;
    //Creamos los constructores utilizando super para que erede tambien los atributos de la clase padre al usarse


    public Album(String titulo, int anyoLanzamiento, double precioPorDia, String descripcion, String autor, int numCanciones, boolean single) {
        super(titulo, anyoLanzamiento, precioPorDia, descripcion);
        this.autor = autor;
        this.numCanciones = numCanciones;
        this.single = single;
    }

    public Album() {
    }
    //Getter and setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }
    //Metodo para obtener la duracion de un album es tipo double porque seguramente contenga decimales
    public double getDuracion(double duracion){
        return duracion*this.numCanciones;
    }
    @Override
    public String toString() {
        return "Album "+ this.getTitulo()+ " de " + this.autor + " ( " + this.getPrecioPorDia() + "€/día"+ " )";
    }
}