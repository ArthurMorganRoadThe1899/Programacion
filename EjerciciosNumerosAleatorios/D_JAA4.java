package Programacion.EjerciciosNumerosAleatorios;
import java.util.Random;

public class D_JAA4 {
    public static void main(String[] args) {
        int rNum;
        Random rn = new Random();

        do {
            rNum = rn.nextInt(100) + 0;
            System.out.println(rNum);
        } while (rNum != 24);

    }
    }
