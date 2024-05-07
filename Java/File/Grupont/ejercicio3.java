package Programacion.Java.File.Grupont;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;

public class ejercicio3 {

    public static void main(String[] args) throws IOException {
        File anotacion = new File("src/Programacion/Java/File/Grupont/anotacion.txt");
        String oracion;

        createNewFile(anotacion);

        do {
            System.out.println("Dame oración");
            oracion = input();

            write(anotacion, oracion);
        }while(!Objects.equals(oracion, ""));

    }


    // SCANNER, SE USA PORQUE ES VISTOSO //
    public static String input() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }


    // MÉTODO PARA CREAR ARCHIVOS - (SIN USAR) //
    public static void createNewFile(File p) throws IOException {

        try {
            if (p.createNewFile()) {
                System.out.println("Se ha creado el archivo " + p.getName());
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido algún error.");
            e.printStackTrace();
        }


    }


    // MÉTODO PARA ESCRIBIR EN UN ARCHIVO //
    public static void write(File p, String f){
        try {
            FileWriter esc = new FileWriter(p,true);
            BufferedWriter bufbuf = new BufferedWriter(esc);
            p.canWrite();
            bufbuf.write(f);
            bufbuf.newLine();
            bufbuf.flush();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}

