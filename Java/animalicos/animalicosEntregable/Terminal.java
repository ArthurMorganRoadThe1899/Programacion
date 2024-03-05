package Programacion.Java.animalicos.animalicosEntregable;
import java.util.Scanner;
import static Programacion.Java.animalicos.animalicosEntregable.Inventario.animales;
import static java.lang.Integer.parseInt;

public class Terminal {
    static int respuesta;
    static private Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        animales.add(new Caballo(3, "Manolo", "Fibra", "Comiendo", "Relincho", "5-6-2017", false, 5));
        animales.add(new Perro(20, "Bobby", "Variado", "Durmiendo", "Ladrido", "2-4-2004", false, "Mestizo"));

        System.out.println("\nHOLA USUARIO, BIENVENIDO A LA TERMINAL DE ANIMALES.");
    do {
        System.out.println("\n¿QUÉ TE GUSTARÍA HACER?" +
                "\n=======================================\n" +
                "==== 1. MOSTRAR 1 ANIMAL ==============\n" +
                "==== 2. MOSTRAR TODOS LOS ANIMALES ====\n" +
                "==== 3. AÑADIR 1 ANIMAL ===============\n" +
                "==== 4. ELIMINAR 1 ANIMAL =============\n" +
                "==== 5. ELIMINAR TODOS LOS ANIMALES ===\n" +
                "==== 6. SALIR DEL LA TERMINAL =========\n" +
                "=======================================");

        // RECIBIR RESPUESTA
        boolean trueFalse = false;
        do {
            try {
                respuesta = parseInt(in.nextLine());
                trueFalse = false;
            }catch(Exception err){
                System.out.println("Valor introducido erroneo o no había tal número de animal");
                trueFalse = true;
            }

            if(respuesta < 1 || respuesta > 6){
                System.out.println("Valor introducido erroneo o no había tal número de animal");
                trueFalse = true;
            }
        }while(trueFalse);

        // ACCIONES DEL MENU
        switch (respuesta) {
            // MOSTRAR 1 ANIMAL
            case 1:
                Inventario.mostrarUnAnimal();
                break;

            // MOSTRAR TODOS LOS ANIMALES
            case 2:
                Inventario.mostrarListaDeAnimales();
                break;

            // AÑADIR 1 ANIMAL
            case 3:
                Inventario.añadirAnimal();
                break;

            // ELIMINAR 1 ANIMAL
            case 4:
                Inventario.eliminarAnimal();
                break;

            // ELIMINAR TODOS LOS ANIMALES
            case 5:
                Inventario.vaciarLista();
                break;

            // SALIR DEL LA TERMINAL
            case 6:
                System.out.println("MUY BIEN, TENGA UN BIEN DÍA USUARIO ANÓNIMO");
                break;
        }

    }while(respuesta != 6);
        System.out.print("[Desconectando terminal...]\n");
    }
}
