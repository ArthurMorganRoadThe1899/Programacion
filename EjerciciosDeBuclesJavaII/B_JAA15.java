package EjerciciosBuclesII;
import java.util.Scanner;

public class B_JAA15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int mul = 3, type = 0, contador = 0;
        String respuesta;

        System.out.println("Dime un multiplo de 3 y te digo cuantos lleva");
        type = in.nextInt();

        do {
        if(type % 3 > 0){
            System.out.println("Solo multiplos de 3 loco");
        }while(true){
            if (type > 0) {
                type -= 3;
                contador++;
                }
                System.out.println("Vale, ahí hay " + contador + " multiplos");
                System.out.println("");
                System.out.println("¿Introducir otro valor?");
                respuesta = in.nextLine();
            }
        }while (respuesta.equals("si"));
    }
}

