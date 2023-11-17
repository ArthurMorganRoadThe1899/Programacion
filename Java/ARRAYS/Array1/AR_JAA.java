package Programacion.Java.ARRAYS.Array1;

public class AR_JAA {
    public static void main(String[] args) {
        int [] array1 = new int[20];
        int [] array2 = new int[20];
        int [] array3 = new int[40];
        int [] array4 =new int[40];

        for (int i = 0; i < array1.length; i++){
            array1[i] = (int) (Math.random()*1000);
        }
        //System.out.println(array1[3] + " " + array1[1] + " " + array1[19]); // Esta línea es para probar que se generen correctamente los números en array1

        for (int i = 19, b = 0; i >= 0 && b < array1.length; i--, b++){
            array2[i] = array1[b];
        }
        // System.out.println(array1[0] + " " + array1[1] + " " + array1[18] + " " + array1[19]);
        // System.out.println(array2[0] + " " + array2[1] + " " + array2[18] + " " + array2[19]);
        //System.out.println(array2[1] + " " + array1[1] + " " + array2[9] + " " + array1[9] ); // Estas tres líneas era para probar que la inversión funciona de array 1 a 2 funciona
        for (int i = 0, b = 20; i <= 19 && b <= 39; i++, b++){
            array3[i] = array1[i];
            array3[b] = array2[i];
        }
        // System.out.println(array1[0] + " " + array1[1] + " " + array1[8] + " " + array1[19]  + " " + array2[0]  + " " + array2[19]);
        // System.out.println(array3[0]+ " " + array3[1] + " " + array3[8] + " " + array3[19]  + " " + array3[20]  + " " + array3[39]); // Estas dos líneas son para probar que array1 y array2 se ponen en el orden establecido para array3

        /*for (int i = 0, b = 0; i <= 19 && b <= 39; i++, b++){
            int count = i+1;
            array4[b] = array1[i];
            if(count % 2 == 0){
                array4[b] = array2[i];
            }
        }*/
        for (int i = 0, b = 0; i <= 19 && b <= 39; i++, b++){
            int count = b+1;
            if(count % 2 == 0){
                array4[b] = array2[i];
            }
        }
        // for (int i = 20; i < 39; i++){}
        System.out.println(array1[0] + " " + array2[1] + " " + array1[2] + " " + array2[3] + " " + array2[19]);
        System.out.println(array4[0] + " " + array4[1] + " " + array4[2] + " " + array4[3] + " " + array4[19]  + " " + array4[20] + array4[22]);

    }
}