package Programacion.Java.EjerciciosDeFlujoRepetitivos;

import java.util.Scanner;

public class C_JAA4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        System.out.println("Hola, dame dos valores y te digo quien es mayor de los dos y quien menor");

        System.out.println("Dame un valor");
        num1 = in.nextInt();

        System.out.println("Dame otro valor");
        num2 = in.nextInt();

        if(num2 > num1 ){
            System.out.println("Muy bien, " + num2 + " es mayor que " +  num1);
        }else{
            System.out.println("Vale, pues " + num1 + " es mayor que " + num2);
        }
    }
}

// Hecho por Jose Alba Arrufat

 /* Escriu un programa que llig 2 números i mostra el major. */
