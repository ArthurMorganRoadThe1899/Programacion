package Programacion.Java.animalicos.animalicosEntregable;

public abstract class Animal {
    protected static String nombre;
    protected static String tipo_alimentacion;
    protected static int edad;
    protected static String estado;
    protected static String ruido;
    protected static String fechaNacimiento;
    protected static boolean muerte = false;
    
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

        /*
        if (!muerte) {
            System.out.println("\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad+"\nEstado: " +ruido+"\nfecha de nacimiento: "+fechaNacimiento+"\nRuido: "+estado);
        }else if(muerte){
            System.out.println("\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad+"\nEstado: muerte\nFecha de nacimiento: "+fechaNacimiento+"\nRuido: "+estado);
        }
        */