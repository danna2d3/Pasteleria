package SistemaPasteleria;

public class Sabor {
    private String nombre;
    private boolean disponible;

    public Sabor(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }
}