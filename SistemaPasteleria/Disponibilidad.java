package SistemaPasteleria;

import java.util.ArrayList;
import java.util.List;

public class Disponibilidad {
    private List<Sabor> sabores;
    private List<Ingrediente> ingredientes;

    public Disponibilidad() {
        sabores = new ArrayList<>();
        ingredientes = new ArrayList<>();

        // Inicializar sabores
        sabores.add(new Sabor("Vainilla", true));
        sabores.add(new Sabor("Chocolate", true));
        sabores.add(new Sabor("Fresa", false));
        sabores.add(new Sabor("Limón", true));
        sabores.add(new Sabor("Naranja", true));

        // Inicializar ingredientes
        ingredientes.add(new Ingrediente("Chispas de chocolate", true, 1.0));
        ingredientes.add(new Ingrediente("Galletas", true, 1.0));
        ingredientes.add(new Ingrediente("Sirope de caramelo", false, 1.0));
        ingredientes.add(new Ingrediente("Nueces", true, 1.0));
        ingredientes.add(new Ingrediente("Mermelada", true, 1.0));
    }

    public boolean esSaborDisponible(String sabor) {
        for (Sabor s : sabores) {
            if (s.getNombre().equalsIgnoreCase(sabor) && s.isDisponible()) {
                return true;
            }
        }
        return false;
    }

    public boolean esIngredienteDisponible(String ingrediente) {
        for (Ingrediente i : ingredientes) {
            if (i.getNombre().equalsIgnoreCase(ingrediente) && i.isDisponible()) {
                return true;
            }
        }
        return false;
    }
}
