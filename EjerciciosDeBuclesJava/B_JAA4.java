package TareaJava.EjerciciosDeBuclesJava;

import java.util.Scanner;

public class B_JAA4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, num2 = 0;

        try {
            System.out.println("Hola ¿hasta que número quieres que cuente?");
            num2 = in.nextInt();

            while (num < num2) {
                num++;
                System.out.println(num);
            }
        }catch (Exception err){
            System.out.println("El número que me diste o lo pusiste mal o directamente ni era un número, vuelvelo a intentar mi rey");
        }finally{
            System.out.println("Ala, ten buen día");
        }


    }
}

// Hecho por Jose Alba Arrufat //
