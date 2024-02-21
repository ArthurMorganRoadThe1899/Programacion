package Programacion.Java.animalicos;

public class AppAnimales {
    public static void main(String[] args) {
        //ACT 1
        Gato g1 = new Gato(21, "a","pescado", "rechulon");
        Perro p1 = new Perro(12, "uwu", "carne","culon" );
        Caballo c1 = new Caballo(43, "cgf", "manzanas", "8");

        System.out.println(g1);
        System.out.println(p1);
        System.out.println(c1);
    }
}