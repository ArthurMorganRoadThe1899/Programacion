package Programacion.EjerciciosDeFlujoRepetitivos;

import java.util.Scanner;

public class C_JAA10 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
            long secs = 0, secsTrue = 0, min = 0, hrs = 0;

            System.out.println("Dame un, este lo tendré en cuenta como segundos y te pondré en pantalla, a cuanto equivale eso");

              secs = in.nextInt();
              hrs = secs / 3600;
              secsTrue = secs % 60;
              secs = secs % 3600; // Esto de aquí es para que, cuanto se muestre en pantalla los segundos, lo haga en intervalos de 60, si no lo haría de 3600 en 3600
              min= secs / 60;

              System.out.format("%d:%d:%d",hrs,min,secsTrue);
              System.out.println(" ");
              System.out.println(" ");
              System.out.println("Se lee h/m/s, muchas gracias ^^");
    }
}

// Hecho por Jose Alba Arrufat

/* Escriu un programa que rep com a dades d'entrada una hora expressada en hores, minuts i segons que ens calcula i escriu l'hora, minuts i segons que seran, transcorregut un segon. */
