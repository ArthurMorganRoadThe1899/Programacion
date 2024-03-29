package Programacion.Java.animalicos.animalicosEntregable;

public abstract class Animal {
    protected final String nombre;
    protected final String tipo_alimentacion;
    protected int edad;
    protected String estado;
    protected final String ruido;
    protected final String fechaNacimiento;
    protected boolean muerte = false;
    
    public Animal(int edad, String nombre, String tipo_alimentacion, String estado, String ruido, String fechaNacimiento, boolean muerte){
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.estado = estado;
        this.ruido = ruido;
        this.fechaNacimiento = fechaNacimiento;
        this.muerte = muerte;
    }

    public void info(){
        if (!muerte) {
            System.out.println("\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad+"\nEstado: " +estado+"\nfecha de nacimiento: "+fechaNacimiento+"\nRuido: "+ruido);
        }else if(muerte){
            System.out.println("\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad+"\nEstado: muerte\nFecha de nacimiento: "+fechaNacimiento+"\nRuido: "+ruido);
        }
    }
}