package Programacion.Java.animalicos;

    public class Perro extends Animal{
   
    public static void ladrar(){
        System.out.print("Guau");
    }
    public static int edadP(int edadP){
        edadP = 18;
        return edadP;
    }
    public Perro(int edad, String nombre, String tipo_alimentacion, String raza) {
        super(edad, nombre, tipo_alimentacion);
        this.raza = raza;
    }
    private String raza;
}
