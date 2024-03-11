package Programacion.Java.animalicos.animalicosEntregable.aves;
import Programacion.Java.animalicos.animalicosEntregable.Animal;

public abstract class Aves extends Animal {
    public int edad;
    final public String nombre;
    final public String tipo_alimentacion;
    public String estado;
    final public String ruido;
    final public String fechaNacimiento;
    final public boolean muerte;
    public boolean vuela;

    public Aves(int edad, String nombre, String tipo_alimentacion, String estado, String ruido, String fechaNacimiento, boolean muerte, boolean vuela) {
        super(edad, nombre, tipo_alimentacion, estado, ruido, fechaNacimiento, muerte);
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.estado = estado;
        this.ruido = ruido;
        this.fechaNacimiento = fechaNacimiento;
        this.muerte = muerte;
        this.vuela = vuela;
    }

    @Override
    public void info(){
        if (!muerte) {
            System.out.println("\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad+"\nEstado: " +ruido+"\nfecha de nacimiento: "+fechaNacimiento+"\nRuido: "+estado+"\nVuela: "+vuela);
        }else if(muerte){
            System.out.println("\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad+"\nEstado: muerte\nFecha de nacimiento: "+fechaNacimiento+"\nRuido: "+estado+"\nVuela: "+vuela);
        }
    }
}