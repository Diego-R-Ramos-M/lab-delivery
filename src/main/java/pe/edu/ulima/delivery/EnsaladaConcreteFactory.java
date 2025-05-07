package pe.edu.ulima.delivery;

public class EnsaladaConcreteFactory implements ComidaAbstractFactoryIF {

    @Override
    public ComidaIF crearComida() {
        return new Ensalada(15);
    }
    
}
