//hacemos el package
package usuarios;
//creamos la clase
public class Usuario {
    private String id;
    private String nombreUsuario;
    private int fechaNacimiento;
    private String contrasenya;
    //hacemos los constructores, completo y vacio
    public Usuario(String id, String nombreUsuario, int fechaNacimiento, String contrasenya) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasenya = contrasenya;
    }

    public Usuario() {
    }
    //hacemos los getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    // esAdulto(): true si tiene 18 años o más tomando 2025 como año actual
    public boolean esAdulto() {
        return (2025 - this.fechaNacimiento) >= 18;
    }

    // contrasenyaSegura(): true si la contraseña tiene más de 10 caracteres
    public boolean contrasenyaSegura() {

        return contrasenya.length() >= 10;
    }


    @Override
    public String toString() {
        return nombreUsuario + " (" + id + ")";
    }
}