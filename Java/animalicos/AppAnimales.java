package Programacion.Java.animalicos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class AppAnimales {
    static Scanner in = new Scanner(System.in);
    /*HE CONVERTIDO TODOS LOS ATRIBUTOS DE LOS ANIMALES EN PUBLIC, NO SUPE HACERLO COMO ES DEBIDO...*/
    /*static  Caballo c1 = new Caballo(Caballo.edad, Caballo.nombre, Caballo.tipo_alimentacion, Caballo.patas);
    static  Gato g1 = new Gato(Gato.edad, Gato.nombre, Gato.tipo_alimentacion, Gato.pedigri);
    static Perro p1 = new Perro(Perro.edad, Perro.nombre, Perro.tipo_alimentacion, Perro.raza);*/
    static int r, r2;
    public static void main(String[] args){
        System.out.println("\nHola amable usuario ¿qué le gustaría hacer? :3\n\n");
        do{
        System.out.println("=========================================================\n" +
                "==== 1. VER INFORMACIÓN DE LOS ANIMALES EN LA GRANJA ====\n" +
                "==== 2. MODIFICAR ANIMALICOS ============================\n" +
                "==== 3. COMPARADOR EDADES ENTRE ANIMALES ================\n"+
                "==== 4. SALIR ===========================================\n" +
                "=========================================================\n");

        boolean tf = false;
        do {
            try {
                r = parseInt(in.nextLine());
                tf = false;
            }catch(Exception err){
                tf = true;
            }
            if(r <1 || r > 4){
                System.out.println("Valor introducido no valido");
                tf = true;
            }
        }while(tf);

        /*1. MOSTRAR A TODOS LOS BICHOS Y SUS RASGOS*/
        if(r == 1){
            new Caballo(Caballo.edad, Caballo.nombre, Caballo.tipo_alimentacion, Caballo.patas);
            System.out.print("CABALLO:");
            Caballo.info();
            System.out.println("Patas: " + Caballo.patas +"\n");

            Gato g1 = new Gato(Gato.edad, Gato.nombre, Gato.tipo_alimentacion, Gato.pedigri);
            System.out.print("GATO:");
            Gato.info();
            System.out.println("Perigri: " + Gato.pedigri +"\n");

            Perro p1 = new Perro(Perro.edad, Perro.nombre, Perro.tipo_alimentacion, Perro.raza);
            System.out.print("PERRO:");
            Perro.info();
            System.out.println("Patas: " + Perro.raza +"\n");

        /*2. MODIFICAR ANIMALICOS*/
        }else if(r == 2){
            System.out.println("Muy bien, a quien quieres modificar?\n" +
                    "====================\n" +
                    "==== 1. CABALLO ====\n" +
                    "==== 2. GATO =======\n" +
                    "==== 3. PERRO ======\n" +
                    "====================");
            boolean tf2 = false;
            do {
                try {
                    r2 = parseInt(in.nextLine());
                    tf2 = false;
                }catch(Exception err){
                    tf2 = true;
                }
                if(r != 1 && r != 2 && r != 3){
                    System.out.println("Valor introducido no valido");
                    tf2 = true;
                }
            }while(tf);

            if(r2 == 1){
                System.out.println("Muy bien, adelante, modifica al caballo\nNOMBRE:");
                Caballo.nombre = in.nextLine();
                System.out.println("EDAD:");
                Caballo.edad = in.nextInt();
                System.out.println("TIPO DE ALIMENTACIÓN:");
                Caballo.tipo_alimentacion = in.nextLine();
                System.out.println("PATAS:");
                Caballo.patas = in.nextInt();
            }else if(r2 == 2){
                System.out.println("Muy bien, adelante, modifica al perrico\nNOMBRE:");
                Perro.nombre = in.nextLine();
                System.out.println("EDAD:");
                Perro.edad = in.nextInt();
                System.out.println("TIPO DE ALIMENTACIÓN:");
                Perro.tipo_alimentacion = in.nextLine();
                System.out.println("RAZA:");
                Perro.raza = in.nextLine();
            }else if(r2 == 3){
                System.out.println("Muy bien, adelante, modifica al gatico\nNOMBRE:");
                Gato.nombre = in.nextLine();
                System.out.println("EDAD:");
                Gato.edad = in.nextInt();
                System.out.println("TIPO DE ALIMENTACIÓN:");
                Gato.tipo_alimentacion = in.nextLine();
                System.out.println("Pedigri:");
                Gato.pedigri = in.nextLine();
            }
        /*3. VER LAS EDADES ENTRE LOS ANIMALICOS*/
        }else if(r == 3){
            System.out.println("Las edades son las siguientes:\n" +
                    "Caballo: " + Caballo.edad + " | Gato: " + Gato.edad + " | Perro: " + Perro.edad + "\n");
            ArrayList<Integer> papeadaDeMameo = new ArrayList<Integer>(Arrays.asList(Caballo.edad, Gato.edad, Perro.edad));

            int mayor = 0;
            int menor = 0;
            for(int i = 9; i < papeadaDeMameo.size(); i++){
                if(papeadaDeMameo.get(i) > mayor){
                    mayor == papeadaDeMameo.get(i);
                }
            }

        }




        }while(r != 4);

    }
}