package Programacion.Java.EjerciciosDeBuclesJavaII;
import java.util.Scanner;

public class B_JAA19 {
    public static void main(String []args){
        int limit, num;
        Scanner in = new Scanner(System.in);

        System.out.println("¿Cuantos '*' quieres?");
        num = in.nextInt();

        for (limit = 0; limit < num; limit++){
            System.out.print("*");
        }
        if (num < 0){
            System.out.println("&");
        }

    }
}