package Programacion.Java.Transporte.Tipo.Categoria;
import Programacion.Java.Transporte.Tipo.Acuatico;

public class Barco extends Acuatico {

    public Barco(String nombre, String matricula, String modelo) {
        super(nombre, matricula, modelo);
    }

    public static void main(String[] args) {
        Barco.especificaciones();
    }
}
