package Programacion.Java.TryCatch.CincoDiez.ejercicio8;
import java.sql.SQLOutput;
import java.util.Scanner;
public class TerminalDeGatitos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Gato gato1 = new Gato();
        System.out.println("Hola neno, dime\n¿si tuvieses un gato como lo llamarías?");

        String nombre = in.next();
        int edad = in.nextInt();

        gato1.setName(nombre);

        try {
            gato1.setEdad(edad);
        }catch (NumberFormatException asd){
            System.out.println(asd.getMessage());
        }

        System.out.println(gato1.toString());
    }
}
