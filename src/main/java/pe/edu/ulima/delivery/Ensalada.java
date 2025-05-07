package pe.edu.ulima.delivery;

public class Ensalada implements ComidaIF {
    // Atributos
    private double precio;

    // Constructor
    public Ensalada(double precio) {
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
        System.out.println("Preparando la ensalada");
    }
}
