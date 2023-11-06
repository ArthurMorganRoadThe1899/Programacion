package Programacion.EjerciciosDeBuclesJavaII;
import java.util.Scanner;

public class B_JAA16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String res;
        boolean primo = true;

        System.out.println("Dame un numerin amigo mio, te diré si es primo o no");
        num = in.nextInt();

        for(int conclus = 2; conclus < num; conclus++) {
            if (num % conclus == 0) {
                primo = false;
                break;
            }
        }
        if (primo)
            System.out.println("El número es primo mi loco");
        else
            System.out.println("Nop, el número no es primo man");
    }

    }