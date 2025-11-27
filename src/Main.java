import articulos.Album;
import articulos.Libro;
import articulos.Pelicula;
import articulos.Videojuego;
import usuarios.Administrador;
import usuarios.Cliente;
import utilidades.Factura;

public class Main {
    public static void main(String[] args) {
       //Creamos dos de cada articulo
        Pelicula p1 = new Pelicula("Harry Potter y la piedra filosofal", 2001,14.5,"Pelicula de fantasio hambientada en un mundo de magia", "Chris Columbus", 152, Pelicula.Idiomas.INGLES, Pelicula.Idiomas.ESPAÑOL);
        Pelicula p2 = new Pelicula("Frankenstein", 2025, 10.75,"pelicula clasica mezclada con romance", "Guillermo del Toro",149, Pelicula.Idiomas.INGLES, Pelicula.Idiomas.ESPAÑOL);


        Videojuego v1 = new Videojuego("Arc Raiders",2025, 15.4, "Juego de ultima generacion", "Embark Studios","STEAM", 12,"1.24");
        Videojuego v2 = new Videojuego("Valorant", 2020, 8.0,"Tactical shoter", "Riot", "Riot Games", 16,"1.6");

        Album a1 = new Album("thriller", 1982, 6.5, " El album mas vendido del mundo ", "Michael Jackson", 9, false);
        Album a2 = new Album("Un verano sin ti", 2023, 12, " Simplemente sin mas ", "Bad Bunny", 12, true);

        Libro l1 = new Libro("Harry Potter y la piedra filosofal", 1997, 32," Libro de fantasia y magia","J.K Rowling" ,3000, Libro.Genero.FANTASIA, true);
        Libro l2 = new Libro("El retorno del rey", 1954, 28,"La ultima parte del señor de los anillos","J.R.R Talking",2300,  Libro.Genero.FANTASIA, false);

//Creamos unos clientes
        Cliente c1 = new Cliente("Mito","Mito12312", 2005, "2011230",null, 1);
        Cliente c2 = new Cliente("Brandon", "Brandon324", 2001, "19123479", null, 2 );


        Administrador admin1 = new Administrador("admin", "admin1234",2000, "1232134" , Administrador.Rol.Jefe);


        //Usamos el metodo para asignar articulos
        admin1.asignarArticulo(c1, a2);

        System.out.println("El album Asignado a "+c1.getNombreUsuario()+ " es " +c1.getArticulo());
        c1.saludo();
        c2.saludo();
        Factura f1 = new Factura(l1,c1, 20,17);
        Factura f2 = new Factura(l2,c2, 40,3);
    }
}