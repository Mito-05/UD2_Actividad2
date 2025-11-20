// Packege es la carpeta que lo contiene y se usa para poder exportarlo
package articulos;
//Creamos la clase utilizando extends para decir que es una clase hija de la clase articulo
public class Libro extends Articulo {
    //Creamos los atributos que se piden en el ejercicio
    private String autor;
    private int numPaginas;
    public enum Genero  {Misterio,Terror,Acción,Historia,Fantasia}
    protected Genero genero;
    //Creamos los constructores utilizando super para que erede tambien los atributos de la clase padre al usarse en este caso aparte del completo y el vacio crearemos uno donde le daremos al numPaginas el valor fijo de 100
    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, Genero genero) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    public Libro(String elRetornoDelRey, int anyoLanzamiento, int precioPorDia, String name) {
    }

    public Libro(String autor, int numPaginas, Genero genero) {
        this.autor = autor;
        this.numPaginas = 100;
        this.genero = genero;
    }
    //Creamos los getter y los setter
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    //Creamos un metodo para ver si el libro tiene mas de 200 paginas, es tipo boolean para que devuelva true en caso de ser mayor o igual a 200 paginas
    public boolean esLargo(){
        return numPaginas >=200;
    }

    @Override
    public String toString() {
        return "Libro" + this.getTitulo() +  " de " + this.autor +"( "+this.getPrecioPorDia()+"€/día"+" )";
    }
}
