// Packege es la carpeta que lo contiene y se usa para poder exportarlo
//Creamos la clase utilizando extends para decir que es una clase hija de la clase
package articulos;
public class Pelicula extends Articulo{
    private String director;
    private int duracion;
    //Construtores con super para que herede los atributos de la clase padre


    public Pelicula(String titulo, int anyoLanzamiento, double precioPorDia, String descripcion, String director, int duracion) {
        super(titulo, anyoLanzamiento, precioPorDia, descripcion);
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {
    }
    //Getter and Setter

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    //Hacemos el metodo tipo void ya que va a mostrar el texto por consola y no pide que devuelva nada
    public void getDuracionHorasyMinutos(){
        int numHoras= this.duracion/60;
        int numMinutos = this.duracion%60;
        System.out.println(numHoras+" Horas y "+numMinutos+" Minutos");
    }
    //Hacemos otra que devuelva la duracion en segundos asi que sera tipo int
    public int getDuracionSegundo(){
        return this.duracion*60;
    }
}