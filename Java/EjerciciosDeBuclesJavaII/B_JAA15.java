package Programacion.Java.EjerciciosDeBuclesJavaII;
import java.util.Scanner;

public class B_JAA15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int type = 0, contador = 0;

        System.out.println("Dime un multiplo de 3 y te digo cuantos lleva");
        type = in.nextInt();

        if (type % 3 > 0) {
            System.out.println("Solo multiplos de 3 loco");
        }else {

            while (type > 0) {
                type -= 3;
                contador++;
            }
            System.out.println("Vale, ahí hay " + contador + " multiplos");
        }
    }
}
