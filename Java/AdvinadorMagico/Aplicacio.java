package Programacion.Java.AdvinadorMagico;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Aplicacio {

    private static int respuesta;
    private static char respuestaDeCaracteres;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean potPasar;
        boolean potPasar2;
        boolean jugoAunJuego;

        System.out.println("¿BUENAS, QUE JUEGICO QUIERES JUGAR?");

        do {
            System.out.println(
                    "============================\n" +
                            "==== 1. ADIVINAR NÚMERO ====\n" +
                            "==== 2. ADIVINAR PAR =======\n" +
                            "==== 3. ADIVINAR IMPAR =====\n" +
                            "==== 4. SALIR ==============\n" +
                            "============================");


                do {
                    jugoAunJuego = false;
                    try {
                        potPasar = true;
                        respuesta = parseInt(in.nextLine());
                    }catch(Exception e){
                        System.out.println("Valor introducido no es un número\n");
                        potPasar = false;
                    }
                }while(!potPasar);


                switch (respuesta) {
                    case 1:
                        JocEndevinaNumero juegico = new JocEndevinaNumero();
                        juegico.jugar();
                        jugoAunJuego = true;
                        break;

                    //case 2:

                    //case 3:

                    case 4:
                        System.out.println("Desconectando...");
                        break;


                    default:
                        System.out.println("Valor introduccido no está en el rango propuesto de juegos\n");
                        break;
                }

                // LE PREGUNTAMOS AL USUARIO SI YA HA JUGADO UN JUEGO, SI QUIERE JUGAR A OTRO
                if(jugoAunJuego){
                    System.out.println("¿Quieres jugar algún otro juego?\n[S/N]");

                    do{
                        try {
                            potPasar2 = true;
                            respuestaDeCaracteres = in.next().charAt(0);
                        }catch(Exception e){
                            System.out.println("Valor introducido erroneo\n");
                            potPasar2 = false;
                        }

                        if (respuestaDeCaracteres != 'S' && respuestaDeCaracteres != 's' && respuestaDeCaracteres != 'N' && respuestaDeCaracteres != 'n'){
                            System.out.println("Valor introducido erroneo\n");
                            potPasar2 = false;
                        }

                    }while(!potPasar2);
                }
        }while(respuesta != 4 || respuestaDeCaracteres == 'S' || respuestaDeCaracteres == 's');

    }
}
