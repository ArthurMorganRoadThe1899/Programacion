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
        boolean jugadorNoPasa = true;
        int numeroMagico = (int) (Math.random() * (11 - 1) + 1);

        System.out.println(mostrarNombre() + descripcion() + "Muy bien hijo, ¿qué número crees que he maquinao'?");

        // Juego de adivinar el numero
        do {
            int respuestaJugador = in.nextInt();

            if (respuestaJugador == numeroMagico) {
                System.out.println("Ganaste");
            } else if (respuestaJugador != numeroMagico) {
                quitarVida();
                jugadorNoPasa = false;
            } else if (vidas == 0) {
                reiniciarPartida();
            }

        }while(!jugadorNoPasa);
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
