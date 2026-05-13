package paq;

public class PegatinaEspecial extends Pegatina {

    private String tipo;

    public PegatinaEspecial(int numero, Equipo equipo, String tipo) {
        super(numero, equipo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: " + tipo;
    }
}
