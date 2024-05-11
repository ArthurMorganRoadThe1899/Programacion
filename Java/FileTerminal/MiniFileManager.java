package Programacion.Java.FileTerminal;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MiniFileManager {

    public static String input() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static boolean changeDir(String dir){

     return true;
    }


    // CREAR DIRECTORIOS //
    /*public static File createDirectory(File ruta, String[] directories){
        File dir = new File(directoryPath);
        if (dir.exists()) {
            return dir;
        }
        if (dir.mkdirs()) {
            return dir;
        }
        throw new IOException("Failed to create directory '" + dir.getAbsolutePath() + "' for an unknown reason.");
    }*/


    // MÉTODO PARA QUE CUANDO LE PASAS PARÁMETROS AL COMANDO LS, TE DEVUELVA LOS ARCHIVOS QUE TE PASE Y TE LISTE EL CONTENIDO DE LOS ARCHIVOS QUE LE PASE //
    // ! HAY QUE ARREGLAR ESTE CÓDIGO PORQUE FALLA LA IMPRESIÓN ! //
    public static void lOut(String[] spaceDatainfo, File ruta, String tipoLs) throws FileNotFoundException {
        File[] lista = new File[spaceDatainfo.length-1];

        for(int i = 1; i < spaceDatainfo.length; i++){
            File f = new File(ruta + spaceDatainfo[i]);
            if(f.exists()){
                lista = f.listFiles();
            }
        }



        for (int i = 0; i < lista.length; i++) {
            boolean infoExtra = !Objects.equals(tipoLs, "ls");

            // MOSTRAR DIRECTORIOS Y ARCHIVOS //
            if (lista[i].isDirectory()) {
                printList(lista[i], infoExtra);
            }

            if (lista[i].isFile())
                if (infoExtra)
                    System.out.println("[A] " + lista[i].getName() + "\t" + lista[i].length() + " bytes\t" + new Date(lista[i].lastModified()));
                else
                    System.out.println("[A] " + lista[i].getName());

        }
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