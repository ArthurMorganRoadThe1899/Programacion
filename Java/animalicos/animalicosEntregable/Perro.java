package Programacion.Java.animalicos.animalicosEntregable;

    public class Perro extends Animal{
        final public String raza;
        public int edad;
        final public String nombre;
        final public String tipo_alimentacion;
        public String estado;
        final public String ruido;
        final public String fechaNacimiento;
        final public boolean muerte;
    public Perro(int edad, String nombre, String tipo_alimentacion, String estado, String ruido, String fechaNacimiento, boolean muerte, String raza) {
        super(edad, nombre, tipo_alimentacion, ruido, estado, fechaNacimiento, muerte);
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.raza = raza;
        this.ruido = ruido;
        this.fechaNacimiento = fechaNacimiento;
        this.muerte = muerte;
        this.estado = estado;
    }

    @Override
    public void info(){
        if (!muerte) {
            System.out.println("\n[PERRO]\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad+"\nEstado: " +estado+"\nfecha de nacimiento: "+fechaNacimiento+"\nRuido: "+ruido+"\nRaza: "+raza);
        }else if(muerte){
            System.out.println("\n[PERRO]\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad+"\nEstado: muerte\nFecha de nacimiento: "+fechaNacimiento+"\nRuido: "+ruido+"\nRaza: "+raza);
        }
    }
}
