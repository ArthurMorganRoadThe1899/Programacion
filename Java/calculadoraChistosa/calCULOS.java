package Programacion.Java.calculadoraChistosa;

public class calCULOS {
    static final int a = 5;
    static final int b = 2;
    static final int c = 6;
    static final int d = 7;

    public static int suma(){
        int total1 = a + c;
        int total2 = d + b;
        System.out.println(a + " + " + c + " = " + total1 +
                "\n" + d + " + " + b + " = " + total2 +
                "\ntotal: " + (total1 +  total2));
        return(total1);
    }
    public static int resta(){
        int total1 = a - c;
        int total2 = d - b;
        System.out.println(a + " - " + c + " = " + total1 +
                "\n" + d + " - " + b + " = " + total2 +
                "\ntotal: " + (total1 +  total2));
        return(total1);
    }

    public static int multipli(){
        int total1 = a + c;
        int total2 = d + b;
        int total3 = a + d;
        int total4 = c + b;
        System.out.println(a + " + " + c + " = " + total1 +
                "\n" + d + " + " + b + " = " + total2 +
                "\ntotal: " + (total1 +  total2));
        return(total1);
    }

    public static int division(){
        int total1 = a + c;
        int total2 = d + b;
        System.out.println(a + " + " + c + " = " + total1 +
                "\n" + d + " + " + b + " = " + total2 +
                "\ntotal: " + (total1 +  total2));
        return(total1);
    }

/**/
}
