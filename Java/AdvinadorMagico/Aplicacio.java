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
                        JocEndevinaNumero juegico = new JocEndevinaNumero(0);
                        juegico.jugar();
                        jugoAunJuego = true;
                        break;

                    case 2:
                        JocEndevinaParell juegico2 = new JocEndevinaParell(0);
                        juegico2.jugar();
                        jugoAunJuego = true;
                        break;

                    case 3:
                        JocEndevinaImparell juegico3 = new JocEndevinaImparell(0);
                        juegico3.jugar();
                        jugoAunJuego = true;
                        break;
                    case 4:
                        System.out.println("Desconectando...");
                        break;

                    default:
                        System.out.println("Valor introduccido no está en el rango propuesto de juegos\n");
                        break;
                }

        }while(respuesta != 4);

    }
}
