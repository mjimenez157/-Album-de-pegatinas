package paq;

public class Pegatina {

    public int numero;
    public String equipo;
    public String jugador;
    public boolean esEspecial;
    public int cantidad;

    public Pegatina(String equipo, String jugador, boolean esEspecial, int numero) {
        this.equipo = equipo;
        this.jugador = jugador;
        this.esEspecial = esEspecial;
        this.numero = numero;
        this.cantidad = 0;
    }

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

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

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
