package Programacion.Java.EjerciciosDeBuclesJava;

import java.util.Scanner;

public class B_JAA6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int neg = 0, limit = 1;

        for (limit = 1; limit < 101; limit++) {
            System.out.println("Dame, dame, numerines \uD83C\uDFB5");

            int numero = in.nextInt();

            if (numero < 0) {
                neg++;
            }
            System.out.println("Negativos actuales: " + neg);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Negativos en total : " + neg);
    }
}

// Hecho por Jose Alba Arrufat //
