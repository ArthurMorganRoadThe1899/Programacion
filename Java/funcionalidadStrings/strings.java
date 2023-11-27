package Programacion.Java.funcionalidadStrings;
import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        String palabro = "Macarrone' con queso";
        char arr[] = {'A','B','C','D','E'};
        int n = 3;

        System.out.println("|| VARIABLES QUE USAREMOS ||");
        System.out.println("Variable String llamada palabro: " + palabro);
        System.out.println("Array llamada arr, contenido: " + Arrays.toString(arr));
        System.out.println("Variable númerica (int) n = " + n);

        // 1. ValueOf
        System.out.println();
        System.out.println("ValueOf: Se utiliza para convertir las cosas en una cadena de String, incluido arrays");

        System.out.println(String.valueOf(arr)); // Te imprime en pantalla el array arr como si fuese una cadena de texto.

                String n2=String.valueOf(n);
                System.out.println(n2+10); // Concatenando el 3 que vale n2 con el número 10.

        // 2. Length
        System.out.println();
        System.out.println("Lenght: Te devuelve el tamaño de una variable");

        System.out.println("El tamaño del array arr es " + arr.length);
        System.out.println("El tamaño de la variable palabro es: " + palabro.length());

        // 3. charAt(posición);
        System.out.println();
        System.out.println("CharAt: es un método de java que sirve para buscar un caracter en especifico de un String");

        System.out.println("El carácter 0 de la variable palabro es: " + palabro.charAt(0));

        System.out.print("Y si ahora nos ponemos a imprimir en pantalla del carácter 0 al carácter 10... ");
        for(int i = 0; i < 10; i++){
            System.out.print(palabro.charAt(i));
        }

        // 4. equals(cadena):
        System.out.println();
        System.out.println();
        System.out.println("equals: es un método de Java que te compara dos valores de Strings y te devuelve si es true o false, se puede usar como un boolean");

        String sr1 = "Roxas";
        String sr2 = "Roxas";
        String sr3 = "Ventus";
        System.out.println("El valor de sr1 y sr2 es Roxas, por ende, son iguales, eso quiere decir que cuando hagamos un equals dará: " + sr1.equals(sr2)); // true
        System.out.println("El valor de sr1 es Roxas y el de sr3 es Ventus, por ende, eso quiere decir que al hacer un equals dará: " + sr1.equals(sr3)); // false

        // 5. equalsIgnoreCase
        System.out.println();
        System.out.println("equalsIgnoreCase: Funciona igual que equals, con la diferencia de que, este método ignora entre mayúsculas y minúsculas: ");

        sr2 = "ROXAS";
        System.out.println("El valor de sr1 sigue siendo Roxas, pero ahora el valor de sr2 es ROXAS, aún así, el valor que devuelve un equalsIgnore entr estos es: " + sr1.equalsIgnoreCase(sr2)); // true
        System.out.println("El valor entre sr1 y sr3 sigue funcionando igual con equals que con quals ignore, así que dará: " + sr1.equalsIgnoreCase(sr3)); // false

        // 6. substring
        System.out.println();
        System.out.println("substring: Se utiliza para recortar Strings, por ejemplo: ");
        System.out.println("Si de la variable palabro recortamos a partir de la posición 11 obtenemos:");
        System.out.println(palabro.substring(11));

        System.out.println();
        System.out.println("También podemos usar el substring para recortar de dos lados distintos:");
        System.out.println("Si corto a partir de la línea 11 y luego, corto como máximo hasta la línea 14, obtenemos:");
        System.out.println(palabro.substring(11,14));





        // Webgrafía (Srry, me costaba mucho seguir la documentación oficial sin conocimientos previos e_e)
        /*
        valueOf - https://www.w3api.com/Java/String/valueOf/
        length - https://www.w3schools.com/java/ref_string_length.asp#gsc.tab=0
        charAt - https://www.w3schools.com/java/ref_string_charat.asp
        equals - https://www.w3schools.com/java/ref_string_equals.asp
        equalsIgnoreCase - https://www.w3schools.com/java/ref_string_equalsignorecase.asp
        substring - https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#substring(int)
         */

    }
}