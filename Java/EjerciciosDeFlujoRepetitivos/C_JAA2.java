package Programacion.Java.EjerciciosDeFlujoRepetitivos;

import java.util.Scanner;

public class C_JAA2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
            int edad = 0;

              System.out.println("Cuantos años tienes");
              edad = in.nextInt();

              if(edad >= 18 ){
                  System.out.println("Eres mayor de edad");
        }
    }
}

// Hecho por Jose Alba Arrufat

/* Escriu un programa que demana l'edat per teclat i ens mostra el missatge de “eres major d'edat” o el missatge de “eres menor d'edat”. */
