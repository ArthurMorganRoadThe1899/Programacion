package Programacion.Java.calculadoraChistosa;
import java.util.Scanner;
public class calculadora {
    static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int res = 0;
        boolean z;
            System.out.println("Bienvenido a la caluladora sucio pobre, elige que quieres hacer:\n" +
                    "======================\n" +
                    "====== 1. Sumar ======\n" +
                    "===== 2. Restar ======\n" +
                    "=== 3 . Multiplicar ==\n" +
                    "===== 4. Dividir =====\n" +
                    "======================\n" +
                    "\nElige entre estas cuatro opciones\n");

            do {
                try {
                    res = Integer.parseInt(in.nextLine());
                    z = false;
                } catch (Exception err) {
                    z = true;
                }
                if(res != 1 && res != 2 && res != 3 && res != 4 || z){
                    System.out.println("Valor introducido no valido");
                    z = true;
                }
            }while(z);

            if (res == 1) {
                calCULOS.suma();
            } else if (res == 2) {
                calCULOS.resta();
            } else if (res == 3) {
                calCULOS.multipli();
            } else if(res == 4) {
                calCULOS.division();
            }


    }
}
