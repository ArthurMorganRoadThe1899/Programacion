package Programacion.Java.Transporte.Tipo;
import Programacion.Java.Transporte.Vehiculo;

public abstract class Terrestre extends Vehiculo {

    public Terrestre(String nombre, String matricula, String modelo, int numeroRuedas) {
        super(nombre, matricula, modelo);
    }
}
