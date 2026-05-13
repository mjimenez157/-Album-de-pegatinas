package paq;

public class Pegatina {

    protected int numero;
    protected Equipo equipo;
    protected int cantidad;

    public Pegatina(int numero, Equipo equipo) {
        this.numero = numero;
        this.equipo = equipo;
        this.cantidad = 1;
    }

    public int getNumero() {
        return numero;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void aumentarCantidad() {
        cantidad++;
    }

    @Override
    public String toString() {
        return "Pegatina #" + numero +
               " | Equipo: " + equipo +
               " | Cantidad: " + cantidad;
    }
}
