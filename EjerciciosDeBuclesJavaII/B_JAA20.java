package TareaJava.EjerciciosDeBuclesJavaII;
import java.util.Scanner;

public class B_JAA20 {
    public static void main(String[] args) {
        int limit = 20, num;
        Scanner in = new Scanner(System.in);

        System.out.println("Dime un número, ire contando hasta el de manera chistosa, solo te dejo hasta 20");
        num = in.nextInt();
        boolean numMayZero = num < 0;
        boolean numMenTwenty = num > 20;
        boolean trueCondition = numMenTwenty || numMayZero;

        if (!trueCondition)
            for (num = 1; num <= limit; num++) {
                System.out.println(num);
        }else{
            System.out.println("No");
        }

    }
}