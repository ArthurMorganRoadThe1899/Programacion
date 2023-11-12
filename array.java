package Programacion;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class array {
    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(4,5,7,1,6,7));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3,6,6,2,4,9,9));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList());

        for (int checkDiscard = 0; checkDiscard < array2.size(); checkDiscard++) {
            if (array2.get(checkDiscard) > array3.get(checkDiscard)) {
                array3.get(checkDiscard) = array2.get(checkDiscard);

        }

            if (array1.get(checkDiscard) > array3.get(checkDiscard)) {
                array3.get(checkDiscard) = array1.get(checkDiscard);

            }
            System.out.println(array3);
        }

    }
}

// https://stackoverflow.com/questions/4763974/directly-setting-values-for-an-arraylist-in-java

// Hay 3 array, 2 de ellos guardan números (uno de ellos tiene menos números almacenados), y el tercer array se encargara de comparar los números más grandes entre ellos (es decir, en 0 el más grande sería este, en 1 este, y así)