// Packege es la carpeta que lo contiene y se usa para poder exportarlo
package usuarios;
//Import sirve para poder usar clases y articulos de otras carpetas
import articulos.Articulo;
// Clase Administrador que hereda de Usuario

public class Administrador extends Usuario {
    public enum Rol {Jefe, Vendedor}
    protected Rol rol;

    public Administrador(String id, String nombreUsuario, int fechaNacimiento, String contrasenya, Rol rol) {
        super(id, nombreUsuario, fechaNacimiento, contrasenya);
        this.rol = rol;
    }

    public Administrador() {
    }
    // Getter y Setter p

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    // Método para asignar un artículo a un usuario
    public void asignarArticulo(Cliente cliente, Articulo articulo) {
        cliente.setArticulo(articulo);
    }

    // Método para retirar un artículo de un usuario
    public void retirarArticulo(Cliente cliente) {
        cliente.setArticulo(null);
    }

    // Método toString personalizado
    @Override
    public String toString() {
        return "Administrador " + getNombreUsuario() + " (" + getId() + ")";
    }
}
