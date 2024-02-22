package Programacion.Java.animalicos;

public class Caballo extends Animal{
    static  private int patas = 5;
    public Caballo(int edad, String nombre, String tipo_alimentacion, int patas) {
        super(edad, nombre, tipo_alimentacion, patas);
        this.patas=patas;
    }
}