package Programacion.Java.Transporte.Tipo;
import Programacion.Java.Transporte.Vehiculo;

public abstract class Acuatico extends Vehiculo{
    static String nombre;
    static String matricula;
    static String modelo;
    static int eslora;

    public Acuatico(String nombre, String matricula, String modelo, int eslora) {
        super(nombre, matricula, modelo);
    }

    /*
    @Override
    public String toString() {
        return Vehiculo.especificaciones() + "\neslora: " + eslora;
    }
    */

    public static void main(String[] args) {

    }

}
