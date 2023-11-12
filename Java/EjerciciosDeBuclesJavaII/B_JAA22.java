package Programacion.Java.EjerciciosDeBuclesJavaII;
import java.util.Scanner;

  public class B_JAA22 {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int espacio, asterisco, multiplicador;

try {
    System.out.print("Quiero hacer una piramide ¿Cuantas filas le hago? ");
    int num = in.nextInt();
    System.out.println();

    for (multiplicador = 1; multiplicador <= num; multiplicador++) {
        for (espacio = 1; espacio <= num - multiplicador; espacio++) {
            System.out.print(" ");
        }

        for (asterisco = 1; asterisco <= 2 * multiplicador - 1; asterisco++) {
            System.out.print("*");
        }
        System.out.println();
    }
}catch(Exception err){
    System.out.println();
    System.out.println("Pusiste algo que no toca, el error en cuestión es:");
    System.out.println(err);
}

  }
}