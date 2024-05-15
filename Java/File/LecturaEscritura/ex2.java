package Programacion.Java.File.LecturaEscritura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ex2 {
    public static void main(String[] args) {
        // Defino la ruta del archivo que usaremos
        File ruta = new File("src/Programacion/Java/File/LecturaEscritura/Documentos/alumnos_notas.txt");
        // Usaré un array de strings para almacenar la data de alumnos_notas.txt
        String[] alumnoValues;

        // Comprobamos que se pueda leer el archivo de la ruta dicha
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            // Creamos una variable en la que almacenaremos cada línea leída
            String line;
            // Hacemos un bucle en el que, mientras lo que se este leyendo en el archivo
            // no sea nulo, se siga leyendo
            while ((line = br.readLine()) != null) {
                // Utilizo el arraylist para almacenar cada dato de la línea de manera individual
                // Pues en el archivo esta separado todo por espacios
                alumnoValues = line.split(" ");

                // Y apartir de aquí imprimo por pantalla siempre el 0 y el 1 en cada bucle que serán el nombre y apellido...
                System.out.println("\n\nNombre: "+alumnoValues[0]+"\nApellido: "+alumnoValues[1]);
                System.out.print("Notas: ");

                // y hago un bucle a partir de la posición 3, que es donde empiezan las notas de cada alumno
                for(int i = 3; i < alumnoValues.length; i++){
                    System.out.print(alumnoValues[i] +" ");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
