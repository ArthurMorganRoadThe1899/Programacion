package Programacion.Java.cesar;
import java.util.Scanner;


public class cifradoCesar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 97, z = 122;
        int A = 65, Z = 90;
        String rS;
        int rC = 0;

        System.out.println("Dime una palabra, y la cifrare con el cifrado César de la magnitud de desplazamiento que busques.");

        do {
            rS = in.nextLine(); // Palabra a cifrar
        } while (rS.isEmpty());

        System.out.println("¿Que tipo de cifrado César quieres utilizar?");

            try {
                rC = in.nextInt(); // Número de rotación
            }catch (Exception e){
                System.out.println("Solo acepto números enteros");
            }

        char [] rCS = rS.toCharArray();

            for(int i = 0; i < rCS.length; i++){

                if(rCS[i] == 32){
                    System.out.print(rCS[i]);
                }else if(Character.isUpperCase(rCS[i])){
                    // Función para dar la vuelta a las mayúsculas
                    rCS[i] += rC;
                        if (rCS[i] <= A) {
                            while (rCS[i] < A) rCS[i] += 26;
                        } else if (rCS[i] >= Z) {
                            while (rCS[i] > Z) rCS[i] -= 26;
                        }
                    }else if(Character.isLowerCase(rCS[i])) {
                    // Función para dar la vuelta a las minúsculas
                    rCS[i] += rC;
                        if (rCS[i] <= a) {
                            while (rCS[i] < a) rCS[i] += 26;
                        } else if (rCS[i] >= z) {
                            while (rCS[i] > z) rCS[i] -= 26;
                        }
                    }
                    System.out.print(rCS[i]);
                }
            }
        }

