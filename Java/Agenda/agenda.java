package Programacion.Java.Agenda;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class agenda {
    static Scanner in = new Scanner(System.in);
    static int r;
    static char res;
    public static void main(String[] args) {
        do {
            System.out.println("============================================\n" +
                    "==== 1. VER LISTA DE CONTACTOS =============\n" +
                    "==== 2. VER TODOS DATOS DE LOS CONTACTOS ===\n" +
                    "==== 3. CONSULTAR A TRAVÉS DE DNI ==========\n" +
                    "==== 4. AÑADIR CONTACTO ====================\n" +
                    "==== 5. ELIMINAR CONTACTO ==================\n" +
                    "==== 6. SALIR ==============================\n" +
                    "============================================");

            genericx.valuesPlease();
            r = genericx.r;

            if (r == 1) {
                agendaThings.contactosBasic();
            } else if (r == 2) {
                agendaThings.contactosExtended();
            } else if (r == 3) {
                agendaThings.consultarAdni();
            } else if (r == 4) {
                agendaThings.add();
            } else if (r == 5) {
                agendaThings.remove();
            }

            if(r != 6){
            System.out.println("\n¿Volver a ejecutar el código?\n[S/N]");
            boolean tf = false;
                try {
                    do {
                        res = in.next().charAt(0);
                        if(res != 115 && res != 83 && res != 110 && res != 78){
                            System.out.println("SOLO ADMITIMOS S/N");
                        }
                    }while(res != 115 && res != 83 && res != 110 && res != 78);
                }catch(Exception err) {
                    System.out.println("Valor invalido");
                    tf = true;
                }
            }

        }while(res == 115 || res == 83 && r != 6);

    }
}