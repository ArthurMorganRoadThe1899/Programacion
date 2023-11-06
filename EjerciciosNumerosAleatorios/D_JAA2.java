package Programacion.EjerciciosNumerosAleatorios;
import java.util.Random;
import java.util.Scanner;
public class D_JAA2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Hola mi loco, te voy a dar una carta random de las de la baraja francesa, cuando estes listo dale a Enter");
        String respuesta, verificacion = in.nextLine();

        do {
        System.out.println();
        System.out.println("Bien, allá vamos");
        int baraja = rn.nextInt(4) + 1, trebol = rn.nextInt(13) + 1, corazon = rn.nextInt(13) + 1, diamante = rn.nextInt(13) + 1, pica = rn.nextInt(13) + 1;
        String random = String.valueOf(rn.nextInt());

        System.out.println();


            if (baraja == 1) {
                if (trebol == 1) {
                    System.out.println("' Sacaste uno de trebol '");
                } else if (trebol == 2) {
                    System.out.println("' Sacaste dos de treboles '");
                } else if (trebol == 3) {
                    System.out.println("' Sacaste tres de treboles '");
                } else if (trebol == 4) {
                    System.out.println("' Sacaste cuatro de treboles '");
                } else if (trebol == 5) {
                    System.out.println("' Sacaste cinco de treboles '");
                } else if (trebol == 6) {
                    System.out.println("' Sacaste seis de treboles '");
                } else if (trebol == 7) {
                    System.out.println("' Sacaste siete de treboles '");
                } else if (trebol == 8) {
                    System.out.println("' Sacaste ocho de treboles '");
                } else if (trebol == 9) {
                    System.out.println("' Sacaste nueve de treboles '");
                } else if (trebol == 10) {
                    System.out.println("' Sacaste diez de treboles '");
                } else if (trebol == 11) {
                    System.out.println("' Sacaste la jota de treboles '");
                } else if (trebol == 12) {
                    System.out.println("' Sacaste la reina de treboles '");
                } else if (trebol == 13) {
                    System.out.println("' Sacaste el rey de treboles '");
                }
            }

            if (baraja == 2) {
                if (corazon == 1) {
                    System.out.println("' Sacaste uno de corazón '");
                } else if (corazon == 2) {
                    System.out.println("' Sacaste dos de corazones '");
                } else if (corazon == 3) {
                    System.out.println("' Sacaste tres de corazones '");
                } else if (corazon == 4) {
                    System.out.println("' Sacaste cuatro de corazones '");
                } else if (corazon == 5) {
                    System.out.println("' Sacaste cinco de corazones '");
                } else if (corazon == 6) {
                    System.out.println("' Sacaste seis de corazones '");
                } else if (corazon == 7) {
                    System.out.println("' Sacaste siete de corazones '");
                } else if (corazon == 8) {
                    System.out.println("' Sacaste ocho de corazones '");
                } else if (corazon == 9) {
                    System.out.println("' Sacaste nueve de corazones '");
                } else if (corazon == 10) {
                    System.out.println("' Sacaste diez de corazones '");
                } else if (corazon == 11) {
                    System.out.println("' Sacaste la jota de corazones '");
                } else if (corazon == 12) {
                    System.out.println("' Sacaste la reina de corazones '");
                } else if (corazon == 13) {
                    System.out.println("' Sacaste el rey de corazones '");
                }
            }

            if (baraja == 3) {
                if (diamante == 1) {
                    System.out.println("' Sacaste uno de diamante '");
                } else if (diamante == 2) {
                    System.out.println("' Sacaste dos de diamantes '");
                } else if (diamante == 3) {
                    System.out.println("' Sacaste tres de diamantes '");
                } else if (diamante == 4) {
                    System.out.println("' Sacaste cuatro de diamantes '");
                } else if (diamante == 5) {
                    System.out.println("' Sacaste cinco de diamantes '");
                } else if (diamante == 6) {
                    System.out.println("' Sacaste seis de diamantes '");
                } else if (diamante == 7) {
                    System.out.println("' Sacaste siete de diamantes '");
                } else if (diamante == 8) {
                    System.out.println("' Sacaste ocho de diamantes '");
                } else if (diamante == 9) {
                    System.out.println("' Sacaste nueve de diamantes '");
                } else if (diamante == 10) {
                    System.out.println("' Sacaste diez de diamantes '");
                } else if (diamante == 11) {
                    System.out.println("' Sacaste la jota de diamantes '");
                } else if (diamante == 12) {
                    System.out.println("' Sacaste la reina de diamantes '");
                } else if (diamante == 13) {
                    System.out.println("' Sacaste el rey de diamantes '");
                }
            }

            if (baraja == 4) {
                if (pica == 1) {
                    System.out.println("' Sacaste una de pica '");
                } else if (pica == 2) {
                    System.out.println("' Sacaste dos de picas '");
                } else if (pica == 3) {
                    System.out.println("' Sacaste tres de picas '");
                } else if (pica == 4) {
                    System.out.println("' Sacaste cuatro de picas '");
                } else if (pica == 5) {
                    System.out.println("' Sacaste cinco de picas '");
                } else if (pica == 6) {
                    System.out.println("' Sacaste seis de picas '");
                } else if (pica == 7) {
                    System.out.println("' Sacaste siete de picas '");
                } else if (pica == 8) {
                    System.out.println("' Sacaste ocho de picas '");
                } else if (pica == 9) {
                    System.out.println("' Sacaste nueve de picas '");
                } else if (pica == 10) {
                    System.out.println("' Sacaste diez de picas '");
                } else if (pica == 11) {
                    System.out.println("' Sacaste la jota de picas '");
                } else if (pica == 12) {
                    System.out.println("' Sacaste la reina de picas '");
                } else if (pica == 13) {
                    System.out.println("' Sacaste el rey de picas '");
                }
            }
            System.out.println();
            System.out.println("Quieres repetir? Si es así escribe s");
            respuesta = in.nextLine();
        }while (respuesta.equals("s"));
    }
}