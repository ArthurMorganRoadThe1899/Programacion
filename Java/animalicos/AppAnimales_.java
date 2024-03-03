package Programacion.Java.animalicos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class AppAnimales_ {
    static Perro_ p1 = new Perro_(3, "Bobby", "Variado", "Aria");
    static Perro_ p2 = new Perro_(7, "Lulu", "Debatible", "Mestizo");
    static Gato_ g1 = new Gato_(2, "Luna", "Basura", "Nose");
    static Gato_ g2 = new Gato_(2, "Pecas", "Si", "De la punta de los cojones");
    static Scanner in = new Scanner(System.in);
    static int respuesta, respuesta2;
    public static void main(String[] args){
        System.out.println(g1);
        System.out.println("\nHola amable usuario ¿qué le gustaría hacer? :3\n");
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

        /*1. MOSTRAR A TODOS LOS BICHOS Y SUS RASGOS*/
        if(respuesta == 1){
            new Caballo_(Caballo_.edad, Caballo_.nombre, Caballo_.tipo_alimentacion, Caballo_.patas);
            System.out.print("CABALLO:");
            Caballo_.info();
            System.out.println("Patas: " + Caballo_.patas +"\n");

            Gato_ g1 = new Gato_(Gato_.edad, Gato_.nombre, Gato_.tipo_alimentacion, Gato_.pedigri);
            System.out.print("GATO:");
            Gato_.info();
            System.out.println("Perigri: " + Gato_.pedigri +"\n");

            Perro_ p1 = new Perro_(Perro_.edad, Perro_.nombre, Perro_.tipo_alimentacion, Perro_.raza);
            System.out.print("PERRO:");
            Perro_.info();
            System.out.println("Raza: " + Perro_.raza +"\n");

        /*2. MODIFICAR ANIMALICOS*/
        }else if(respuesta == 2){
            System.out.println("Muy bien, a quien quieres modificar?" +
                    "\n====================\n" +
                    "==== 1. CABALLO ====\n" +
                    "==== 2. GATO =======\n" +
                    "==== 3. PERRO ======\n" +
                    "====================");
            boolean tf2 = false;
            do {
                try {
                    respuesta2 = parseInt(in.nextLine());
                    tf2 = false;
                }catch(Exception err){
                    tf2 = true;
                }
                if(respuesta < 1 || respuesta > 3){
                    System.out.println("Valor introducido no valido");
                    tf2 = true;
                }
            }while(trueFalse);

            /*MODIFICACIÓN DE LOS ANIMALICOS*/
            if(respuesta2 == 1){
                System.out.println("Muy bien, adelante, modifica al caballo\nNOMBRE:");
                Caballo_.nombre = in.nextLine();
                System.out.println("TIPO DE ALIMENTACIÓN:");
                Caballo_.tipo_alimentacion = in.nextLine();
                System.out.println("PATAS:");
                Caballo_.patas = in.nextInt();
                System.out.println("EDAD:");
                Caballo_.edad = in.nextInt();
            }else if(respuesta2 == 2){
                System.out.println("Muy bien, adelante, modifica al gatico\nNOMBRE:");
                Gato_.nombre = in.nextLine();
                System.out.println("TIPO DE ALIMENTACIÓN:");
                Gato_.tipo_alimentacion = in.nextLine();
                System.out.println("PEDIGRI:");
                Gato_.pedigri = in.nextLine();
                System.out.println("EDAD:");
                Gato_.edad = in.nextInt();
            }else if(respuesta2 == 3){
                System.out.println("Muy bien, adelante, modifica al perrico\nNOMBRE:");
                Perro_.nombre = in.nextLine();
                System.out.println("TIPO DE ALIMENTACIÓN:");
                Perro_.tipo_alimentacion = in.nextLine();
                System.out.println("RAZA:");
                Perro_.raza = in.nextLine();
                System.out.println("EDAD:");
                Perro_.edad = in.nextInt();
            }
        /*3. VER LAS EDADES ENTRE LOS ANIMALICOS*/
        }else if(respuesta == 3){
            System.out.println("Las edades son las siguientes:\n" +
                    "Caballo: " + Caballo_.edad + " | Gato: " + Gato_.edad + " | Perro: " + Perro_.edad + "\n");
            ArrayList<Integer> papeadaDeMameo = new ArrayList<Integer>(Arrays.asList(Caballo_.edad, Gato_.edad, Perro_.edad));

            int mayor = 0;
            int menor = 999999999;
            for(int i = 0; i < papeadaDeMameo.size(); i++){
                if(papeadaDeMameo.get(i) > mayor){
                    mayor = papeadaDeMameo.get(i);
                }
            }
            for(int i = 0; i < papeadaDeMameo.size(); i++){
                if(papeadaDeMameo.get(i) < menor){
                    menor = papeadaDeMameo.get(i);
                }
            }
            System.out.println("La mayor edad es " + mayor + ", y la menor es " + menor);
        }

        }while(respuesta != 4);
    }
}