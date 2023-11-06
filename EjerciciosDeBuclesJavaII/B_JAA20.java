package Programacion.EjerciciosDeBuclesJavaII;
import java.util.Scanner;

public class B_JAA20 {
    public static void main(String[] args) {
        int limit, multi, num;
        Scanner in = new Scanner(System.in);

            try {
                System.out.println("Dime un número, ire contando hasta el de manera chistosa, solo te dejo hasta 20");
                num = in.nextInt();
                boolean numMayZero = num < 0;
                boolean numMenTwenty = num > 20;
                boolean trueCondition = numMenTwenty || numMayZero;

                if (!trueCondition) {
                    for (limit = 1; limit <= num; limit++) {
                        for (multi = 1; multi <= limit; multi++) {
                            System.out.print(limit);
                        }
                        System.out.println("");
                    }
                } else {
                    System.out.println("No");
                }

            } catch (Exception err) {
                System.out.println("Pusiste algo mal loco");
            }
    }
}