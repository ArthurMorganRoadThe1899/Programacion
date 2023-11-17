package Programacion.Java.ARRAYS;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class array {
    public static void main(String[] args) {

        // CREACIÓN DE LOS ARRAY //
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(4,5,7,1,6,10));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3,6,6,2,4,9,9));
        ArrayList<Integer> array3 = new ArrayList<>(List.of());

        // COPIO TODO EL ARRAY2 EN ARRAY3 //
        array3.addAll(array2);

        // CICLO EN EL QUE DESCARTO LOS NÚMEROS MÁS PEQUEÑOS DE ARRAY2 POR LOS MÁS GRANDES DE ARRAY1//
        for (int checkDiscard = 0; checkDiscard < array1.size(); checkDiscard++) {
            if (array1.get(checkDiscard) > array3.get(checkDiscard)) {
            array3.set(checkDiscard, array1.get(checkDiscard));
            }
        }
        System.out.println();
        System.out.println("El array3 quedo así con los números más grandes de array1 y array2:");
        System.out.println(array3);

    }
}