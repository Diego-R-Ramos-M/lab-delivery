package pe.edu.ulima.delivery;

public class Hamburguesa implements ComidaIF {
    // Atributos
    private double precio;

    // Constructor
    public Hamburguesa(double precio) {
        this.precio = precio;
    }

    // Getters
    @Override
    public double getPrecio() {
        return precio;
    }
    
    // Otros metodos
    @Override
    public void preparar() {
        System.out.println("Preparando la hamburguesa");
    }
}
