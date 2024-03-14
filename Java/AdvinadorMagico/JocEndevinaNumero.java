package Programacion.Java.AdvinadorMagico;
import java.util.Scanner;

public class JocEndevinaNumero extends Joc implements IJugable {

    protected int vidas;

    public JocEndevinaNumero(int vidas) {
        super(vidas);
        this.vidas = vidas;
    }

    @Override
    public void jugar() {
        Scanner in = new Scanner(System.in);
        vidas = 5;
        int numeroMagico = 2;

        System.out.println(mostrarNombre() + descripcion() + "Muy bien hijo, ¿qué número crees que he maquinao'?");

        int respuestaJugador = in.nextInt();

        if(respuestaJugador == numeroMagico){
            System.out.println("Ganaste");
        }else if(respuestaJugador != numeroMagico){
            quitarVida();
            // SOUT DE ABAJO DE PRUEBA
            System.out.println(vidas);
        }else if(vidas == 0){
            reiniciarPartida();
        }
    }

    @Override
    public String mostrarNombre() {
        return  "\n/=============================================/\n" +
                "/==== BIENVENIDO A EL VERDADERO ADIVINADOR ===/\n" +
                "/=============================================/";
    }

    @Override
    public String descripcion(){
        return "\n[ES UN JUEGO DE ADIVINACIÓN, TIENES QUE ADIVINAR UN NÚMERO DEL 0 AL 10]\n";
    }
}
