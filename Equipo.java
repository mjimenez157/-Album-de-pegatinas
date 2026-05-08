package paq;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Pegatina> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Pegatina p) {
        jugadores.add(p);
    }

    public void mostrarJugadores() {

        System.out.println("Equipo: " + nombre);

        for (Pegatina p : jugadores) {
            System.out.println(p);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
