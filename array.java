package Programacion;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int array1[] = {4, 5, 7, 1, 6, 7};
        int array2[] = {3, 6, 6, 2, 4, 9, 9};
        int array3[];

        for (int contador = 0; contador < array2.length; contador++){
            array3[] = Arrays.stream(array2).toArray();
        }
    }
}

// Hay 3 array, 2 de ellos guardan números (uno de ellos tiene menos números almacenados), y el tercer array se encargara de comparar los números más grandes entre ellos (es decir, en 0 el más grande sería este, en 1 este, y así)