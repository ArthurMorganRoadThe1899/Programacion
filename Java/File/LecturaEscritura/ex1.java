package Programacion.Java.File.LecturaEscritura;

import java.io.*;

public class ex1 {
    public static void main(String[] args) throws IOException {
        // Defino esta variable que usaré para ver CUÁL es el mayor valor
        int maxValue = 0;
        // Defino la ruta de numeros.txt
        File ruta = new File("src/Programacion/Java/File/LecturaEscritura/Documentos/numeros.txt");

        // Try para leer línea a línea numeros.txt
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            // Variable donde almaceno cada línea que leo
            String line;

            // Bucle en el que leo línea por línea cada número
            while ((line = br.readLine()) != null) {
                // lineToInt es un int con el que comparo el número de línea y miro si es más grande
                int lineToInt = Integer.parseInt(line);

                // En cuyo caso que maxValue sea mayor a lineToInt, entonces maxValue se torna el mismo número de la línea leída en esa fase del bucle
                if(lineToInt > maxValue){
                    maxValue = lineToInt;
                }
            }
        }

        // Le decimos al usuario cuál es el mayor número de numeros.txt
        System.out.println("El máximo valor encontrado en la ruta:\n"+ruta+"\n\nEs: "+maxValue);

    }
}
