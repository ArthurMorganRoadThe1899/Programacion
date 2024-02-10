package Programacion.Java.calculadoraChistosa;

public class calCULOS {
    static int a = 5;
    static int b = 2;
    static int c = 6;
    static int d = 7;
    static int n = 2;

    public calCULOS(int a, int b, int c, int d, int n){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.n = n;

    }

    public static void suma(){
        int total1 = a + c;
        int total2 = d + b;
        System.out.println(a + " + " + c + " = " + total1 +
                "\n" + d + " + " + b + " = " + total2 +
                "\n(" + a + " + " + c + ") + (" + d + " + " + b + ") = " + (total1 + total2));
    }
    public static void resta(){
        int total1 = a - c;
        int total2 = d - b;
        System.out.println(a + " - " + c + " = " + total1 +
                "\n" + d + " - " + b + " = " + total2 +
                "\n(" + a + " - " + c + ") (" + d + " - " + b + ") = " + (total1 - total2));
    }

    public static void multipli1(){
        int total1 = (a * c - b * d) * (a * d + b * c);
        System.out.println("(" + a + " * " + c + " - " + b + " * " + d + ") * (" + a + " * " + d + " + " + b  + " * " + c + ") = " + total1);
    }

    public static void multipli2(){
        System.out.println("("+  a + ", " + b + ") * " + n + " = " + "("+ a*n + ", " + b*n + ") ");
    }

    public static void laTeoriaDeLadivision(){
        System.out.println("(a, b) / (c, d) = ((" + a + " * " + c + " + " + b + " * " + d + ") / (" + Math.pow(c,2) + " + " + Math.pow(d,2) + ", (" + b + " * " + c + " - " + a + " * " + d + ") / (" + Math.pow(c,2) + " + " + Math.pow(d,2) + "))");
    }


}
