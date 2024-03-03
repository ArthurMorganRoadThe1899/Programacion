package Programacion.Java.animalicos.animalicosEntregable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class AppAnimales {
    static int respuesta, respuesta2;
    static Perro p1 = new Perro(3, "Bobby", "Variado", "Aria");
    static Perro p2 = new Perro(7, "Lulu", "Debatible", "Mestizo");
    static Gato g1 = new Gato(2, "Luna", "Basura", "Nose");
    static Gato g2 = new Gato(2, "Pecas", "Si", "De la punta de los cojones");
    static Scanner in = new Scanner(System.in);

    public void añadirAnimal(){

    }

    public String info(){
        return "\nNombre: "+Animal.nombre+"\nTipo de alimentación: "+Animal.tipo_alimentacion+"\nEdad: "+Animal.edad;
    }

    public static void main(String[] args){



        /*System.out.println("\nHola amable usuario ¿qué le gustaría hacer? :3\n");

        do{
        System.out.println("=========================================================\n" +
                "==== 1. VER INFORMACIÓN DE LOS ANIMALES EN LA GRANJA ====\n" +
                "==== 2. MODIFICAR ANIMALICOS ============================\n" +
                "==== 3. COMPARADOR DE EDADES ENTRE ANIMALES =============\n"+
                "==== 4. SALIR ===========================================\n" +
                "=========================================================\n");

        boolean trueFalse = false;
        do {
            try {
                respuesta = parseInt(in.nextLine());
                trueFalse = false;
            }catch(Exception err){
                trueFalse = true;
            }
            if(respuesta <1 || respuesta > 4){
                System.out.println("Valor introducido no valido");
                trueFalse = true;
            }
        }while(trueFalse);



        }while(respuesta != 4);*/
    }
}