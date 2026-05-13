package paq;

public class Main {

    public static void main(String[] args) {

        Grupo grupoA = new Grupo("Grupo A");

        Equipo colombia = new Equipo("Colombia", grupoA);

        Album album = new Album();

        PegatinaJugador p1 = new PegatinaJugador(1, colombia, "James");
        PegatinaJugador p2 = new PegatinaJugador(2, colombia, "Luis Díaz");
        PegatinaEspecial p3 = new PegatinaEspecial(3, colombia, "Escudo");

        album.agregarPegatina(p1);
        album.agregarPegatina(p2);
        album.agregarPegatina(p3);

        album.agregarPegatina(p1);

        System.out.println("=== ALBUM ===");
        album.mostrarAlbum();

        System.out.println("\n=== REPETIDAS ===");
        album.mostrarRepetidas();

        System.out.println("\nCantidad repetidas: " + album.cantidadRepetidas());

        System.out.println("\nPorcentaje: " + album.porcentajeLlenado() + "%");

        System.out.println("\n=== FALTANTES ===");
        album.mostrarFaltantes();

        Archivos.guardarAlbum(album);
    }
}
