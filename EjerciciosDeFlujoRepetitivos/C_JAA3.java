package TareaJava.EjerciciosDeFlujoRepetitivos;

import java.util.Scanner;

public class C_JAA3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
            int num1 = 0, num2 = 0, resSum = 0, resRes = 0, resMul = 0, resDiv = 0, resProd = 0, zero = 0;

            System.out.println("Hola, dame valores y te hago una suma, resta, multiplicación, división y te doy el producto de este último :]");

              System.out.println("Dame un valor");
              num1 = in.nextInt();

              System.out.println("Dame otro valor");
              num2 = in.nextInt();

              resSum = num1 + num2;
              resRes = num1 - num2;
              resMul = num1 * num2;


              if (num2 == zero){
                  System.out.println("Lo siento mi loco, no te puedo permitir que dividas entre 0, lo sustituyo por 1");
                  num2 = 1;
                  resProd = num1 % num2;
                  resDiv = num1 / num2;
                  System.out.println("Muy bien, el resultado de la suma es " + resSum + ", el resultado de la resta es " + resRes + ", el resultado de la multiplicación es " + resMul + ", el resultado de la división es " + resDiv + ", y su producto es " + resProd );

              }else{
                  resProd = num1 % num2;
                  resDiv = num1 / num2;
                  System.out.println("Muy bien, el resultado de la suma es " + resSum + ", el resultado de la resta es " + resRes + ", el resultado de la multiplicación es " + resMul + ", el resultado de la división es " + resDiv + ", y su producto es " + resProd );
              }

    }
}

// Hecho por Jose Alba Arrufat

/*  Escriu un programa que llig dos números, calcula i mostra el valor de la seua suma, resta,producte i divisió. (Tingues en compte la divisió per zero). */
