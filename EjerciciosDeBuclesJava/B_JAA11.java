package TareaJava.EjerciciosDeBuclesJava;

public class B_JAA11 {
    public static void main(String[] args){
        int num = 0, par = 0, impar = 0;

        for(int limit = 100; limit <= 200; limit++){
            if (num % 2 == 0){
                par = num + par;
            }else{
                impar = num + impar;
            }num++;
        }
        System.out.println("");
        System.out.println("El resultado de los impares es " + impar + " y el de los pares " + par);

    }
}

