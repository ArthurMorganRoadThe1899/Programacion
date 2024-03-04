package Programacion.Java.animalicos.animalicosEntregable;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Inventario {
    static private Scanner in = new Scanner(System.in);
    static private int respuesta;
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

        // Preguntar al usuario final que tipo de animal desea seleccionar
        System.out.println("¿Que tipo de animal te gustaría añadir?\n\n" +
                "====================================" +
                "==== 1. CABALLO ====================" +
                "==== 2. PERRO ======================" +
                "==== 3. GATO =======================" +
                "==== 4. LORO =======================" +
                "==== 5. CANARIO ====================" +
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
                System.out.println("Caballo NOMBRE:");
                nombre = in.nextLine();

                System.out.println("EDAD:");
                edad = in.nextInt();

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
                System.out.println("Perro NOMBRE:");
                nombre = in.nextLine();

                System.out.println("EDAD:");
                edad = in.nextInt();

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
                raza = in.nextLine();

                animales.add(new Perro(edad, nombre, alimentacion, estado, ruido, fecha, afirmacion, raza));
                break;

            // Añadir gato
            case 3:
                System.out.println("Gato NOMBRE:");
                nombre = in.nextLine();

                System.out.println("EDAD:");
                edad = in.nextInt();

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
                pedigri = in.nextLine();

                animales.add(new Gato(edad, nombre, alimentacion, estado, ruido, fecha, afirmacion, pedigri));
                break;

            // Añadir loro [por crear]
            case 4:
                System.out.println("Placeholder");
                break;

            // Añadir canario [por crear]
            case 5:
                System.out.println("Placeholder");
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

    public static void main(String[] args) {
        // ! Arreglar que cuando invoques cualquier método, siempre te vaya a vomitar lo último echo
        animales.add(new Caballo(3, "Manolo", "Fibra", "Comiendo", "Relincho", "5-6-2017", false, 5));
        animales.add(new Perro(20, "Bobby", "Variado", "Durmiendo", "Ladrido", "2-4-2004", false, "Mestizo"));
        mostrarListaDeAnimales();

    }
}
