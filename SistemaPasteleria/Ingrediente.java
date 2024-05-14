package SistemaPasteleria;

public class Ingrediente {
    private String nombre;
    private boolean disponible;
    private double costoAdicional;

    public Ingrediente(String nombre, boolean disponible, double costoAdicional) {
        this.nombre = nombre;
        this.disponible = disponible;
        this.costoAdicional = costoAdicional;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public double costoAdicional() {
        return costoAdicional;
    }
}
