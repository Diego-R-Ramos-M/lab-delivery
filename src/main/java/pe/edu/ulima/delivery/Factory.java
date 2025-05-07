package pe.edu.ulima.delivery;

public class Factory {
    public static ComidaAbstractFactoryIF getFactory(String tipo) {
        switch (tipo) {
            case "Pizza":
                return new PizzaConcreteFactory();
            case "Hamburguesa":
                return new HamburguesaConcreteFactory();
            case "Ensalada":
                return new EnsaladaConcreteFactory();
            default:
                return new EnsaladaConcreteFactory();
        }
    }
}
