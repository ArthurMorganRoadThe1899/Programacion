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
        numberOfNames = getUserDataNumber(numberOfNames, 1);

        //
        System.out.println("¿Quieres guardarlo en \u001B[36musa_personas.txt\u001B[0m o en \u001B[36mrandom_generated_name.txt\u001B[0m\n"+
                           "1. \u001B[36musa_personas.txt\u001B[0m | 2. \u001B[36mrandom_generated_name.txt\u001B[0m"+
                           "(introduce 1 o 2)");
        int whereISaveI = 0;
        whereISaveI = getUserDataNumber(whereISaveI, 2);



    }





    // MÉTODOS //


    // MÉTODO TRY-CATCH PARA PEDIR NÚMEROS AL USUARIO
    public static int getUserDataNumber(int i, int type){
        boolean pass;
        // Try catch en el que guardamos el valor
        do {
            try {
                pass = true;
                // Esto es una condicional para elegir que tipo de cosa
                if(type == 1){
                    i = giveMeANumberPleaseButNotNegative();
                }else if(type == 2){
                    i = giveMeANumberPleaseBetweenOneAndTwo();
                }
            } catch (InputMismatchException e) {
                System.out.println("\u001B[31mEl dato que introduciste no es un número\u001B[0m");
                pass = false;
            }
        }while(!pass);
        return i;
    }



    // MÉTODO PARA HACER UN BUCLE EN EL QUE EL USUARIO NOS DE UN NÚMERO MAYOR A 0 //
    public static int giveMeANumberPleaseButNotNegative(){
        int i;
        // Variable de Scanner
        Scanner in = new Scanner(System.in);
        // Bucle en el que le pregunto constantemente al usuario el número de nombres
        do{
            i = in.nextInt();
            System.out.println(nopeNegativeMessage(i));
        }while(i < 1);

        return i;
    }



    // MÉTODO PARA HACER UN BUCLE EN EL QUE EL USUARIO NOS DE UN NÚMERO ENTRE 1 Y 2 //
    public static int giveMeANumberPleaseBetweenOneAndTwo(){
        int i;
        // Variable de Scanner
        Scanner in = new Scanner(System.in);
        // Bucle en el que le pregunto constantemente al usuario el número de nombres
        do{
            i = in.nextInt();
            System.out.println(oneORtwo(i));
        }while(i != 1 && i != 2);

        return i;
    }



    // MÉTODO QUE USO PARA MANDAR UN  MENSAJE SI EL NÚMERO INTRODUCIDO ES MENOR A 1  //
    public static String oneORtwo(int i){
        String message = "";
        if(i != 1 && i != 2){
            message ="\u001B[31mEl número que has de elegir ha de ser entre 1 y 2\u001B[0m";
        }
        return message;
    }



    // MÉTODO QUE USO PARA MANDAR UN  MENSAJE SI EL NÚMERO INTRODUCIDO ES MENOR A 1  //
    public static String nopeNegativeMessage(int i){
        String message = "";
        if(i < 1){
            message ="\u001B[31mPorfavor, no pongas datos negativos\u001B[0m";
        }
        return message;
    }

}
