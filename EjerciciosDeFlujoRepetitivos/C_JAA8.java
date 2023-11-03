package TareaJava.EjerciciosDeFlujoRepetitivos;

import java.util.Scanner;

public class C_JAA8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;

        System.out.println("Hola, dame tres números, yo te digo cuál es el más grande que has dicho");

        System.out.println("Dame un valor");
        num1 = in.nextInt();

        System.out.println("Dame otro valor");
        num2 = in.nextInt();

        System.out.println("Y uno último");
        num3 = in.nextInt();

        int gordo = num1;

        if(num2 > gordo)
            gordo = num2;

        if(num3 > gordo)
            gordo = num3;

        System.out.println("El número más grande es " + gordo);
    }
}

// Hecho por Jose Alba Arrufat

/* Escriu un programa que llegisca tres números diferents i ens diga quin és el major. */
