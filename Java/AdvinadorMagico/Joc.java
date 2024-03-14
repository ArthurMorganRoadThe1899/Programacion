package Programacion.Java.AdvinadorMagico;
import java.util.Scanner;
public abstract class Joc {

    public static int vidas;
    private final int record = 0;

    public Joc(int vidas){
        this.vidas = vidas;
    }

    /////////////////////////////////////////
    // MOSTRAR VIDAS RESTANTES AL JUGADOR //
    ///////////////////////////////////////
    public static String mostrarVidasRestantes(){
        return "Vidas: "+vidas;
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
    public static boolean reiniciarPartida(){
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

        boolean seguirOno = false;

        switch (respuesta){
            case 'S':
                seguirOno = true;
            case 'N':
                seguirOno = false;

        }
        return seguirOno;
    }
}
