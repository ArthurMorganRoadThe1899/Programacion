package TareaJava.EjerciciosDeFlujoRepetitivos;

import java.util.Scanner;

public class C_JAA9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;

        System.out.println("Dame la nota de tu examen chaval");

        System.out.println("Dame un valor");
        num1 = in.nextInt();

        if (num1 <= -1){
            System.out.println("Ya me deprimiría tener que calificar tan bajo");
        }else if(num1 <= 2){
            System.out.println("Muy deficiente");
        }else if (num1 <= 4){
            System.out.println("Insuficiente");
        } else if (num1 <= 6) {
            System.out.println("Bien");
        }else if (num1 <= 8){
            System.out.println("Notable");
        }else if (num1 <= 10){
            System.out.println("Excelente");
        }else if (num1 > 10){
            System.out.println("Mijo, aquí no se califica con tanta nota");
        }

    }
}

// Hecho por Jose Alba Arrufat

/* Escriu un programa que llegisca una qualificació numèrica entre 0 i 10 i la transforma en qualificació alfabètica, escrivint el resultat.
• de 0 a <3 Molt Deficient.
• de 3 a <5 Insuficient.
• de 5 a <6 Bé.
• de 6 a <9 Notable
• de 9 a 10 Excel·lent */
