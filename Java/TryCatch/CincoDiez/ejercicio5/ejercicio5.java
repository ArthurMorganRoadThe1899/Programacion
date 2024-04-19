package Programacion.Java.TryCatch.CincoDiez.ejercicio5;
import java.util.Scanner;

public class ejercicio5 {

    static int p;
    
    public static void exceptionEquilies(int p){
        if(p < 0){
            throw new NumberFormatException(p + " ES  UN NÚMERO NEGATIVO, INVALIDO NENO");
        }else if(p >= 0){
            throw new NumberFormatException(p + " ES UN NÚMERO POSITIVO, INVALIDO NENO");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Dame un número");
            p = in.nextInt();
            exceptionEquilies(p);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
