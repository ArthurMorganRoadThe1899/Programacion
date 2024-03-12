package Programacion.Java.AdvinadorMagico;
import java.util.Scanner;
public class Joc {
    private static int vidas;
    private final int record = 0;

    /////////////////////////////////////////
    // MOSTRAR VIDAS RESTANTES AL JUGADOR //
    ///////////////////////////////////////
    public static String mostrarVidasRestantes(){
        return "Vidas: "+vidas;
    }

    ///////////////////////
    // INICIAR EL JUEGO //
    ///////////////////// -> Método vacío que los hijos rescribiran a su gusto
    public void jugar(){

    }

    ////////////////////////////////
    // QUITARLE VIDAS AL JUGADOR //
    //////////////////////////////
    public static void quitarVida(){
        vidas = vidas - 1;

        if(vidas == 0){
            System.out.println("não, o jogo acabou");
        }
    }

    //////////////////////////////////////////////////////
    // REINICIAR LA PARTIDA CUANDO TE QUEDAS SIN VIDAS //
    ////////////////////////////////////////////////////
    public static void reiniciarPartida(){
        Scanner in = new Scanner(System.in);
        boolean puedePasar;
        char respuesta = 0;

        do{
            System.out.println("¿Quieres volver a reintentarlo?\n [S/N]");

            try {
                puedePasar = true;
                respuesta = in.next().charAt(0);
            }catch(Exception e){
                System.out.println("Valor introducido erroneo\n");
                puedePasar = false;
            }

            if (respuesta != 'S' && respuesta != 's' && respuesta != 'N' && respuesta != 'n'){
                System.out.println("Valor introducido erroneo\n");
                puedePasar = false;
            }

        }while(!puedePasar);
    }
}
