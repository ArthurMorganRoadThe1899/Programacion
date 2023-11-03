package TareaJava.EjerciciosDeBuclesJava;

import java.util.Scanner;

public class B_JAA9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = 1;

        System.out.println("Hola, dame un numerin y te doy el resultado de sumarlo con los 10 primeros numeros naturales y también multiplicarlo :)");

        num = in.nextInt();
        for (double contador = 0; contador < 11; contador++){
            double resultadoSum = num + contador;
            double resultadoMul = num * contador;
            System.out.println(num + " sumado "+ contador + " es igual " + resultadoSum + " ||| Y el resulado de la multiplicación de estos es " + resultadoMul);
        }

    }
}

