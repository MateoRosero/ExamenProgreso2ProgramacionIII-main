import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenamiento {

    public static void ordenarPorNombre(List<Plato> menu) {
        int n = menu.size();
        for (int i = 0; i < n - 1; i++) {for (int j = 0; j < n - i - 1; j++) {
                Plato platoActual = menu.get(j);
                Plato platoSiguiente = menu.get(j + 1);
                if (platoActual.getNombre().compareTo(platoSiguiente.getNombre()) > 0) {
                    menu.set(j, platoSiguiente);
                    menu.set(j + 1, platoActual);
                }
            }
        }
    }

}
