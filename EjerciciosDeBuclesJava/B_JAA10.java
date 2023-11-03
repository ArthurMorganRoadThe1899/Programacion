package TareaJava.EjerciciosDeBuclesJava;

import java.util.Scanner;

public class B_JAA10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int dieces = 0, desgracias = 0, numerin = 0;

        System.out.println("Dame diez notas evaluadas del 1 al 10 y ya te digo si hay alguno, demuestrame que tus muchachos son chicos listos, o que tu eres listo");

        for (int limit = 0; limit < 10; limit++){

            numerin = in.nextInt();

            if (numerin == 10){
                dieces++;
            }else if (numerin < 0){
                System.out.println("Lo siento mi loco, pero notas tan abajas no aceptamos, ya tenemos suficiente con leer las nuestras");
            }else if (numerin > 10){
                System.out.println("No estamos en japón loco, del 1 al 10");
            }else if (numerin < 10){
                desgracias++;
            }

        }
        System.out.println("Bien, has sacado " + dieces + " dieces, y el número de notas 'pésimas' a sido " + desgracias);

    }
}

