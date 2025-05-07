package pe.edu.ulima.delivery;

public class PizzaConcreteFactory implements ComidaAbstractFactoryIF {

    @Override
    public ComidaIF crearComida() {
        return new Pizza(25);
    }
    
}
