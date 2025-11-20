package usuarios;
import articulos.Articulo;
public class Cliente extends Usuario{

    private Articulo articulo;
    private int numSocio;

    public Cliente(String id, String nombreUsuario, int fechaNacimiento, String contrasenya, Articulo articulo, int numSocio) {
        super(id, nombreUsuario, fechaNacimiento, contrasenya);
        this.articulo = articulo;
        this.numSocio = numSocio;
    }

    public Cliente() {
    }

    // Getters y setters


    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    //Creamos el metodo tipo double para que nos devuelva el valor: calcularPrecio(numArticulos, dias)Calcula: precioPorDía * número de artículos * días

    public double calcularPrecio(int numArticulos, int dias) {
        return articulo.getPrecioPorDia() * numArticulos * dias;
    }

    @Override
    public String toString() {
        return "Cliente " + this.getNombreUsuario() + " (" + this.getId() + ")";
    }
}
