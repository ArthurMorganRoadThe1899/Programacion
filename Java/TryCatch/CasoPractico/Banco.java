package Programacion.Java.TryCatch.CasoPractico;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        int respuesta;
        Scanner in = new Scanner(System.in);

        Cliente cliente1 = new Cliente(5000, 0);

        do {
        System.out.println("\n============================\n" +
                "==== 1. EXTRAER DINERO =====\n" +
                "==== 2. DEPOSITAR DINERO ===\n" +
                "==== 3. SALIR ==============\n" +
                "============================");

        respuesta = in.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("Cuanto dinero quieres sacar?");
                    cliente1.extraccion();
                    System.out.println(cliente1.toString());
                    break;

                case 2:
                    System.out.println("Cuanto dinero quieres meter?");
                    cliente1.depositar();
                    System.out.println(cliente1.toString());
                    break;

                case 3:
                    System.out.println("Adeu!!");
                    break;
                default:
                    System.out.println("Has introducido un valor fuera del rango esperado");
                    break;
            }
        }while (respuesta != 3);
    }
}
