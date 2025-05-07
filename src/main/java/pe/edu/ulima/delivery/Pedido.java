package pe.edu.ulima.delivery;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    // Atributos
    private Usuario usuario;
    private String estado;
    private List<ComidaIF> listaDeComidas;

    // Constructor
    public Pedido(Usuario usuario) {
        this.usuario = usuario;
        estado = "pendiente";
        listaDeComidas = new ArrayList<>();
    }

    // Getters
    public Usuario getUsuario() {
        return usuario;
    }

    public String getEstado() {
        return estado;
    }

    public List<ComidaIF> getListaDeComidas() {
        return listaDeComidas;
    }
    
    // Otros metodos
    public void preparar() {
        if (estado.equals("pendiente")) {
            for(ComidaIF comida : listaDeComidas) {
                comida.preparar();
            }
            System.out.println("... El pedido termino de prepararse");
            estado = "preparado";
        }
        else if (estado.equals("preparado")) {
            System.out.println("El pedido ya ha sido preparado y necesita ser entregado");
        }
        else {
            System.out.println("El pedido ya ha sido preparado y entregado");
        }
        
    }
    
    public void entregar() {
        if (estado.equals("preparado")) {
            System.out.println("Entregando pedido");
            System.out.println("... El pedido termino de entregarse");
            estado = "entregado";
        }
        else if (estado.equals("entregado")){
            System.out.println("El pedido ya ha sido entregado");
        }
        else {
            System.out.println("El pedido aun no ha sido preparado");
        }
    }
    
    public void agregarComida(ComidaIF comida) {
        listaDeComidas.add(comida);
    }
    
    public void verResumen() {
        double montoTotal = 0;
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Comidas:");
        for (ComidaIF comida : listaDeComidas) {
            System.out.println("- " + comida.getClass().getSimpleName() + ": " + comida.getPrecio());
            montoTotal = montoTotal + comida.getPrecio();
        }
        System.out.println("Monto Total: " + montoTotal);
        System.out.println("Estado actual: " + estado + "\n");
    }
}
