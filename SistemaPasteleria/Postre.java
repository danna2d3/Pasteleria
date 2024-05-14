package SistemaPasteleria;

// Producto.java
public class Postre {
    protected String nombre;
    protected double precio;
    protected int cantidad;
    protected String sabor;
    protected String ingrediente;

    public Postre(String nombre, double precio, int cantidad, String sabor, String ingrediente) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.sabor = sabor;
        this.ingrediente = ingrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getSabor() {
        return sabor;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    @Override
    public String toString() {
        return nombre + " - Precio: $" + precio + "cantidad: $" + cantidad + "sabor: $" + sabor + "ingrediente" + ingrediente;
    }
}

