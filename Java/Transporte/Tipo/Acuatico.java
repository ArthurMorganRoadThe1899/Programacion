package Programacion.Java.Transporte.Tipo;
import Programacion.Java.Transporte.Vehiculo;

public abstract class Acuatico extends Vehiculo{

    public Acuatico(String nombre, String matricula, String modelo) {
        super(nombre, matricula, modelo);
        nombre = "hola";
    }
}
