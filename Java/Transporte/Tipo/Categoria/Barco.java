package Programacion.Java.Transporte.Tipo.Categoria;
import Programacion.Java.Transporte.Tipo.Acuatico;

public class Barco extends Acuatico {
    static String nombre = "Barco";
    static String matricula = "ABCEFGHIJK"; /*tienen entre 3 y 10 letras*/
    static String modelo = "Mery Jane OOSS";
    static int eslora = 250;

    public Barco(String nombre, String matricula, String modelo, int eslora) {
        super(nombre, matricula, modelo, eslora);
        this.nombre = nombre;
        this.matricula = matricula;
        this.modelo = modelo;
        this.eslora = eslora;

    }

    public static void main(String[] args) {
        System.out.println(Barco.es());
    }

}
