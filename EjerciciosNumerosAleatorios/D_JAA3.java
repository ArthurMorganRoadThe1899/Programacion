package Programacion.EjerciciosNumerosAleatorios;
import java.util.Random;
import java.util.ArrayList;
public class D_JAA3 {
    public static void main(String[] args) {
        int contador, rNum;
        ArrayList<Integer> nums = new ArrayList<>();


        System.out.println("Muy buenas, aquí tienes, 50 números random entre 100 y 199 mi rey");
        System.out.println();

        for (contador = 0; contador < 50; contador++) {
            Random rn = new Random();
            rNum = rn.nextInt(100) + 100;
            System.out.print(rNum + " ");
            nums.add(rNum);
        }
        System.out.println();

        int max = 0;
        for (int checkDiscard = 0; checkDiscard < nums.size(); checkDiscard++) {
            if (nums.get(checkDiscard) > max) {
                max = nums.get(checkDiscard);
            }
        }
        int min = max;
        for (int checkDiscard = 0; checkDiscard < nums.size(); checkDiscard++) {
            if (nums.get(checkDiscard) < min) {
                min = nums.get(checkDiscard);
            }
        }
        int mid = 0;
        for (int checkDiscard = 0; checkDiscard < nums.size(); checkDiscard++) {
            mid = mid + nums.get(checkDiscard);
        }
        mid = mid / nums.size();

        System.out.println();
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + mid);
        System.out.println("Máximo: " + max);


        }
    }