package Programacion.Java.File.Grupont;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;

public class ejercicio2 {

    public static void main(String[] args) throws IOException {
        File sentence = new File("src/Programacion/Java/File/Grupont/sentences.txt");
        String oracion;

        // El deleteFIleIfExists se lo robe a Joseph, me gusto qwq
        deleteFileIfExist(String.valueOf(sentence));

        do {
            System.out.println("Dame oración");
            oracion = input();

            write(sentence, oracion);
        }while(!Objects.equals(oracion, ""));

    }


    // SCANNER, SE USA PORQUE ES VISTOSO //
    public static String input() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }


    // MÉTODO PARA CREAR ARCHIVOS - (SIN USAR) //
    /*public static void createNewFile(File p) throws IOException {

        try {
            if (p.createNewFile()) {
                System.out.println("Se ha creado el archivo " + p.getName());
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido algún error.");
            e.printStackTrace();
        }


    }*/


    // MÉTODO PARA ESCRIBIR EN UN ARCHIVO //
    public static void write(File p, String f){
        try {
            FileWriter esc = new FileWriter(p,true);
            BufferedWriter bufbuf = new BufferedWriter(esc);
            bufbuf.write(f);
            bufbuf.newLine();
            bufbuf.flush();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
        }
    }


    // BORRAR EL ARCHIVO SI EXISTE (srry, esto se lo borre a Joseph, me gusto demasiado :P)//
    public static void deleteFileIfExist(String pathname){
        File file = new File(pathname);
        if (file.length() >0) file.delete();
    }
}

