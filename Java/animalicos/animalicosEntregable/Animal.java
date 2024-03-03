package Programacion.Java.animalicos.animalicosEntregable;

public abstract class Animal {
    protected static String nombre;
    protected static String tipo_alimentacion;
    protected static int edad;
    
    public Animal(int edad, String nombre, String tipo_alimentacion){
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
    }
}