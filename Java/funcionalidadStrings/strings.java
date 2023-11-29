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

        // 7. indexOf(cadena)
        System.out.println();
        System.out.println("indexOf: método que te devuelve en que momento sale una palabra por primera vez basado en carácteres");

        String babp = "Hello Mr Bean, you a live in a great planet like babu.";
        System.out.println();
        System.out.println("Utilizaremos la palabra:");
        System.out.println(" '" + babp + "' ");
        System.out.println("La palabra que a partir del carácter número " + babp.indexOf("Mr") + " es " + babp.substring(6,8));
        System.out.println("La palabra que a partir del carácter número " + babp.indexOf("babu") + " es " + babp.substring(49,53));

        System.out.println();
        System.out.println("Este método diferencia entre mayusculas de mínusculas, no es lo mismo babu que BABU o Babu.");
        System.out.println("Al intentar imprimir algo que no existe en pantalla te dará siempre -1");
        System.out.println("Babu en este String es " + babp.indexOf("Babu"));

        // 8. lastIndexOf(cadena)
        System.out.println();
        System.out.println("lastIndexOf: este método funciona exactamente igual al anterior, pero lo enfoca al revés, es decir, busca cuando fue la última vez que sale una palabra en el String basandose en los carácteres");

        String yo = "yo mr jonsey, yo mr rava";
        System.out.println();
        System.out.println("Muy bien, esta vez usaremos un String que contendrá:");
        System.out.println(" '" + yo + "'");
        System.out.println("El último " + yo.substring(3,5) + " sale en el a partir del carácter número " + yo.lastIndexOf("mr"));

        // 9. startsWith(cadena)
        System.out.println();
        System.out.println("startsWith: es un método que funciona como booleano, su función es comprobar si un String empieza o no por lo que tu le especifiques");

        String poto = "patata";
        System.out.println("Por ejemplo, vamos a usar un String con la siguiente palabra: " + poto);
        System.out.println("¿" + poto + " empieza por " +  poto.substring(2) + "? " + poto.startsWith("tata"));
        System.out.println("¿" + poto + " empieza por " +  poto.substring(1,2) + "? " + poto.startsWith("a"));
        System.out.println("¿" + poto + " empieza por " +  poto.substring(0,1) + "? " + poto.startsWith("p"));
        System.out.println("¿" + poto + " empieza por " +  poto.substring(0,3) + "? " + poto.startsWith("pat"));

        // 10. replace(cadena1, cadena2)
        System.out.println();
        System.out.println("replace: es un método que se utiliza para sustituir carácteres");

        String nameSupreme = "Mi nombre es, Goku. Pongo una de g random";
        System.out.println();
        System.out.println("Utilizaré un String con el contenido:");
        System.out.println(nameSupreme);
        System.out.println("Sustituiremos todas las G por K:");
        System.out.println(nameSupreme.replace('G', 'K'));

        System.out.println();
        System.out.println("Si te has fijado, la g minúscula se  mantiene igual, esto es porque este método diferencia entre mayúsculas y minúsculas.");

        // 11. toUpperCase()
        System.out.println();
        System.out.println("Aquí englobare dos métodos, 'toUpperCase' y 'toLowerCase'");
        System.out.println("Son dos métodos que se utilizan para pasar todo a mayúscula o minúscula respectivamente");
        String pollo = "La comunicación es fluida, Manolito";
        System.out.println("toUpperCase: " + pollo.toUpperCase());
        System.out.println("toLowerCase: " + pollo.toLowerCase());

        System.out.println();
        System.out.println("También hay una versión de estos métodos que se puede usar para contar las mayúsculas o minúsculas");

        // Comparador de mayúsculas
        int stopTHECOUNT = 0;
        for(int i = 0; i < pollo.length(); i++){
            char culo = pollo.charAt(i);

            if(Character.isUpperCase(culo)){
                stopTHECOUNT = stopTHECOUNT + 1;
            }
        }
        System.out.println("La frase " + "'" + pollo + "' tiene " + stopTHECOUNT + " mayúsculas.");

        // 12. toCharArray()
        System.out.println();
        System.out.println("toCharArray: permite transformar una variable de String en un array de carácteres");

        String falseArrString = "Algo paso";
        System.out.println();
        char [] charA = falseArrString.toCharArray();

        System.out.println();
        System.out.println("He creado una nueva variable de String, su contenido es: " + "'" + falseArrString + "'");
        System.out.println("Ahora lo he pasado a array de carácteres. voy a llamar a la primera letra de cada palabra: " + charA[0] + " " +charA[5]);

        // 13. split(expresión)
        System.out.println();
        System.out.println("split: es un método de java que te permite separar a partir de un carácter");

        // Custom input string
        String emailabro = "tidusasdeloszanarkandabes@gmail.com";
        System.out.println("Usaremos un email como ejemplo, este será " + emailabro);
        String[] arrEBro = emailabro.split("@", 33);

        System.out.println("Vamos a separar 'tidusasdeloszanarkandabes' y 'gmail' a través del @");
        for (String i : arrEBro) {
            System.out.print("[" + i + " / ");
        }
        System.out.print("]");



        // Webgrafía (Srry, me costaba mucho seguir la documentación oficial sin conocimientos previos e_e)
        /*
        valueOf - https://www.w3api.com/Java/String/valueOf/
        length - https://www.w3schools.com/java/ref_string_length.asp#gsc.tab=0
        charAt - https://www.w3schools.com/java/ref_string_charat.asp
        equals - https://www.w3schools.com/java/ref_string_equals.asp
        equalsIgnoreCase - https://www.w3schools.com/java/ref_string_equalsignorecase.asp
        substring - https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#substring(int)
        indexOf - https://www.w3schools.com/java/ref_string_indexof.asp#gsc.tab=0
        lastIndexOf - https://www.w3schools.com/java/ref_string_lastindexof.asp
        startsWith(cadena) - https://www.w3schools.com/java/ref_string_startswith.asp
        replace(cadena1, cadena2) - https://www.w3schools.com/java/ref_string_replace.asp
        toUpperCase && toLowerCase - https://www.w3schools.com/java/ref_string_touppercase.asp, https://www.tutorialspoint.com/java/character_islowercase.htm

         */

    }
}