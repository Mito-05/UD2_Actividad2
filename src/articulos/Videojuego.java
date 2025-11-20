// Packege es la carpeta que lo contiene y se usa para poder exportarlo
package articulos;
//Creamos la clase utilizando extends para decir que es una clase hija de la clase articulo
public class Videojuego extends Articulo{
    private String director;
    private String plataforma;
    private int pegi;

    public Videojuego(String director, int i, double v, String plataforma, String steam, int pegi) {
        this.director = director;
        this.plataforma = plataforma;
        this.pegi = pegi;
    }

    public Videojuego() {
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }
    public boolean paraAdultos(){
        return this.pegi>=18;
    }
    public boolean esApto(int edad){
        return edad>=18;
    }

    @Override
    public String toString() {
        return "Videojuego " + this.getTitulo() + " de " + this.director + " ( " + this.getPrecioPorDia() + "€/dia )";
    }
}
