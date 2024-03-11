package Programacion.Java.AdvinadorMagico;

public class Joc {
    static int vidas;

    public static String mostrarVidasRestantes(){
        return "Vidas: "+vidas;
    }

    public static void main(String[] args) {
        vidas = 5;
        System.out.println(mostrarVidasRestantes());


    }


}
