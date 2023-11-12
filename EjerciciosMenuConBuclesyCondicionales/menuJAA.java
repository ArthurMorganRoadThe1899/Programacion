package Programacion.EjerciciosMenuConBuclesyCondicionales;
import java.util.Scanner;
import java.util.ArrayList;

public class menuJAA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("*******************************\n" +
                "******* MENU DE OPCIONE'*******\n" +
                "*******************************\n" +
                "1. Permutar dos valores.\n" +
                "2. Sumatorio.\n" +
                "3. Máximo y mínimo.\n" +
                "4. Primeros números.\n" +
                "5. Irse.\n" +
                "*******************************");

        System.out.println();
        System.out.println("1. Te pediré dos números, y te los mostraré en pantalla de abajo a arriba en orden en el que me los diste");
        System.out.println("2. Dame dos valores y te los sumo loco");
        System.out.println("3. Dame cuantos valores quieras, y te diré cuál es el más grande de todos");
        System.out.println("4. Dame un número y te mostraré la sucesión de todos sus números previos a el");
        System.out.println("5. Acabas la ejecución del programa");

        System.out.println();
        System.out.println("Elige uno de estos escribiendo 1, 2, 3 , 4 o 5 para irte");

        int eleccion;
        do {
            eleccion = in.nextInt();

            if (eleccion == 1) {
                System.out.println();
                System.out.println("Muy bien, dame dos numerines ;)");
                System.out.println();

                System.out.println("Primer numerin");
                int respuesta1 = in.nextInt();
                System.out.println("Segundo numerin");
                int respuesta2 = in.nextInt();

                System.out.println();
                System.out.println(respuesta2 + "," + respuesta1);
            }

            if (eleccion == 2) {
                System.out.println();
                System.out.println("Muy bien, dame dos numerines ;)");
                System.out.println();

                System.out.println("Primer numerin");
                int respuesta1 = in.nextInt();
                System.out.println("Segundo numerin");
                int respuesta2 = in.nextInt();

                System.out.println();
                System.out.println("El resultado es " + (respuesta2 + respuesta1));
            }

            if (eleccion == 3) {
                ArrayList<Integer> nums = new ArrayList<>();
                System.out.println();
                System.out.println("Muy bien, pues dame números, si quieres cancelar escribe un número menor a uno");


                for (int counter = 1; counter == 1;){
                    int respuesta = Integer.parseInt(in.next());

                    if(respuesta > -1){
                        nums.add(respuesta);
                    }
                    if(respuesta < 0){
                        counter--;
                        int max = 0;

                        for (int checkDiscard0 = 0; checkDiscard0 < nums.size(); checkDiscard0++) {
                            if (nums.get(checkDiscard0) > max) {
                                max = nums.get(checkDiscard0);
                            }
                        }
                        int min = max;

                        for (Integer num : nums) {
                            if (num < min) {
                                min = num;
                            }
                        }
                        System.out.println();
                        System.out.println("El número más pequeño es " + min);
                        System.out.println("El número más grande es " + max);
                    }
                }
            }

            if (eleccion == 4) {

            }

            if (eleccion == 5) {
                System.out.println("Vale");
            }
        }while (eleccion > 5 || eleccion < 1);

        System.out.println();
        System.out.println("Ale, code ejecutado \uD83D\uDE0E \uD83E\uDD19");


    }
}