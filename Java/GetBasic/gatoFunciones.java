package Programacion.Java.GetBasic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class gatoFunciones {
    /*=============================
      ==== VARIABLES GENERALES ====
      =============================*/
    static int bin = (int) (Math.random()*2+0); /*bin se utiliza como condicional de dos posibilidades*/
    static int arraySel = (int) (Math.random()*4+0);
    static String gender;
    /*=============================
      ==== 0. PUBLIC VARIABLES ====
      =============================*/
    public gatoFunciones(int bin, int arraySel){
        this.bin = bin;
        this.arraySel = arraySel;
    }
    /*===============================
      ==== 1. FUNCIÓN DE MAULLAR ====
      ==============================*/
    public static void miau(){
        if(bin == 0){
            System.out.println("meow");
        }else{
            System.out.println("brrrr");
        }
    }
    /*===========================
      ==== 2. COLOR DEL GATO ====
      ===========================*/
    public static void color(){
        ArrayList<String> color = new ArrayList<>(Arrays.asList("Marrón", "Negro", "Blanco", "Beis"));
        System.out.println("[COLOR]: " + color.get(arraySel));
    }

    /*===================
      ==== 3. GÉNERO ====
      ===================*/
    public static void genero(){
        if(bin == 0){
            System.out.println("[GÉNERO]: Macho");
            gender = "Macho";
        }else{
            System.out.println("[GÉNERO]: Hembra");
            gender = "Hembra";
        }
    }

    /*=================
      ==== 4. PESO ====
      =================*/
    public static void peso(){
        ArrayList<String> peso = new ArrayList<>(Arrays.asList("4,23 kg", "4,7 kg", "5 kg", "5,57 kg"));
        System.out.println("[PESO]: " + peso.get(arraySel));
    }

}
