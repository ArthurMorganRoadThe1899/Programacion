package Programacion.Java.EjerciciosDeFlujoRepetitivos;

import java.util.Scanner;

public class C_JAA11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long hrs = 0, salarioN = 0, salarioB = 1200, tarifa = 25, impuestosGenerales = 345;
        /* Para este ejercicio, haré un hipotético, la tarifa de normal las 35 previas horas son 25€, y diremos que el salario bruto en general, es de 1200€ */
        /* Como dato adicional puse unos impuestos generales a la formula, solo para dejar más pobre aún al pobre trabajador que no podrá cobrar apenas 800€ al mes*/
        double m = 1.5;
        System.out.println("Dime cuantas horas has trabajado, y te digo tu los datos de tu salario");

        hrs = in.nextInt();

        if (hrs <= 35){
            salarioN = salarioB - tarifa - impuestosGenerales;
            System.out.println("Tu salario neto es " + salarioN);
        }else if (hrs > 35){
            tarifa = (long) (tarifa * m);
            salarioN = salarioB - tarifa - impuestosGenerales;
            System.out.println("Tu salario neto es " + salarioN);
        }

        System.out.println(" ");
        System.out.println("Muchas gracias por su noble participación en Aperture Science, siga desviviendose así por nosotros \uD83D\uDE42");

    }
}


// Hecho por Jose Alba Arrufat

/* Escriu un programa que calcula el salari net setmanal d'un treballador en funció del nombre d'hores treballades i la taxa d'impostos d'acord amb les següents hipòtesis:
• Les primeres 35 hores es paguen a tarifa normal.
• Les hores que passen de 35 es paguen a 1,5 vegades la tarifa normal. */
