package Programacion.Java.File.LecturaEscritura;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws IOException {
        // Variables de rutas
        File names = new File("src/Programacion/Java/File/LecturaEscritura/Documentos/usa_nombres.txt");
        File surname = new File("src/Programacion/Java/File/LecturaEscritura/Documentos/usa_apellidos.txt");

        // Arraylist donde guardaré los nombres
        ArrayList<String> listNames = new ArrayList<String>();

        // Arraylist donde guardaré los apellidos
        ArrayList<String> listSurnames = new ArrayList<String>();

        // Preguntamos al usuario cuantos nombres quiere generar y guardamos cuantos quiere
        System.out.println("¿Cuantos nombres aleatorios quieres generar?\n" +
                           "\u001B[33mRECOMENDABLE QUE SEAN MENOS DE 100\u001B[0m");
        int numberOfNames = 0;
        numberOfNames = getUserDataNumber(numberOfNames, 1);

        // Le pregunto al usuario final si quiere guardar los nombres generados en usa_personas.txt o generar un archivo exclusivo para eso
        System.out.println("¿Quieres guardarlo en \u001B[36musa_personas.txt\u001B[0m o en \u001B[36mrandom_generated_name.txt\u001B[0m\n"+
                           "1. \u001B[36musa_personas.txt\u001B[0m | 2. \u001B[36mrandom_generated_name.txt\u001B[0m"+
                           "\n\u001B[33m(introduce 1 o 2)\u001B[0m");
        int whereISaveI = 0;
        whereISaveI = getUserDataNumber(whereISaveI, 2);

        // Acá defino una variable general donde guardo la ruta del archivo que quiere el usuario que se guarder los random name
        File fileWhereISaveTheRandomNames = fileWhereISaveTheRandomNamesSelector(whereISaveI);

        // Guardar info de tanto nombres como apellidos
        readAndAddRandomLines(names, listNames, numberOfNames);
        readAndAddRandomLines(surname, listSurnames, numberOfNames);

        // Creo o guardo como tal la info que me pide el usuario
        createAndWrite(fileWhereISaveTheRandomNames, listNames, listSurnames);
    }


    // MÉTODOS //

    // CREAR || ESCRIBIR EN EL ARCHIVO //
    public static void createAndWrite(File ruta, ArrayList<String> name, ArrayList<String> apellido) throws IOException {
        FileWriter fw = new FileWriter(ruta, true);
        BufferedWriter bw = new BufferedWriter(fw);
        FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr);

        if(!ruta.exists()){
            if(ruta.createNewFile());
        }

        // Esto lo hago para que cuando se ponga a meter personas, tenga en cuenta si el archivo es nuevo o no con los saltos de línea
        // (Esto es por si se genera el archivo de 0, que no empiece con la primera línea vacía XD)
        for(int i = 0; i < name.size(); i++){
            if(br.readLine() != null){
                bw.newLine();
                bw.write(name.get(i)+" " + apellido.get(i));
            }else{
                bw.write(name.get(i)+" " + apellido.get(i));
                bw.newLine();
            }

        }
        bw.close();
    }


    public static void readAndAddRandomLines(File file, ArrayList<String> array, int howManyOf){
        try {
            // Defino el file reader y buffer
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            // Hago un bucle en el que leere líneas random según haya especificado el usuario
            // Hago una variable count con la que me aseguraré de que el array se llene de la cantidad de líneas pedidas por el usuario
            int count = 0;

            // A mi entender el mark sirve para marcar cuantas veces puede recorrer líneas con cada reseteo hecho con el reset()
            br.mark(32456789);

            // Teniendo en cuenta la cantidad que ha pedido el usuario, me pongo a recopilar nombres random hasta que llegue al cupo
            while (count < howManyOf) {
                    // Este int de acá lo hago para generar números random, esto hará la función de
                    // elegir aleatoriamente un dato del archivo
                    int choosenOrNo = (int) (Math.random() * 100 + 1);

                    // String volátil donde guardo la línea actual
                    String ContentOfFile = br.readLine();

                    // Le digo que si el número random es igual a 1 y no es null lo guardo
                    if (choosenOrNo == 1 && ContentOfFile != null) {
                        array.add(ContentOfFile);
                        count++;
                    // Si es null reseteo al inicio del array
                    }else if(ContentOfFile == null){
                        br.reset();
                    }
            }
            // Se cierra para no dar conflicto...
            br.close();
            fr.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    // SWITCH EN EL QUE GUARDO LA RUTA FINAL //
    public static File fileWhereISaveTheRandomNamesSelector(int i){
        File fileWhereISaveTheRandomNames = new File("");
        switch (i){
            case 1:
                fileWhereISaveTheRandomNames = new File("src/Programacion/Java/File/LecturaEscritura/Documentos/usa_personas.txt");
                break;
            case 2:
                fileWhereISaveTheRandomNames = new File("src/Programacion/Java/File/LecturaEscritura/Documentos/random_generatated_name.txt");
                break;
        }
        return fileWhereISaveTheRandomNames;
    }


    // MÉTODO TRY-CATCH PARA PEDIR NÚMEROS AL USUARIO //
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


    // MÉTODO QUE USO PARA MANDAR UN  MENSAJE SI EL NÚMERO INTRODUCIDO ES MENOR A 1 //
    public static String oneORtwo(int i){
        String message = "";
        if(i != 1 && i != 2){
            message ="\u001B[31mEl número que has de elegir ha de ser entre 1 y 2\u001B[0m";
        }
        return message;
    }


    // MÉTODO QUE USO PARA MANDAR UN  MENSAJE SI EL NÚMERO INTRODUCIDO ES MENOR A 1 //
    public static String nopeNegativeMessage(int i){
        String message = "";
        if(i < 1){
            message ="\u001B[31mPorfavor, no pongas datos negativos\u001B[0m";
        }
        return message;
    }
}
