package Programacion.Java.animalicos.animalicosEntregable;
    public class Gato extends Animal{
        static public String pedigri;
        static public int edad;
        static public String nombre;
        static public String tipo_alimentacion;
        static public String estado;
        static public String ruido;
        static public String fechaNacimiento;
        static public boolean muerte;
     public Gato(int edad, String nombre, String tipo_alimentacion, String estado, String ruido, String fechaNacimiento, boolean muerte, String pedigri) {
         super(edad, nombre, tipo_alimentacion, ruido, estado, fechaNacimiento, muerte);
         this.edad = edad;
         this.nombre = nombre;
         this.tipo_alimentacion = tipo_alimentacion;
         this.estado = estado;
         this.ruido = ruido;
         this.fechaNacimiento = fechaNacimiento;
         this.muerte = muerte;
         this.pedigri = pedigri;
     }
}
