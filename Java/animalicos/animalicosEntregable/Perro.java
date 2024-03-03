package Programacion.Java.animalicos.animalicosEntregable;

    public class Perro extends Animal{
        static public String raza;
        static public int edad;
        static public String nombre;
        static public String tipo_alimentacion;
        static public String estado;
        static public String ruido;
        static public String fechaNacimiento;
        static public boolean muerte;
    public Perro(int edad, String nombre, String tipo_alimentacion, String estado, String ruido, String fechaNacimiento, boolean muerte, String raza) {
        super(edad, nombre, tipo_alimentacion, ruido, estado, fechaNacimiento, muerte);
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.raza = raza;
        this.ruido = ruido;
    }
}
