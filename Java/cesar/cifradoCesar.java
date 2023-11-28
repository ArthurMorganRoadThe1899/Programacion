package Programacion.Java.cesar;
import java.util.Scanner;

public class cifradoCesar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char xd = 'a';

        System.out.println("Dime una palabra, y la cifrare con el cifrado César de la magnitud de desplazamiento que busques.");

        String rS = in.nextLine();
        System.out.println("¿Que tipo de cifrado César quieres utilizar?");
        int rC = in.nextInt();

    }
}

/*
// Storm IDEAS //
    usar un CharAt para almacenar el contenido del String en un array de letras

// URLs //
    http://puntocomnoesunlenguaje.blogspot.com/2016/02/cifrado-cesar-java.html
 */