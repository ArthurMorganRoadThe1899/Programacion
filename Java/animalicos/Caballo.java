package Programacion.Java.animalicos;

public class Caballo extends Animal{
    private String patas;
    public void relinchar(){
        System.out.print("Hiiii");
    }
    public Caballo(int edad, String nombre, String tipo_alimentacion, String patas) {
        super(edad, nombre, tipo_alimentacion);
        this.patas=patas;
    }
    public static int edadC(int edadC){
        edadC = 25;
        return edadC;
    }

}