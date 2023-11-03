package TareaJava;
import java.util.Scanner;

public class B_JAA16fake {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = 0;
        String res;

        System.out.println("Dame un numerin amigo mio, te diré si es primo o negativo [SOLO ADMITO NÚMEROS IGUAL O MAYORES A 0]");
        num = in.nextInt();

        if (num < 0) {
            System.out.println("SOLO POSITIVOS");
        } else if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}