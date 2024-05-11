package Programacion.Java.FileTerminal;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MiniFileManager {

    public static void main(String[] args) {
        String response = "inicializada";
        File ruta = new File("src/");

        String[] datosResponseSpace;
        String[] datosResponseBackslash;

        do{
            response = input();

            datosResponseSpace = response.split("\s");
            datosResponseBackslash = response.split("/");

            switch (datosResponseSpace[0]) {
                case "pwd":
                    System.out.println(ruta);

                    break;
                case "mv":
                    File mv1 = new File(datosResponseSpace[1]);
                    File mv2 = new File(datosResponseSpace[2]);

                    //System.out.println(datosResponseSpace[1]);
                    //System.out.println(datosResponseSpace[2]);

                    System.out.println("\n");

                    for(int i = 0; i < datosResponseBackslash.length; i++){
                        System.out.println(datosResponseBackslash[i]);
                    }
                    break;
            }


        }while(!response.equals("exit"));
    }



    public static String input() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }




    public static String getPWD(){

        return  "a";
    }



    public static boolean changeDir(String dir){

     return true;
    }



    // MÉTODO PARA MOSTRAR RUTAS //
    // Te comento acá Vero, este es tu método que pusiste en un ejemplo, pero me pase un ratito investigando cosas de este y como funciona, obvio es, pero no sabía de los métodos de la clase File xD //
    // Agarre y modifique un poco el método, a parte de de cambiar nombres de variables y mensajes, modifique la parte de escupir archivos y ficheros //
    // no me gustaba que primero mostrase directorios y después archivos, hice un batiburrillo de mostrar alfábeticamente directorios y ficheros... //
    // básicamente como en linux cuando haces ls a secas xD //
    public static void printList(File f, boolean infoExtra) throws FileNotFoundException {

        // LANZAR ERROR EN CASO DE QUE NO EXISTA EL ARCHIVO //
        if (!f.exists())
            throw new FileNotFoundException("ERROR - Ruta no existe ");

        // MOSTRAR ARCHIVO SI LA RUTA ES UN ARCHIVO //
        if(f.isFile())
            System.out.println("El nombre del archivo es: " + f.getName());

            // SI LA RUTA ES UNA CARPETA, ABRA KADABRA ENSEÑA EL CONTENIDO //
        else if(f.isDirectory()) {
            // Array donde guardamos los archivos //
            File[] listao=f.listFiles();

            // Ordenar alfábeticamente el array //
            Arrays.sort(listao);

            // MOSTRAR DIRECTORIOS Y ARCHIVOS //
            for (int i=0; i<listao.length;i++) {
                if (listao[i].isDirectory()) {
                    if(infoExtra)
                        System.out.println("[D] "+listao[i].getName() + "\t" + listao[i].length() + " bytes\t"+ new Date(listao[i].lastModified()));
                    else
                        System.out.println("[D] "+listao[i].getName());

                }
                if (listao[i].isFile())
                    if(infoExtra)
                        System.out.println("[A] "+listao[i].getName() + "\t" + listao[i].length() + " bytes\t"+ new Date(listao[i].lastModified()));
                    else
                        System.out.println("[A] "+listao[i].getName());
            }

        }

    }
}

// Será útil mirar las expresiones regulares:
// https://www.w3schools.com/java/java_regex.asp