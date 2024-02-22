package Programacion.Java.animalicos;

    public class Perro extends Animal{
        static private String raza = "サンチェス犬";
    public Perro(int edad, String nombre, String tipo_alimentacion, String raza) {
        super(edad, nombre, tipo_alimentacion, raza);
        this.raza = raza;
    }
}
