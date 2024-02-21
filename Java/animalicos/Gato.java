package Programacion.Java.animalicos;
    public class Gato extends Animal{
    public void maullar(){
        System.out.print("Miau");
    }
     public Gato(int edad, String nombre, String tipo_alimentacion, String pedigri) {
        super(edad, nombre, tipo_alimentacion);
        this.pedigri=pedigri;
    }
        public static int edadG(int edadG){
            edadG = 12;
            return edadG;
        }
    private String pedigri;
}
