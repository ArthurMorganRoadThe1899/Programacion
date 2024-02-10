package Programacion.Java.calculadoraChistosa;
import java.util.Scanner;
public class calculadora {
    static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int res = 0;
        int res2 = 0;
        boolean z;
            System.out.println("Bienvenido a la caluladora, elige que quieres hacer:\n" +
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

            /*SUMA*/
            if (res == 1) {
                calCULOS datos = new calCULOS(1, 2, 3, 4, 5);
                calCULOS.suma();

            /*RESTA*/
            } else if (res == 2) {
                calCULOS datos = new calCULOS(1, 2, 3, 4, 5);
                calCULOS.resta();

            /*MULTIPLICAR*/
            } else if (res == 3) {
                calCULOS datos = new calCULOS(1, 2, 3, 4, 5);
                System.out.println("\nMultiplicación compleja (1) o multiplicar muchos números por " + calCULOS.n + " (2)");
                do {
                    try {
                        res2 = Integer.parseInt(in.nextLine());
                        z = false;
                    } catch (Exception err) {
                        z = true;
                    }

                    if(res2 != 1 && res2 != 2 || z){
                        System.out.println("Valor introducido no valido");
                        z = true;
                    }

                }while(z);

                if(res2 == 1){
                    calCULOS.multipli1();
                }else if(res2 == 2){
                    calCULOS.multipli2();
                }


            /*DIVIDIR*/
            } else if(res == 4) {
                calCULOS datos = new calCULOS(456, 2, 3, 4, 5);
                calCULOS.laTeoriaDeLadivision();
            }

        int pachucho = (int) (Math.random() * 100) + 1;

            if(pachucho == 47){
                System.out.println("https://sprites.pmdcollab.org/");
            }
    }
}
