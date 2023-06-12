import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Plato> Menu = new ArrayList<>();

    public void ingresarPlato(String nombre, double precio, int calorias, int tiempoPreparacion) {
        if (nombre.isEmpty() || precio <= 0 || calorias <= 0 || tiempoPreparacion <= 0) {
            System.out.println("Por favor completa todos los campos antes de ingresar un nuevo plato");
        } else {
            for (Plato plato : Menu) {
                if (plato.getNombre().equals(nombre)) {
                    System.out.println("El nombre del plato ya existe en el menú, Ingresa un nuevo nombre que no exista ya en el menú.");
                    return;
                }
            }

            Plato nuevoPlato = new Plato(nombre, precio, calorias, tiempoPreparacion);
            Menu.add(nuevoPlato);
            System.out.println("El plato nuevo fue ingresado con éxito.");
        }
    }

    public void quemarDatos() {
        Menu menu = new Menu();

        menu.ingresarPlato("Plato 1", 10.99, 500, 30);
        menu.ingresarPlato("Plato 2", 15.99, 600, 45);
        menu.ingresarPlato("Plato 3", 12.70, 700, 35 );
        menu.ingresarPlato("Plato 4", 14.00, 560, 28 );
        menu.ingresarPlato("Plato 5", 15.10, 750, 33 );
        menu.ingresarPlato("Plato 6", 18.70, 450, 31 );
        menu.ingresarPlato("", 12.99, 400, 25);
        menu.ingresarPlato("Plato 1", 8.99, 550, 35);

        menu.quemarDatos();
    }

    public Plato buscarPlato(String nombre) {
        for (Plato plato : Menu ) {
            if (plato.getNombre().equals(nombre)) {
                return plato;
            }
        }
        return null;
    }




}
