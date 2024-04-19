package Programacion.Java.TryCatch.CincoDiez.ejercicio7;
import java.util.Scanner;

public class WaitApp {

    public static void irrupcion() throws InterruptedException {
        if (Thread.interrupted())
            throw new InterruptedException("Programa interrumpido");
    }

    public static void main(String[] args) throws InterruptedException {
        boolean yesOrNo = true;
        Scanner in = new Scanner(System.in);

        System.out.println("¿Cuanto quieres esperar neno?");
        int segundos = in.nextInt();


        int trueSegundos = segundos * 1000;

        long tiempoDeEspera = System.currentTimeMillis();

        // Descomenta para que el programa sea irrumpido
        try {
            //Thread.currentThread().interrupt();
            //irrupcion();
            Thread.sleep(trueSegundos);
        }catch (InterruptedException rar){
            System.out.println(rar.getMessage());
            yesOrNo = false;
        }

        if(yesOrNo){
            System.out.println("¿Que se siente desperdiciando " + segundos + " de tu vida?");
        }
    }
}
