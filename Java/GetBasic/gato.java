package Programacion.Java.GetBasic;
import java.util.Scanner;
public class gato {
    static Scanner in = new Scanner(System.in);
    static char res; /*Se utiliza para recopilar respuestas*/

    public static void main() {
        do {

            gatoFunciones.color();
            gatoFunciones.genero();
            gatoFunciones.peso();
            gatoFunciones.miau();
            gatoFunciones valor = new gatoFunciones((int) (Math.random()*2+0), (int) (Math.random()*4+0));

            System.out.println("\n¿Volver a ejecutar el código?\n[S/N]");
            boolean tf = false;
            do {
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

            }while(tf);
        }while(res == 115 || res == 83);
    }
}
