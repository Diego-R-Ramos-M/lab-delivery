package pe.edu.ulima.delivery;

public class HamburguesaConcreteFactory implements ComidaAbstractFactoryIF {

    @Override
    public ComidaIF crearComida() {
        return new Hamburguesa(18);
    }
    
}
