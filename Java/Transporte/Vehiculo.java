package Programacion.Java.Transporte;

public abstract class Vehiculo {
    static String nombre;
    static String matricula;
    static String modelo;
    public Vehiculo(String nombre, String matricula, String modelo){
        this.nombre = nombre;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public static void especificaciones() {
        System.out.println("Vehiculo: " + nombre + "\nModelo: " + modelo + "\nMatricula: " + matricula);
    }

}
