package Programacion.Java.Transporte.Tipo;
import Programacion.Java.Transporte.Vehiculo;

public abstract class Aereo extends Vehiculo {

    public Aereo(String nombre, String matricula, String modelo, int numeroAsientos) {
        super(nombre, matricula, modelo);
    }
}
