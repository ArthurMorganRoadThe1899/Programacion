package Programacion.Java.File.LecturaEscritura;

import java.io.*;

public class ex1 {
    public static void main(String[] args) throws IOException {
        int maxValue = 0;
        File ruta = new File("src/Programacion/Java/File/LecturaEscritura/Documentos/numeros.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String line;
            while ((line = br.readLine()) != null) {
                int lineToInt = Integer.parseInt(line);

                if(lineToInt > maxValue){
                    maxValue = lineToInt;
                }
            }
        }

        System.out.println("El máximo valor encontrado en la ruta:\n"+ruta+"\n\nEs: "+maxValue);

    }
}
