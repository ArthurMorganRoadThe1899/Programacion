package Programacion.Java.animalicos;

public class Animal {
    protected String nombre;
    protected String tipo_alimentacion;
    protected int edad;
    static int Diferencia;
    
    public Animal(int edad, String nombre, String tipo_alimentacion){
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion=tipo_alimentacion;

    }
    public String toString(){
        return "\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad;

    }
}