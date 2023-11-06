package Programacion.EjerciciosNumerosAleatorios;
import java.util.Random;
public class D_JAA3 {
    public static void main(String[] args) {
        int contador;

        System.out.println("Muy buenas, aquí tienes, 50 números random entre 100 y 199 mi rey");
        System.out.println();

        for (contador = 1; contador < 50; contador++){
            Random rn = new Random();
            int rNum = rn.nextInt(199) + 100;
            System.out.print(rNum + " ");
        }
        System.out.println();

    }
}