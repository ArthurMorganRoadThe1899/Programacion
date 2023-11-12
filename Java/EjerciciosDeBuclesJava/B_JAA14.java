package Programacion.Java.EjerciciosDeBuclesJava;

import java.util.Scanner;

public class B_JAA14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int fajo_e_dinero = 0, billete500 = 0, billete200 = 0, billete100 = 0, billete50 = 0, billete20 = 0, billete10 = 0, billete5 = 0;

        System.out.println("Dame tu dinero, te hago la equivalencia en billetes");

        fajo_e_dinero = in.nextInt();

        if(fajo_e_dinero % 5 > 0){
            System.out.println("Nu, multiplos de 5 abuelo");
        }while (true){
            if (fajo_e_dinero >= 500){
                fajo_e_dinero -= 500; // Esta parte de aquí se ejecuta en todos los if, esto equivale a "fajo = fajo - cifra de dinero. Esto se hace porque le restamos eso, Esto hace que hagamos una suma más acertada de los billetes que tenemos (rollo, decimos que tenemos 520 billetes, hace la resta, fajo se convierte en 20, y el programa también suma 1 de billetes de 20, es reducción de errores)"//
                billete500++;
            }else if (fajo_e_dinero >= 200) {
                fajo_e_dinero -= 200;
                billete200++;
            }else if (fajo_e_dinero >= 100) {
                fajo_e_dinero -= 100;
                billete100++;
            }else if (fajo_e_dinero >= 50) {
                fajo_e_dinero -= 50;
                billete50++;
            }else if (fajo_e_dinero >= 20) {
                fajo_e_dinero -= 20;
                billete20++;
            }else if (fajo_e_dinero >= 10) {
                fajo_e_dinero -= 10;
                billete10++;
            }else if(fajo_e_dinero >= 5) {
                fajo_e_dinero -= 5;
                billete5++;
            }else
                break;
        }
        System.out.println("");
        System.out.println("Equivale a:");
        System.out.println(billete500 + " billetes de 500");
        System.out.println(billete200 + " billetes de 200");
        System.out.println(billete100 + " billetes de 100");
        System.out.println(billete50 + " billetes de 50");
        System.out.println(billete20 + " billetes de 20");
        System.out.println(billete10 + " billetes de 10");
        System.out.println(billete5 + " billetes de 5");
    }
}

