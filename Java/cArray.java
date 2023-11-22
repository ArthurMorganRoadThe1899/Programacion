package Programacion.Java;

public class cArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;

            for (int i = 0; i < arr.length; i++){
                arr[i] = (int) (Math.random()*30);
            }
        System.out.print(arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5]);
        
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        System.out.println(" " + total);
        
    }
}
