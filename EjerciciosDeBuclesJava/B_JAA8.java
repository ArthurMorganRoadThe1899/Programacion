package TareaJava.EjerciciosDeBuclesJava;

import java.util.Scanner;

public class B_JAA8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int neg = 0, limit = 1, pos = 0;

        System.out.println("");
        System.out.println("Hola, este es un programa que te cuenta números negativos y positivos hasta el infinito, si te cansas, al escribir 0 se acaba la ejecución");
        for (limit = 1; limit != 0;) {
            System.out.println("Dame, dame, numerines \uD83C\uDFB5");

            int numero = in.nextInt();

            if (numero < 0) {
                neg++;
            }else if (numero > 0){
                pos++;
            }else if (numero == 0){
                break;
            }

            System.out.println("Negativos actuales: " + neg);
            System.out.println("Positivos actuales: " + pos);
        }
        System.out.println("");
        System.out.println("RESULTADOS");
        System.out.println("Negativos en total: " + neg);
        System.out.println("Positivos en total: " + pos);

    }
}

// Hecho por Jose Alba Arrufat //
