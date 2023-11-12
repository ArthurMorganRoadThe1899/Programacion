package Programacion.Java.EjerciciosDeBuclesJava;

import java.util.Scanner;

public class B_JAA12 {
    public static void main(String[] args){
        int A = 0, B = 0, resultado = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Hola nene, dame un numerin");
        A = in.nextInt();

        System.out.println("Muy bien, dame otro y te hago la potencia, este numero será la potencia del anterior");
        B = in.nextInt(); 
        for (int limit = 1; limit <= B; limit++){
            resultado *= A;
        }
        System.out.println("La potencia de " + A + " que es " + B + " da como resultado " + resultado);
    }
}


