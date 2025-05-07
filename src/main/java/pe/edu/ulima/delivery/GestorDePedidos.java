package pe.edu.ulima.delivery;

import java.util.List;
import java.util.ArrayList;

public class GestorDePedidos {
    // Atributos
    private List<Pedido> listaDePedidos;
    private static GestorDePedidos instanciaUnica = null;
    
    // Constructor
    private GestorDePedidos() {
        listaDePedidos = new ArrayList<>();
    }

    // Getters
    public List<Pedido> getListaDePedidos() {
        return listaDePedidos;
    }
    
    public static GestorDePedidos getInstanciaUnica() {
        if (instanciaUnica == null) {
            instanciaUnica = new GestorDePedidos();
        }
        
        return instanciaUnica;
    }
    
    // Otros metodos
    public void agregarPedido(Pedido nuevoPedido) {
        listaDePedidos.add(nuevoPedido);
    }
    
    public void verResumen() {
        System.out.println("Pedidos registrados en el sistema:");
        int contadorDePedidos = 0;
        for (Pedido pedido : listaDePedidos) {
            System.out.println("- Pedido #" + (contadorDePedidos + 1) + ": " + 
                    pedido.getListaDeComidas().size() + " comidas," + 
                    " estado: " + pedido.getEstado());
        }
        System.out.println();
    }
}
