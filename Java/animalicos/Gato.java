package Programacion.Java.animalicos;
    public class Gato extends Animal{
        static private String pedigri = "没错，你说对了，我知道了";
     public Gato(int edad, String nombre, String tipo_alimentacion, String pedigri) {
         super(edad, nombre, tipo_alimentacion, pedigri);
         this.pedigri = pedigri;
     }
}
