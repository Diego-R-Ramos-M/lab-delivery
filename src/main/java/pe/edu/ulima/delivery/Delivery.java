package pe.edu.ulima.delivery;

public class Delivery {

    public static void main(String[] args) {
        GestorDePedidos gestor1 = GestorDePedidos.getInstanciaUnica();
        ComidaAbstractFactoryIF fabricaDePizzas = Factory.getFactory("Pizza");
        ComidaAbstractFactoryIF fabricaDeHamburguesas = Factory.getFactory("Hamburguesa");
        ComidaAbstractFactoryIF fabricaDeEnsaladas = Factory.getFactory("Ensalada");
        
        // Ejemplo con un primer pedido -----------------------------------------------
        Usuario usuario1 = new Usuario("Diego Ramos", "777 777 777", "Universidad de Lima");
        Pedido pedido1 = new Pedido(usuario1);
        
        ComidaIF pizza1 = fabricaDePizzas.crearComida();
        ComidaIF hamburguesa1 = fabricaDeHamburguesas.crearComida();
        ComidaIF ensalada1 = fabricaDeEnsaladas.crearComida();
        
        pedido1.agregarComida(pizza1);
        pedido1.agregarComida(hamburguesa1);
        pedido1.agregarComida(ensalada1);
        gestor1.agregarPedido(pedido1);

        gestor1.getListaDePedidos().get(0).verResumen();
        
        gestor1.getListaDePedidos().get(0).preparar();
        System.out.println("Estado actual: " + gestor1.getListaDePedidos().get(0).getEstado() + "\n");
        gestor1.getListaDePedidos().get(0).entregar();
        System.out.println("Estado actual: " + gestor1.getListaDePedidos().get(0).getEstado() + "\n");
        
        gestor1.verResumen();
        
        GestorDePedidos gestor2 = GestorDePedidos.getInstanciaUnica();
        System.out.println("Los gestores de pedidos son iguales? " + gestor1.equals(gestor2));
    }
}
