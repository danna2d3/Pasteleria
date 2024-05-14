package SistemaPasteleria;

public class Cupcake extends Postre {
    private static Disponibilidad disponibilidad = new Disponibilidad();

    public Cupcake(String sabor, String ingrediente, int cantidad) {
        super("Cupcake", preciobase, cantidad, sabor, ingrediente);
    }

    public boolean esValido() {
        if (!disponibilidad.esSaborDisponible(sabor)) {
            System.out.println("El sabor seleccionado no está disponible.");
            return false;
        }

        if (!disponibilidad.esIngredienteDisponible(ingrediente)) {
            System.out.println("El ingrediente '" + ingrediente + "' no está disponible.");
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private static final double preciobase = 3.0;
}