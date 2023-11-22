package Programacion.Java;

import java.util.Arrays;

public class cArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;
        int mid = 0;

            for (int i = 0; i < arr.length; i++){
                arr[i] = (int) (Math.random()*30);
            }

        // Crear el primer array
        System.out.println();
        System.out.print("El array conforma de los siguientes  números: ");
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

        // Hacer el sumatorio
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }

        // Mostrar el número mediano en relación al array
        for (int i = 0; i < arr.length; i++) {
            mid = mid + arr[i];
        }
        mid = mid / arr.length;

        // Mostrar el sumatorio y el número mediano
        System.out.println();
        System.out.println("Sumatorio: " + total);
        System.out.println("Mediana: " + mid);

        // Ordenar array y mostrarlo
        System.out.print("Array ordenado: ");
        Arrays.sort(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }
        // Decír el número más pequeño del array y el más grande
        System.out.println();
        System.out.println("El número mínimo es " + arr[0] + " y el mínimo es " + arr[9]);

        // Crear el siguiente array, este se compone de todo -10
        System.out.print("arr2 se compone de: " );
        int[] arr2 = new int[10];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = -10;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // Crear otro array, es clon del anterior que hemos creado
        int[] arr2Clone = new int[10];
        arr2Clone = arr2;

        // Mostrar el clon del segundo array
        System.out.print("arr2Clone se compone de: " );
        for(int i = 0; i < arr2Clone.length; i++){
            System.out.print(arr2Clone[i] + " ");
        }
        // Definimos que en las posiciones 5 y 9 son 3
        arr2Clone[5] = 3;
        arr2Clone[9] = 3;
        System.out.println();

        // Lo mostramos con las posiciones cambiadas
        System.out.print("arr2Clone ahora se compone de: " );
        for(int i = 0; i < arr2Clone.length; i++){
            System.out.print(arr2Clone[i] + " ");
        }

        // Creamos un nuevo array y definimos que, este se compone de cada posición de los array1 y clon2 multiplicados
        int[] arr3 = new int[10];
        System.out.println();
        System.out.println("Muy bien, vamos a crear un nuevo array y, en el meteremos primer array y el último multiplicados entre ellos");
        for (int i = 0; i < arr.length; i++){
            arr3[i] = arr[i] * arr2Clone[i];
        }

        // Enseñamos el contenido
        System.out.print("arr3 se compone de: ");
        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }

        // Ordenar array3
        System.out.println();
        System.out.print("arr3 ordenado: ");
        Arrays.sort(arr3);
        for (int n : arr3) {
            System.out.print(n + " ");
        }

    }
}
