package Programacion.Java.animalicos.animalicosEntregable;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Inventario {
    static private Scanner in = new Scanner(System.in);
    static private ArrayList<Animal> animales = new ArrayList();
    public Inventario(){

    }

    public static void mostrarListaDeAnimales(){
        for(int i = 0; i < animales.size(); i++){
            Animal animal = animales.get(i);
            animal.info();
        }
    }

    public static void mostrarUnAnimal(){

        System.out.println("Hay " + animales.size() + " en la lista, ¿cuál eliges?");
        int respuesta = 0;
        boolean trueFalse = false;
        do {
            try {
                respuesta = parseInt(in.nextLine());
                // El restarle a respuesta -1 lo hago para que el usuario final, escriba pensando "el primer animal es 1"
                respuesta = respuesta - 1;
                System.out.println(animales.get(respuesta));
                trueFalse = false;
            }catch(Exception err){
                System.out.println("Valor introducido erroneo o no había tal número de animal");
                trueFalse = true;
            }
        }while(trueFalse);

    }

    public static void main(String[] args) {
        // Arreglar que cuando invoques cualquier método, siempre te vaya a vomitar lo último echo
        animales.add(new Caballo(3, "Manolo", "Fibra", "Comiendo", "Relincho", "5-6-2017", false, 5));
        animales.add(new Perro(20, "Bobby", "Variado", "Durmiendo", "Ladrido", "2-4-2004", false, "Mestizo"));
        mostrarListaDeAnimales();
    }
}
