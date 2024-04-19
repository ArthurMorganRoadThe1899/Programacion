package Programacion.Java.TryCatch.CasoPractico;
import java.util.Scanner;

public class Cliente {
    static Scanner in = new Scanner(System.in);
    public int dinero;
    public int accion;

    public Cliente(int dinero, int accion){
        this.dinero = dinero;
        this.accion = accion;
    }

    // MÉTODO DE CATCH PARA NO PASARSE DEL DINERO QUE TIENE EL CLIENTE //
    public void naoNao(int dinero, int accion){
        this.dinero = dinero;
        this.accion = accion;

        if(accion > dinero){
            throw new NumberFormatException("La cantidad de dinero introduccida es mayor de la que se tiene");
        }
    }

    // MÉTODO DE EXTRACCIÓN DE DINERO //
    public void extraccion(){
        System.out.println("¿Cuanto dinero quieres extraer?");
        do {
            try {
                accion = in.nextInt();
                naoNao(dinero, accion);
            } catch (NumberFormatException deMas) {
                System.out.println(deMas.getMessage());
            }
        }while(accion > dinero);

        dinero = dinero - accion;
    }

    // MÉTODO DE DEPOSITAR DE DINERO //
    public void depositar(){
        System.out.println("¿Cuanto dinero quieres depositar?");
        accion = in.nextInt();
        dinero = dinero + accion;
    }

    // DINERO ACTUAL DEL CLIENTE //
    public String toString(){
        return "Dinero actual: " + dinero;
    }
}
