package paq;

import java.util.ArrayList;

public class Album {

    private ArrayList<Pegatina> listaPegatinas;

    public Album() {
        listaPegatinas = new ArrayList<>();
    }

    public ArrayList<Pegatina> getListaPegatinas() {
        return listaPegatinas;
    }

    public void agregarPegatina(Pegatina nueva) {

        for (Pegatina p : listaPegatinas) {

            if (p.getNumero() == nueva.getNumero()) {
                p.aumentarCantidad();
                return;
            }
        }

        listaPegatinas.add(nueva);
    }

    public void mostrarAlbum() {
        for (Pegatina p : listaPegatinas) {
            System.out.println(p);
        }
    }

    public void mostrarRepetidas() {
        for (Pegatina p : listaPegatinas) {
            if (p.getCantidad() > 1) {
                System.out.println(p);
            }
        }
    }

    public int cantidadRepetidas() {

        int total = 0;

        for (Pegatina p : listaPegatinas) {
            if (p.getCantidad() > 1) {
                total += (p.getCantidad() - 1);
            }
        }

        return total;
    }

    public double porcentajeLlenado() {

        int TOTAL = 50;

        return ((double) listaPegatinas.size() / TOTAL) * 100;
    }

    public void mostrarFaltantes() {

        int TOTAL = 50;

        for (int i = 1; i <= TOTAL; i++) {

            boolean existe = false;

            for (Pegatina p : listaPegatinas) {

                if (p.getNumero() == i) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                System.out.println("Falta la pegatina #" + i);
            }
        }
    }
}
