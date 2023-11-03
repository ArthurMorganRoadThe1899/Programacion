package TareaJava.EjerciciosDeFlujoRepetitivos;

import java.util.Scanner;

public class C_JAA5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;

        System.out.println("Hola, dame un número y te digo si es positivo o negativo");

        System.out.println("Dame un valor");
        num1 = in.nextInt();

        if(num1 <= -1){
            System.out.println("El número " + num1 + " es negativo");
        }else{
            System.out.println("El número " + num1 + " es positivo");
        }
    }
}

// Hecho por Jose Alba Arrufat

/* Escriu un programa que llig un número i em diu si és positiu o negatiu, considerarem el zero com a positiu. */
