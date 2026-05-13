package paq;

public class PegatinaJugador extends Pegatina {

    private String jugador;

    public PegatinaJugador(int numero, Equipo equipo, String jugador) {
        super(numero, equipo);
        this.jugador = jugador;
    }

    public String getJugador() {
        return jugador;
    }

    @Override
    public String toString() {
        return super.toString() + " | Jugador: " + jugador;
    }
}
