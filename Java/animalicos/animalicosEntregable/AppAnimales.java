package Programacion.Java.animalicos.animalicosEntregable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class    AppAnimales {
    static int respuesta, respuesta2;
    static Perro p1 = new Perro(20, "Bobby", "Variado", "Durmiendo", "Ladrido", "2-4-2004", false, "Mestizo");
    static Perro p2 = new Perro(17, "Lulu", "Mucho pienso", "Jugeteando", "Ladrido", "3-2-2007", false, "Chihuahua");
    static Gato g1 = new Gato(17, "Luna", "Variado con carne", "-", "Maullido", "6-7-1967", true, "???");
    static Gato g2 = new Gato(9, "Pecas", "Variado con bichos", "Comiendo", "Maullido", "8-2-2015", false, "Potente");
    static Scanner in = new Scanner(System.in);
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