package Programacion.Java.animalicos;

public abstract class Animalo {
    protected static String nombre;
    protected static String tipo_alimentacion;
    protected static int edad;
    
    public Animalo(int edad, String nombre, String tipo_alimentacion){
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
    }
    public static void info(){
        System.out.println("\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad);
    }
}