package Programacion.Java.EjerciciosNumerosAleatorios;
import java.util.Random;
import java.util.Scanner;

public class D_JAA1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Muy bien loco, lancemos tres dados, cuando estes listo dale a Enter");
        String respuesta = in.nextLine();

        System.out.println();
        System.out.println("Bien, allá vamos");
        int nRandom1 = rn.nextInt(6) + 1, nRandom2 = rn.nextInt(6) + 1, nRandom3 = rn.nextInt(6) + 1, total = nRandom1 + nRandom2 + nRandom3;

        System.out.println("Primer dado: " + nRandom1);
        System.out.println("Segundo dado: " + nRandom2);
        System.out.println("Tercer dado: " + nRandom3);
        System.out.println();
        System.out.println("Muy bien, el resultado de " + nRandom1 + " / " + nRandom2 + " / " + nRandom3 + " es igual a " + total);

        // A partir de aquí esto es código for fun :P //
        System.out.println();

        if (total <=4){
            System.out.println("Mejor suerte la próxima vez..");
        }else if (total <= 9){
            System.out.println("Una tirada más que decente");
        }else if (total <= 12){
            System.out.println("Nice tirada");
        }else if (total <=17){
            System.out.println("Muy buena tirada \uD83D\uDE0E");
        }else if (total == 18){
            System.out.println("Qué se prepare ese Tiamat, esta ante el verdadero Dungeons and Dragons");
        }
    }
}