package paq;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

    public static void guardarAlbum(Album album) {

        try {

            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("album.txt"));

            for (Pegatina p : album.getListaPegatinas()) {

                bw.write(p.toString());
                bw.newLine();
            }

            bw.close();

            System.out.println("Archivo guardado");

        } catch (IOException e) {

            System.out.println("Error guardando");
        }
    }
}
