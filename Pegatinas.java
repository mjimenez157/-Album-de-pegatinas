package paq;

public class Pegatina {

    private int numero;
    private String equipo;
    private String jugador;
    private boolean esEspecial;
    private int cantidad;

    // Constructor
    public Pegatina(String equipo, String jugador, boolean esEspecial, int numero) {
        this.equipo = equipo;
        this.jugador = jugador;
        this.esEspecial = esEspecial;
        this.numero = numero;
        this.cantidad = 0;
    }

    // Getters
    public String getEquipo() {
        return equipo;
    }

    public String getJugador() {
        return jugador;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isEsEspecial() {
        return esEspecial;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Setter
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método
    public void agregarPegatina() {
        cantidad++;
    }

    @Override
    public String toString() {
        return "Numero: " + numero +
               " | Jugador: " + jugador +
               " | Equipo: " + equipo +
               " | Especial: " + esEspecial +
               " | Cantidad: " + cantidad;
    }
}
