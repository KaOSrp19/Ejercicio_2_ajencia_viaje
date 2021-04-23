import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente joseBarrientos = new Cliente("Jose Barrientos");
        Cliente marioBautisata = new Cliente("Mario Bautisata");

        List<Cliente> cliente =new ArrayList<>();
        cliente.add(joseBarrientos);
        cliente.add(marioBautisata);


        //ciudad origin
        Ciudad boston = new Ciudad("Boston");
        Ciudad india = new Ciudad("India");

        List<Ciudad> origen =new ArrayList<>();
        origen.add(boston);
        origen.add(india);

        //ciudad destino
        Ciudad canada = new Ciudad("Canada");
        Ciudad newYork = new Ciudad("New York");

        List<Ciudad> destino =new ArrayList<>();
        destino.add(canada);
        destino.add(newYork);




        //categoria
        Categoria java = new Categoria ("Primera clase");
        Categoria programacion= new Categoria("Segunda clase");

        //definimos una lista de categorias
        List<Categoria> categoria=new ArrayList<>();
        categoria.add(java);
        categoria.add(programacion);

        //vuelos
        Vuelo boa = new Vuelo("Boa 012");
        Vuelo toro = new Vuelo("Toro 180");

        List<Vuelo> vuelos= new ArrayList<>();
        vuelos.add(boa);
        vuelos.add(toro);

        Billete billete = new Billete();

        billete.idBillete =15;
        billete.precioTotal=500;




    }
}
