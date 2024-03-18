package Programacion.Java.AdvinadorMagico;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class JocEndevinaNumero extends Joc implements IJugable {

    protected int vidas;

    public JocEndevinaNumero(int vidas) {
        super(vidas);
        this.vidas = vidas;
    }

    @Override
    public String mostrarVidasRestantes() {
        return STR."\n[VIDAS RESTANTES: \{vidas}]";

    }

    @Override
    public int quitarVida() {
        return vidas = vidas - 1;
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

    // Arreglar código, es muy poco readeable a ojo humano
    @Override
    public void jugar() {
        boolean reintentar = false;
        int respuestaJugador = 0;
    do {
        Scanner in = new Scanner(System.in);
        boolean jugadorPasa = false;
        boolean error = false;
        vidas = 5;
        int numeroMagico = (int) (Math.random() * (11) + 0);

        System.out.println(STR."\{mostrarNombre()}\{descripcion()}Muy bien hijo, ¿qué número crees que he maquinao'?");

        // JUEGO DE ADIVINAR EL NÚMERO
        do {
            System.out.println(mostrarVidasRestantes());

            // PREGUNTARLE AL USUARIO QUE NÚMERO CREE QUE HA SALIDO
            do {
                try {
                    error = false;
                    respuestaJugador = parseInt(in.nextLine());
                }catch(Exception e){
                    error = true;
                }
                if(respuestaJugador > 10 || respuestaJugador < 0 || error){
                    System.out.println("Dato introducido invalido o rango invalido [0-10]");
                }
            }while(respuestaJugador > 10 || respuestaJugador < 0 || error);

            // CONDICIÓN DE VICTORIA Y DE PERDER VIDAS
            if (respuestaJugador == numeroMagico) {
                System.out.println("""
                        \n////////////////////////////////
                        /////////// VICTORIA //////////
                        ////////////////////////////////
                        """);
                jugadorPasa = true;
                reintentar = false;
            } else {
                quitarVida();
            }

            // EL JUGADOR SE QUEDA SIN VIDAS
            if (vidas == 0) {
                System.out.println("\nPERDISTE PATÉTICAMENTE, HMPH, HASTA BABU LO HACE MEJOR QUE TU\n");
                jugadorPasa = true;
            }
        }while (!jugadorPasa);

        // PREGUNTARLE AL USUARIO SI QUIERE REINICIAR
        if (vidas == 0) {
            reintentar = reiniciarPartida();
        }
    }while(reintentar);
    }
}
