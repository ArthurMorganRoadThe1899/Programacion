package Programacion.Java.TryCatch;
import java.util.Scanner;

public class CalcularDensitat {

    static int peso;
    static int volumen;

    public static void correctOperation(){
        if(volumen == 0){
            throw new ArithmeticException("NO SE PUEDE DIVIDIR ENTRE 0");
        }else{
            System.out.println(peso + "/" + volumen + " = " + (peso/volumen));
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Dame un peso");
            peso = in.nextInt();
            System.out.println("Dame un volumen");
            volumen = in.nextInt();
            correctOperation();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            // Sorry, me dio pereza hacer esto, creo que entendí el concepto, pero que pereza hacer to' el parseInt, capaz ni lo he entendio del tot srry xD//
        }catch (NumberFormatException noNumbers){
            System.out.println("SE HAN COMBINADO LETRAS CON NÚMEROS");
        }catch (Exception generic){
            System.out.println("ERROR GÉNERICO");
        }
    }
}
