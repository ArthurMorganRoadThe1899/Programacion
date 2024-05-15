package Programacion.Java.File.LecturaEscritura;

import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        // Variables de rutas
        File names = new File("src/Programacion/Java/File/LecturaEscritura/Documentos/usa_nombres.txt");
        File surname = new File("src/Programacion/Java/File/LecturaEscritura/Documentos/usa_apellidos.txt");
        File randomGeneratedNames = new File("src/Programacion/Java/File/LecturaEscritura/Documentos/random_generatated_name.txt");

        // Arraylist donde guardaré los nombres
        ArrayList<String> listNames = new ArrayList<String>();

        // Arraylist donde guardaré los apellidos
        ArrayList<String> listSurnames = new ArrayList<String>();

        // Preguntamos al usuario cuantos nombres quiere generar y guardamos cuantos quiere
        System.out.println("¿Cuantos nombres aleatorios quieres generar?");
        int numberOfNames = 0;
        numberOfNames = getUserDataNumber(numberOfNames);


        System.out.println("¿Quieres guardarlo en usa_personas.txt o en random_generated_name.txt\n1. usa_personas.txt | 2. random_generated_name.txt");
        int whereISaveIt;


    }

    public static void notNumber(){
        throw new InputMismatchException("El dato que introduciste no es un número");
    }


    // MÉTODO TRY-CATCH PARA PEDIR NÚMEROS AL USUARIO
    public static int getUserDataNumber(int i){
        // Try catch en el que guardamos el valor
        try{
            i = giveMeButPleaseNotNegative();
        }catch(InputMismatchException e){
            notNumber();
            System.out.println(e.getMessage());
        }

        return i;
    }

    // MÉTODO PARA HACER UN BUCLE EN EL QUE EL USUARIO NOS DE UN NÚMERO //
    public static int giveMeButPleaseNotNegative(){
        int i;
        // Variable de Scanner
        Scanner in = new Scanner(System.in);

        do{
            i = in.nextInt();
            System.out.println(nopeNegativeMessage(i));
        }while(i < 0);

        return i;
    }


    public static String nopeNegativeMessage(int i){
        String message = "";

        if(i < 0){
            message ="Porfavor, no pongas datos negativos";
        }else{
            message = "Dato introducido correcto";
        }

        return message;
    }

}
