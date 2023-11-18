package Programacion.Java.ARRAYS.Array1;

public class AR_JAA {
    public static void main(String[] args) {
        int[] array1 = new int[20];
        int[] array2 = new int[20];
        int[] array3 = new int[40];
        int[] array4 = new int[40];

        // Definir array1 aleatorio
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 1000);
        }

        // Definir que array2 es array1 pero al revés
        for (int i = 19, b = 0; i >= 0 && b < array1.length; i--, b++) {
            array2[i] = array1[b];
        }

        // Definir que array3 es una mitad la de array1, y la otra la de array2
        for (int i = 0, b = 20; i <= 19 && b <= 39; i++, b++) {
            array3[i] = array1[i];
            array3[b] = array2[i];
        }

        // Definir que los impares de array4 son array1, y los pares son de array2
        int par4 = 0;

        for (int i = 0; i <= 39; i++) {
            if(i  % 2 == 0){
                  array4[i] = array2[par4];
                  par4 = par4 + 1;
            }
        }

        int impar4 = 0;

        for (int i = 0; i <= 39; i++) {
            if(i  % 2 != 0){
                array4[i] = array1[impar4];
                impar4 = impar4 + 1;
            }
        }

    }
}