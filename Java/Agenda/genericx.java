package Programacion.Java.Agenda;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
public class genericx {
    static Scanner in = new Scanner(System.in);
    static int r;

    /*================================
      ==== 0. EXPORTAR VARIABLES ====
      ===============================*/
    public genericx(int r){
        this.r = r;
    }
    /*===========================================
      ==== 1. PEDIR VALORES DE UN MENU (1-6) ====
      ===========================================*/
    public static void valuesPlease(){
        boolean tf = false;
        do {
            try {
                r = parseInt(in.nextLine());
                tf = false;
            }catch(Exception err){
                tf = true;
            }
            if(r != 1 && r != 2 && r != 3 && r != 4 && r != 5 && r != 6){
                System.out.println("Valor introducido no valido");
                tf = true;
            }
        }while(tf);
    }
}
