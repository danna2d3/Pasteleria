package SistemaPasteleria;

public class Pastel extends Postre {
    private static Disponibilidad disponibilidad = new Disponibilidad();

    public Pastel(String sabor, double precio, String ingrediente, int cantidad) {
        super("Pastel", 10.0, cantidad, sabor, ingrediente);
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

}
