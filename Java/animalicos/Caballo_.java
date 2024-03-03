package Programacion.Java.animalicos;

public class Caballo_ extends Animalo{
    static public int patas = 5;
    static public int edad = 4;
    static public String nombre = "Epona";
    static public String tipo_alimentacion = "Fibra";

    public Caballo_(int edad, String nombre, String tipo_alimentacion, int patas) {
        super(edad, nombre, tipo_alimentacion);
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.patas=patas;
    }
}