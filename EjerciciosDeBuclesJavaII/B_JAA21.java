package TareaJava.EjerciciosDeBuclesJavaII;
import java.util.Scanner;

public class B_JAA21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, num2;
        System.out.println("Muy bien mi loco, esta vez te pediré que me digas un número, y yo te digo la diferencia que hay entre uno y otro");
        System.out.println("");
        System.out.println("Dame el primer número");
        num = in.nextInt();
        System.out.println("Dame otro, ha de ser mayor al anterior");
        num2 = in.nextInt();

        if(num2 < num){
            System.out.println("");
            System.out.println("Ñaca, te dije que fuese mayor que el anterior");
        }else{
            while (num2 > num && % 2 == 0){
                num++;
                System.out.print(num + " ");
            }

        }
    }
}
