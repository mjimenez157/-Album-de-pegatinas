package paq;

import java.util.ArrayList;

public class Album {

    private ArrayList<Pegatina> listaPegatinas;

    // Constructor
    public Album() {
        listaPegatinas = new ArrayList<>();
    }

    // Agregar pegatina
    public void agregarPegatina(Pegatina p) {
        listaPegatinas.add(p);
    }

    // Mostrar álbum
    public void mostrarAlbum() {

        System.out.println("\n=== ALBUM DE FUTBOL ===");

        for (Pegatina p : listaPegatinas) {
            System.out.println(p);
        }
    }

    // Buscar por número
    public Pegatina buscarPegatina(int numero) {

        for (Pegatina p : listaPegatinas) {

            if (p.getNumero() == numero) {
                return p;
            }
        }

        return null;
    }
}
