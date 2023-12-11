package Programacion.Java.matricesMultidimensionales;
import java.util.Arrays;
import java.util.Scanner;

public class matricesMultidimensionales {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int arrayM[][] = new int [4][4];

        System.out.println("\nTenemos un array multidimensional\n¿Qué quieres hacer con el?");
        do {
            System.out.println("*******************************\n" +
                    "******* MENU DE OPCIONE'*******\n" +
                    "*******************************\n" +
                    "1. Poner números [TODO EL ARRAY].\n" +
                    "2. Sumar diagonal hacía delante.\n" +
                    "3. Sumar diagonal a la inversa.\n" +
                    "4. Sumar toda una columna.\n" +
                    "5. Irse.\n" +
                    "*******************************");

            res = in.nextInt();

            // Llenar el contenido de cada dimensión del array
            if(res == 1){
                for (int f = 0; f < arrayM.length; f++) {
                    for (int c = 0; c < arrayM[f].length; c++) {
                        System.out.println("Fila " + f + " / Columna " + c);
                        int aR = in.nextInt();
                        arrayM[f][c] = aR;
                    }
                }
                System.out.println("\nMuy bien, el array multidimensional se compone de:");

                // Mostrar las el contenido de cada dimensión del array
                for (int f = 0; f < arrayM.length; f++) {
                    System.out.println("\nDimensión " + f);
                    for (int c = 0; c < arrayM[f].length; c++) {
                        System.out.print(arrayM[f][c] + " ");
                    }
                }
                System.out.println("\nPresiona enter para continuar: ");
                in.nextLine();
                String adieu = in.nextLine();
            }

            // Sumar diagonal
            if(res == 2){
                int suma = 0;

                System.out.println("Muy bien, sumaré un número de cada fila, en diagonal de arriba a abajo");
                System.out.println("LO QUE HARÉ SERÁ ESTO: [0-0 + 1-1 + 2-2 + 3-3]");

                for(int i = 0; i <= 3; i++){
                    suma += arrayM[i][i];
                }

                System.out.println("La suma diagonal dio " + suma);

                System.out.println("\nPresiona enter para continuar: ");
                in.nextLine();
                String adieu = in.nextLine();
            }

            // Sumar diagonal inverso
            if(res == 3){
                int suma = 0;

                System.out.println("Muy bien, sumaré un número de cada fila, en diagonal de arriba a abajo a la inversa");
                System.out.println("LO QUE HARÉ SERÁ ESTO: [0-3 + 1-2 + 2-1 + 3-0]");

                for(int i = 0, b = 3; i <= 3 && b >= 0; i++, b--){
                    suma += arrayM[b][i];
                }

                System.out.println("La suma diagonal a la inversa dio " + suma);

                System.out.println("\nPresiona enter para continuar: ");
                in.nextLine();
                String adieu = in.nextLine();
            }


            // Sumar columna a elección
            if(res == 4){
                int suma = 0;
                int r;

                System.out.println("Muy bien ¿qué columna quieres sumar?\n[SOLO SE ADMITE DE 0 A 3]");

                do {
                    r = in.nextInt();
                }while(r > 3 || r < 0);

                for(int i = 0; i <= 3; i++){
                    suma += arrayM[r][i]; // REVISAR
                }

                System.out.println("La suma de la columna " + r  + " es " + suma);

                System.out.println("\nPresiona enter para continuar: ");
                in.nextLine();
                String adieu = in.nextLine();
            }
        }while(res != 5);
    }
}
