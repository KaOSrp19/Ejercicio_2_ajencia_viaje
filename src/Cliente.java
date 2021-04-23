public class Cliente {

    int idCliente;
    String nombre;
    String primerApellido;
    String segundoApellido;

    public Cliente(){

    }
    public Cliente(String nombre){
        this.nombre = nombre;

    }
    public Cliente(String nombre, String primerApellido, String segundoApellido){
        this.nombre = nombre;
        this.primerApellido =primerApellido;
        this.segundoApellido =segundoApellido;

    }
}
