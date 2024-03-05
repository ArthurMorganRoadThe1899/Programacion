package Programacion.Java.animalicos.animalicosEntregable;
import Programacion.Java.animalicos.animalicosEntregable.aves.Canario;
import Programacion.Java.animalicos.animalicosEntregable.aves.Loro;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Inventario {
    static private Scanner in = new Scanner(System.in);
    static private int respuesta;
    static protected ArrayList<Animal> animales = new ArrayList();

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
                Animal animal = animales.get(respuesta);
                animal.info();
                trueFalse = false;
            }catch(Exception err){
                System.out.println("Valor introducido erroneo o no había tal número de animal");
                trueFalse = true;
            }
        }while(trueFalse);

    }

    public static void añadirAnimal(){
        // Variables del método
        String nombre;
        int edad;
        String alimentacion;
        String estado;
        String ruido;
        String fecha;
        boolean afirmacion;
        int patas;
        String raza;
        String pedigri;
        boolean vuela;
        String color;
        boolean canta;
        String origen;
        boolean habla;

        // Esta variable es solo para usarla para cuando me da conflicto pasar de un scanner a otro.
        String placeholder;

        // Preguntar al usuario final que tipo de animal desea seleccionar
        System.out.println("¿Que tipo de animal te gustaría añadir?\n\n" +
                "====================================\n" +
                "==== 1. CABALLO ====================\n" +
                "==== 2. PERRO ======================\n" +
                "==== 3. GATO =======================\n" +
                "==== 4. LORO =======================\n" +
                "==== 5. CANARIO ====================\n" +
                "====================================");

        int respuesta = 0;
        boolean trueFalse = false;
        do {
            try {
                respuesta = parseInt(in.nextLine());
                trueFalse = false;
            }catch(Exception err){
                System.out.println("Valor introducido erroneo o no había tal número de animal");
                trueFalse = true;
            }

            if(respuesta < 1 || respuesta > 5){
                System.out.println("Valor introducido erroneo o no había tal número de animal");
                trueFalse = true;
            }
        }while(trueFalse);

        // Switch para decidir cuál animal modificar
        switch (respuesta){

            // Añadir caballo
            case 1:
                System.out.println("NOMBRE:");
                nombre = in.nextLine();

                System.out.println("EDAD:");
                edad = parseInt(in.nextLine());

                System.out.println("TIPO DE ALIMENTACIÓN:");
                alimentacion = in.nextLine();

                System.out.println("ESTADO:");
                estado = in.nextLine();

                System.out.println("TIPO DE RUIDO:");
                ruido = in.nextLine();

                System.out.println("FECHA NACIMIENTO [DD-MM-YYYY]");
                fecha = in.nextLine();

                System.out.println("¿ESTA MUERTO? [ESCRIBE true/false]");
                afirmacion = in.nextBoolean();

                System.out.println("NÚMERO DE PATAS:");
                patas = in.nextInt();

                animales.add(new Caballo(edad, nombre, alimentacion, estado, ruido, fecha, afirmacion, patas));
                break;

            // Añadir perro
            case 2:
                System.out.println("NOMBRE:");
                nombre = in.nextLine();

                System.out.println("EDAD:");
                edad = parseInt(in.nextLine());

                System.out.println("TIPO DE ALIMENTACIÓN:");
                alimentacion = in.nextLine();

                System.out.println("ESTADO:");
                estado = in.nextLine();

                System.out.println("TIPO DE RUIDO:");
                ruido = in.nextLine();

                System.out.println("FECHA NACIMIENTO [DD-MM-YYYY]");
                fecha = in.nextLine();

                System.out.println("¿ESTA MUERTO? [ESCRIBE true/false]");
                afirmacion = in.nextBoolean();

                System.out.println("RAZA:");
                raza = in.next();

                animales.add(new Perro(edad, nombre, alimentacion, estado, ruido, fecha, afirmacion, raza));
                break;

            // Añadir gato
            case 3:
                System.out.println("NOMBRE:");
                nombre = in.nextLine();

                System.out.println("EDAD:");
                edad = parseInt(in.nextLine());

                System.out.println("TIPO DE ALIMENTACIÓN:");
                alimentacion = in.nextLine();

                System.out.println("ESTADO:");
                estado = in.nextLine();

                System.out.println("TIPO DE RUIDO:");
                ruido = in.nextLine();

                System.out.println("FECHA NACIMIENTO [DD-MM-YYYY]");
                fecha = in.nextLine();

                System.out.println("¿ESTA MUERTO? [ESCRIBE true/false]");
                afirmacion = in.nextBoolean();

                System.out.println("PEDIGRI:");
                pedigri = in.next();

                animales.add(new Gato(edad, nombre, alimentacion, estado, ruido, fecha, afirmacion, pedigri));
                break;

            // Añadir loro
            case 4:
                System.out.println("NOMBRE:");
                nombre = in.nextLine();

                System.out.println("EDAD:");
                edad = parseInt(in.nextLine());

                System.out.println("TIPO DE ALIMENTACIÓN:");
                alimentacion = in.nextLine();

                System.out.println("ESTADO:");
                estado = in.nextLine();

                System.out.println("TIPO DE RUIDO:");
                ruido = in.nextLine();

                System.out.println("FECHA NACIMIENTO [DD-MM-YYYY]");
                fecha = in.next();

                System.out.println("¿ESTA MUERTO? [ESCRIBE true/false]");
                afirmacion = in.nextBoolean();

                System.out.println("¿PUEDE VOLANDAR? [ESCRIBE true/false]");
                vuela = in.nextBoolean();

                System.out.println("DAME UNA BREVE DESCRIPCIÓN DE SU ORIGEN:");
                origen = in.next();

                System.out.println("¿PUEDE HABLAR? [ESCRIBE true/false]");
                habla = in.nextBoolean();

                animales.add(new Loro(edad, nombre, alimentacion, estado, ruido, fecha, afirmacion, vuela, origen, habla));
                break;

            // Añadir canario
            case 5:
                System.out.println("NOMBRE:");
                nombre = in.nextLine();

                System.out.println("EDAD:");
                edad = parseInt(in.nextLine());

                System.out.println("TIPO DE ALIMENTACIÓN:");
                alimentacion = in.nextLine();

                System.out.println("ESTADO:");
                estado = in.nextLine();

                System.out.println("TIPO DE RUIDO:");
                ruido = in.nextLine();

                System.out.println("FECHA NACIMIENTO [DD-MM-YYYY]");
                fecha = in.nextLine();

                System.out.println("¿ESTA MUERTO? [ESCRIBE true/false]");
                afirmacion = in.nextBoolean();

                System.out.println("¿PUEDE VOLAR? [ESCRIBE true/false]");
                vuela = in.nextBoolean();

                System.out.println("¿CUÁL ES SU COLOR?:");
                color = in.next();

                System.out.println("¿PUEDE CANTAR? [ESCRIBE true/false]");
                canta = in.nextBoolean();

                animales.add(new Canario(edad, nombre, alimentacion, estado, ruido, fecha, afirmacion, vuela, color, canta));
                break;
        }
    }

    public static void eliminarAnimal(){
        System.out.println("En el la lista tenemos la siguiente cantidad de animales: " + animales.size() + "\n" +
                "¿Cuál de la lista te gustaría borrar? - [El orden empieza de 1-2-3-4-5-6...]" );

        // Preguntamos al usuario que número de animal quiere borrar
        int respuesta = 0;
        boolean trueFalse = false;
        do {
            try {
                respuesta = parseInt(in.nextLine());
                // El restarle a respuesta -1 lo hago para que el usuario final, escriba pensando "el primer animal es 1"
                respuesta = respuesta - 1;
                trueFalse = false;
            }catch(Exception err){
                System.out.println("Valor introducido erroneo o no había tal número de animal");
                trueFalse = true;
            }
        }while(trueFalse);

        // Borramos el animal especificado
        animales.remove(respuesta);
    }

    public static void vaciarLista(){
        for(int i = 0; i < animales.size(); i++){
            animales.remove(i);
        }
        animales.remove(0);
    }

}
/*
    ! Queda arreglar un problema, no puedo meter 2 animales del mismo tipo, se sobreescriben los datos del anterior a los del actual
*/