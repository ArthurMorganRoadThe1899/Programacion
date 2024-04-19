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

    public void extraccion(){
        System.out.println("¿Cuanto dinero quieres extraer?");
        accion = in.nextInt();
        dinero = dinero - accion;
    }

    public void depositar(){
        System.out.println("¿Cuanto dinero quieres depositar?");
        accion = in.nextInt();
        dinero = dinero + accion;
    }

    public String toString(){
        return "Dinero actual: " + dinero;
    }
}
