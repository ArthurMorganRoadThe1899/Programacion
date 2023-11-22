package Programacion.Java;

public class cArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;
        int mid = 0;

            for (int i = 0; i < arr.length; i++){
                arr[i] = (int) (Math.random()*30);
            }

            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        // System.out.print(arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5]);
        
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            mid = mid + arr[i];
        }

        mid = mid / arr.length;

        System.out.println();
        System.out.println("Sumatorio: " + total);
        System.out.println("Mediana: " + mid);
        
    }
}
