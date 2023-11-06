package Programacion.EjerciciosDeBuclesJavaII;
import java.util.Scanner;

public class B_JAA17 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num, rNum, counter = 0;
        System.out.println("Vamos allá una vez más, muy bien, esa vez dame un número, y a partir de ahí, si pones un número menor a ese, lo pondré en un conteo");
        System.out.println("");
        System.out.println("[SI QUIERES PARAR PON UN NÚMERO MENOR QUE 0]");
        System.out.println("Anyway, dame el primer numerin :]");
        rNum = in.nextInt();
        num = rNum;

        while (rNum >= 0){
            System.out.println("Dime un número");
            rNum = in.nextInt();

            if (rNum < num){
                counter++;
            }
        }
        if (rNum < 0){
            System.out.println("");
            System.out.println("");
            System.out.println("Bien, me dijiste de acabar, has introducido " + (counter - 1) + " números más pequeños que el primero que me dijiste");
        }
    }
}

