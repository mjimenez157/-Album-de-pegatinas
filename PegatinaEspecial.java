package paq;

public class PegatinaEspecial extends Pegatina {

    private String rareza;

    public PegatinaEspecial(String equipo,
                             String jugador,
                             int numero,
                             String rareza) {

        super(equipo, jugador, true, numero);
        this.rareza = rareza;
    }

    public String getRareza() {
        return rareza;
    }

    @Override
    public String toString() {

        return super.toString() +
               " | Rareza: " + rareza;
    }
}
