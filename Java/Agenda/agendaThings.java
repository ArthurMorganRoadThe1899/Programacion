package Programacion.Java.Agenda;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class agendaThings {
    static Scanner in = new Scanner(System.in);
    static ArrayList<String> DNI = new ArrayList<>(Arrays.asList("123456789A", "123456789B", "123456789C", "123456789D"));
    static ArrayList<String> name = new ArrayList<>(Arrays.asList("Vira", "Alberto", "Martin", "Gale"));
    static ArrayList<String> surname = new ArrayList<>(Arrays.asList("Von Goach", "el Hambriento", "Roque Alba", "de Waterdeep"));
    static ArrayList<String> pnum = new ArrayList<>(Arrays.asList("258 256 70 78", "134 763 23 86", "235 852 45 95", "178 435 34 12"));
    static ArrayList<String> email = new ArrayList<>(Arrays.asList("viragoach@gmail.com", "alberto@galactus.com", "martinroquealba@consolacionnules.es", "galewateerdeep@hotmail.com"));
    static int i = 1;
    static String add;

    /*================================
      ==== 0. VALORES EXPORTABLES ====
      ================================*/
    public agendaThings(int i){
        this.i = i;
        this.add = add;

    }

    /*===================================
      ==== 1. VER LISTA DE CONTACTOS ====
      ===================================*/
    public static void contactosBasic(){
        for(int i = 0; i < name.size(); i++){
            System.out.print("[" + name.get(i) + " " + surname.get(i) + "] ");
        }
    }

    /*=============================================
      ==== 2. VER TODOS DATOS DE LOS CONTACTOS ====
     ==============================================*/
    public static void contactosExtended(){
        for(int i = 0; i < name.size(); i++){
            System.out.print("[" + name.get(i) + " " + surname.get(i) + "] ");
            System.out.println("\nEMAIL: [" + email.get(i) + "] " + "| NÚMERO DE TELÉFONO: [" + pnum.get(i) + "] " + "| DNI: [" + DNI.get(i) + "]\n");
        }
    }

    /*======================================
      ==== 3. CONSULTAR A TRAVÉS DE DNI ====
      ======================================*/
    public static void consultarAdni(){
        for(int i = 0; i < DNI.size(); i++){
            System.out.print("[" + DNI.get(i) + "] ");
        }

        System.out.println();

        String getDNI = in.nextLine();

        for(int i = 0; i < DNI.size(); i++){
            if(Objects.equals(DNI.get(i), getDNI)){
                System.out.print("[" + name.get(i) + " " + surname.get(i) + "] ");
                System.out.println("\nEMAIL: [" + email.get(i) + "] " + "| NÚMERO DE TELÉFONO: [" + pnum.get(i) + "]\n");
            }
        }
    }

    /*============================
      ==== 4. AÑADIR CONTACTO ====
      ============================*/
    public static void add(){
        System.out.println("AÑADE UN EMAIL DE CONTACTO:");
        String r = in.nextLine();
        email.add(r);

        System.out.println("PONLE UN NOMBRE");
        r = in.nextLine();
        name.add(r);

        System.out.println("PONLE UN SEGUNDO NOMBRE");
        r = in.nextLine();
        surname.add(r);

        System.out.println("AÑADELE UN NÚMERO DE TELÉFONO:");
        r = in.nextLine();
        pnum.add(r);

        System.out.println("AÑADE UN DNI:");
        r = in.nextLine();
        DNI.add(r);

    }

    public static void remove(){
        boolean tf = false;

        System.out.println("Muy bien, está es la lista de juegos ¿cuál quieres borrar?\n[VAN EN EL ORDEN EN EL QUE SALEN, 1, 2, 3...]\n");
        for(int i = 0; i < name.size(); i++){
            System.out.print("[" + name.get(i) + " " + surname.get(i) + "] ");
        }
        int i = in.nextInt();
        i = i - 1;
        do {
            tf = false;
            try {
                name.remove(i);
                surname.remove(i);
                email.remove(i);
                pnum.remove(i);
                DNI.remove(i);
                tf = false;
            } catch (Exception e) {
                tf = true;
            }
            if (tf) {
                System.out.println("Valor introducido no valido");
                tf = true;
            }
        }while (tf);
    }



}