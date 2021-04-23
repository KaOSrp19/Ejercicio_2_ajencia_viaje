import java.util.Date;
import java.util.List;

public class Billete {

    int idBillete;
    Date fechaEmision;
    double precioTotal;
    Cliente cliente;
    Ciudad origen;
    Ciudad destino;
    Categoria categoria;
    List<Vuelo> vuelos;


    public Billete(){

    }
}
