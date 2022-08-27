package services.main;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<String> canciones = new ArrayList<>();
        // Le agregamos datos
        canciones.add("Beds are burning");
        canciones.add("It's only rock 'n' Roll (But I like it)");
        canciones.add("Ashes to ashes");

        String busqueda = "Ashes to ashes";
        int indice = canciones.indexOf(busqueda);
        if (indice != -1) {
            System.out.println("La búsqueda está en el índice " + indice);
        } else {
            System.out.println("El elemento no existe");
        }
    }
}
