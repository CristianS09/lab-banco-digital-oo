import java.util.ArrayList;
import java.util.List;

//Classe que contem a lista de clientes

public class ContaCliente {
    private List<Cliente> clientes;

    public ContaCliente(){
        clientes = new ArrayList<>();
        clientes.add(new Cliente("Caio"));
        clientes.add(new Cliente("Juan"));
    }

    public void implimirClientes() {
        System.out.println("Clientes: ");
        clientes.forEach(cliente -> System.out.println(cliente.getNome()));
    }

}
