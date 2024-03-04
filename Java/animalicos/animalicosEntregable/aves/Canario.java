package Programacion.Java.animalicos.animalicosEntregable.aves;

public class Canario extends Aves {
    static public int edad;
    static public String nombre;
    static public String tipo_alimentacion;
    static public String estado;
    static public String ruido;
    static public String fechaNacimiento;
    static public boolean muerte;
    static public boolean vuela;
    static public String color;
    static public boolean canta;

    public Canario(int edad, String nombre, String tipo_alimentacion, String estado, String ruido, String fechaNacimiento, boolean muerte, boolean vuela, String color, boolean canta) {
        super(edad, nombre, tipo_alimentacion, estado, ruido, fechaNacimiento, muerte, vuela);
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.estado = estado;
        this.ruido = ruido;
        this.fechaNacimiento = fechaNacimiento;
        this.muerte = muerte;
        this.vuela = vuela;
        this.color = color;
        this.canta = canta;
    }
}
