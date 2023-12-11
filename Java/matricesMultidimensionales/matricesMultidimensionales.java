package Programacion.Java.matricesMultidimensionales;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class matricesMultidimensionales {
    public static void main(String[] args) {
        int arrayM[][] = new int [4][4];

        // Llenar el contenido de cada dimensión del array
        for(int f = 0; f < arrayM.length; f++){
            for(int c = 0; c < arrayM[f].length; c++){
                arrayM[f][c] = (int) (Math.random() * (10 + 1));
            }
        }

        // Mostrar las el contenido de cada dimensión del array
        for(int f = 0; f < arrayM.length; f++){
            System.out.println("\nDimensión " + f);
            for(int c = 0; c < arrayM[f].length; c++){
                System.out.print(arrayM[f][c] + " ");
            }
        }

        // ACÁ HE DE SUMAR EN DIAGONALES

        // Mostrar de nuevo el contenido
        System.out.println("\n");
        for(int f = 0; f < arrayM.length; f++){
            System.out.println("\nDimensión " + f);
            for(int c = 0; c < arrayM[f].length; c++){
                System.out.print(arrayM[f][c] + " ");
            }
        }

    }
}
