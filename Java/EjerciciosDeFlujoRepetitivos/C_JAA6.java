package Programacion.Java.EjerciciosDeFlujoRepetitivos;

import java.util.Scanner;

public class C_JAA6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        System.out.println("Hola, dame números y te los leo en orden ascendente sin importar en que orden me los des");

        System.out.println("Dame un valor");
        num1 = in.nextInt();

        System.out.println("Dame otro valor");
        num2 = in.nextInt();

        if(num2 < num1 ){
            System.out.println(num1);
            System.out.println(num2);
        }else{
            System.out.println(num2);
            System.out.println(num1);
        }
    }
}

// Hecho por Jose Alba Arrufat

/* Escriu un programa que llig dos números i els visualitza en ordre ascendent. */
