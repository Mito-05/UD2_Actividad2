import articulos.Album;
import articulos.Libro;
import articulos.Pelicula;
import articulos.Videojuego;
import usuarios.Administrador;
import usuarios.Cliente;

public class Main {
    public static void main(String[] args) {
       //Creamos dos de cada articulo
        Pelicula p1 = new Pelicula("Harry Potter y la piedra filosofal", 2001,14.5, "Chris Columbus", 152);
        Pelicula p2 = new Pelicula("Frankenstein", 2025, 10.75, "Guillermo del Toro",149);


        Videojuego v1 = new Videojuego("Arc Raiders",2025, 15.4, "Embark Studios","STEAM", 12);
        Videojuego v2 = new Videojuego("Valorant", 2020, 8.0, "Riot", "Riot Games", 16);

        Album a1 = new Album("thriller", 1982, 6.5, "Michael Jackson", 9, false);
        Album a2 = new Album("Un verano sin ti", 2023, 12, "Bad Bunny", 8, true);

        Libro l1 = new Libro("Harry Potter y la piedra filosofal", 1997, 18, Libro.Genero.Fantasia);
        Libro l2 = new Libro("El retorno del rey", 1954, 8, Libro.Genero.Fantasia.name());

//Creamos unos clientes
        Cliente c1 = new Cliente("Mito","Mito12312", 2005, "2011230",null, 1);
        Cliente c2 = new Cliente("Brandon", "Brandon324", 2001, "19123479", null, 2 );


        Administrador admin1 = new Administrador("admin", "admin1234",2000, "1232134" , Administrador.Rol.Jefe);


        //Usamos el metodo para asignar articulos
        admin1.asignarArticulo(c1, a2);

        System.out.println("El album Asignado a "+c1.getNombreUsuario()+ " es " +c1.getArticulo());
    }
}