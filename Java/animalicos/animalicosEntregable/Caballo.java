package Programacion.Java.animalicos.animalicosEntregable;

public class Caballo extends Animal{
    static public int patas;
    static public int edad;
    static public String nombre;
    static public String tipo_alimentacion;
    static public String estado;
    static public String ruido;
    static public String fechaNacimiento;
    static public boolean muerte;

    public Caballo(int edad, String nombre, String tipo_alimentacion, String estado, String ruido, String fechaNacimiento, boolean muerte, int patas) {
        super(edad, nombre, tipo_alimentacion, ruido, estado, fechaNacimiento, muerte);
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.estado = estado;
        this.ruido = ruido;
        this.fechaNacimiento = fechaNacimiento;
        this.muerte = muerte;
        this.patas=patas;
    }

    @Override
    public void info(){
        if (!muerte) {
            System.out.println("\n[CABALLO]\nCABALLO:\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad+"\nEstado: " +estado+"\nfecha de nacimiento: "+fechaNacimiento+"\nRuido: "+ruido+"\nPatas: "+patas);
        }else if(muerte){
            System.out.println("\n[CABALLO]\nCABALLO:\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad+"\nEstado: muerte\nFecha de nacimiento: "+fechaNacimiento+"\nRuido: "+ruido+"\nPatas: "+patas);
        }
    }
}