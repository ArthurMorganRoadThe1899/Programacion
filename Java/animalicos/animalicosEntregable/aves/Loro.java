package Programacion.Java.animalicos.animalicosEntregable.aves;

public class Loro extends Aves {
    public int edad;
    final public String nombre;
    final public String tipo_alimentacion;
    public String estado;
    final public String ruido;
    final public String fechaNacimiento;
    final public boolean muerte;
    public boolean vuela;
    public String origen;
    public boolean habla;

    public Loro(int edad, String nombre, String tipo_alimentacion, String estado, String ruido, String fechaNacimiento, boolean muerte, boolean vuela, String origen, boolean habla) {
        super(edad, nombre, tipo_alimentacion, estado, ruido, fechaNacimiento, muerte, vuela);
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.estado = estado;
        this.ruido = ruido;
        this.fechaNacimiento = fechaNacimiento;
        this.muerte = muerte;
        this.vuela = vuela;
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public void info(){
        if (!muerte) {
            System.out.println("\n[LORO]\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad+"\nEstado: " +estado+"\nfecha de nacimiento: "+fechaNacimiento+"\nRuido: "+ruido+"\nVuela: "+vuela+"\nOrigen: "+origen+"\nHabla: "+habla);
        }else if(muerte){
            System.out.println("\n[LORO]\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad+"\nEstado: muerte\nFecha de nacimiento: "+fechaNacimiento+"\nRuido: "+ruido+"\nVuela: "+vuela+"\nOrigen: "+origen+"\nHabla: "+habla);
        }
    }
}
