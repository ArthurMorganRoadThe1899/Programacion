package     Programacion.Java.TryCatch.CincoDiez.ejercicio9;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class TerminalDeGatitos {

    public static void main(String[] args) {
        ArrayList<Gato> gatoLista = new ArrayList<Gato>();
        Scanner in = new Scanner(System.in);
        String nombre;
        int edad = 0;

        for (int i = 0; i < 2; i++){
            System.out.println("Hola neno, dime\n¿si tuvieses un gato como lo llamarías?");
            nombre = in.next();

            System.out.println("¿Con que edad te lo imaginas?");
                edad = in.nextInt();

            gatoLista.add(new Gato(nombre, edad));

        }

        for (int i = 0; i < gatoLista.size(); i++){
            System.out.println(gatoLista.get(i).toString() + "\n");
        }
    }
}
