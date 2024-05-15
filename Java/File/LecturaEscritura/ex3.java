package Programacion.Java.File.LecturaEscritura;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ex3 {
    public static void main(String[] args) throws IOException {
        // Defino las variables de rutas que utilizaré
        File og_personas = new File("src/Programacion/Java/File/LecturaEscritura/Documentos/usa_personas.txt");
        File mirameOrdenado = new File("src/Programacion/Java/File/LecturaEscritura/Documentos/usa_personasOrdenado.txt");

        // Creo el array donde guardare los nombres de usa_personas.txt
        ArrayList<String> names = new ArrayList<String>();

        // Agarro el contenido de usa_personas.txt y lo añado al arraylist
        try (BufferedReader leoElFileOriginal = new BufferedReader(new FileReader(og_personas))) {
            while (leoElFileOriginal.ready()) {
                names.add(leoElFileOriginal.readLine());
            }
        }

        // Ordenar el array names
        Collections.sort(names);

        // Creo el archivo usa_personasOrdenado.txt
        if(mirameOrdenado.createNewFile()){
            // Agarro y preparo las variables writer y buffer para escribir sobre usa_personasOrdenado.txt
            FileWriter writingUnordered = new FileWriter(mirameOrdenado, true);
            BufferedWriter buf = new BufferedWriter(writingUnordered);

            // Y hago un for teniendo en cuenta la longitud de nombres guardados en el arraylist
            // names y los meto uno a uno a sabiendas de que ya están ordenados
            for (String name : names) {
                buf.write(name);
                buf.newLine();
            }
            buf.close();
        }
    }
}
