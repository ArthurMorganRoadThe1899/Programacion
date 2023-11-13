package Programacion.Java;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class array {
    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(4,5,7,1,6,10));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3,6,6,2,4,9,9));
        ArrayList<Integer> array3 = new ArrayList<>(List.of());

        array3.addAll(array2);

        for (int checkDiscard = 0; checkDiscard < array1.size(); checkDiscard++) {
            if (array1.get(checkDiscard) > array3.get(checkDiscard)) {
            array3.set(checkDiscard, array1.get(checkDiscard));
            }
        }
        System.out.println(array3);


    }
}

// https://stackoverflow.com/questions/4763974/directly-setting-values-for-an-arraylist-in-java