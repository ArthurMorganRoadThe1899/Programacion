import java.util.Random;
import java.util.Scanner;

public class B_JAA13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rn = new Random();
        int num = 0;
        String respuesta;

        System.out.println("Hola mijo, preparate, porque soy muy listo y te voy a adivinar el un número del 1 al 100, allá vamos");
        System.out.println("");
        do {
            int nRandom = rn.nextInt(100) + 1;
            System.out.println("Tu número es " + nRandom + "? en cuyo caso escribe 'si', si no, di 'no'");

            respuesta = in.nextLine();

            if (!respuesta.equalsIgnoreCase("si")){
                System.out.println("Sad papu");
            }else if(!respuesta.equalsIgnoreCase("no")){
                System.out.println("Esque chaval, en mi casa me llaman Akinator \uD83D\uDE0E");
            }else{
                System.out.println("ein");
            }
            System.out.println("");
            System.out.println("¿Quieres que lo volvamos a hacer?, simplemente escribe 'si' si quieres, si no dale enter y vete de aquí loco");
            respuesta = in.nextLine();

        }while (respuesta.equals("si"));
    }
}


