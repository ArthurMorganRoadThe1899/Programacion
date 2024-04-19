package     Programacion.Java.TryCatch.CincoDiez.ejercicio9;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class TerminalDeGatitos {

    public static void main(String[] args) {
        ArrayList<Gato> gatoLista = new ArrayList<Gato>();
        Scanner in = new Scanner(System.in);
        int count = 0;

        // Ciclo para añadir gatos al arraylist //
        for (int i = 0; i < 5; i++) {
            Gato gatoConcept = new Gato();
            System.out.println("Hola neno, dime\n¿si tuvieses un gato como lo llamarías?");
            String nombre = in.next();

            System.out.println("¿Con que edad te lo imaginas?");
            int edad = in.nextInt();

            gatoConcept.setName(nombre);

            try {
                gatoConcept.setEdad(edad);
            } catch (NumberFormatException asd) {
                System.out.println(asd.getMessage());
            }

            gatoLista.add(gatoConcept);

            // Esto es una tontería que quise meter XD //
            count = count + 1;
            if(count < 5){
                System.out.println("Again...\n");
            }
        }

        // Mostrar los nombres de todos los gaticos añadidos //
        for (int i = 0; i < gatoLista.size(); i++){
            System.out.println(gatoLista.get(i).toString() + "\n");
        }
    }
}
