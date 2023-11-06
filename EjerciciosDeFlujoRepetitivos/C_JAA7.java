package Programacion.EjerciciosDeFlujoRepetitivos;

import java.util.Scanner;

public class C_JAA7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        System.out.println("Hola, dame dos valores y te digo quien es mayor de los dos, quien menor o si son iguales");

        System.out.println("Dame un valor");
        num1 = in.nextInt();

        System.out.println("Dame otro valor");
        num2 = in.nextInt();

      if(num1 == num2){
          System.out.println(num1 +" es lo mismo que " + num2);
      } else if (num1 < num2) {
          System.out.println(num2 + " es mayor que " + num1);
      }else {
          System.out.println(num1 + " es mayor que " + num2);
      }
    }
}

// Hecho por Jose Alba Arrufat

/* Escriu un programa que llig dos números i ens diu quin és el major o si són iguals. */
