import java.util.Scanner;

public class B_JAA5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numFac = 1, factorial = 1, decisivo = 1;

        System.out.println("Dame ese numerin");
        numFac = in.nextInt();

        for(decisivo = 1; decisivo <= numFac; decisivo++){
            factorial = factorial * decisivo;
        }
        System.out.println("El numero factorial de " + numFac + " es igual a " + factorial);
    }
}

// Hecho por Jose Alba Arrufat //
