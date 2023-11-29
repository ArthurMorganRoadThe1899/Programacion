package Programacion.Java.cesar;
import java.util.Scanner;

public class cifradoCesar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] abecedario = new char[] {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String rS;

        System.out.println("Dime una palabra, y la cifrare con el cifrado César de la magnitud de desplazamiento que busques.");

        //do {
            do {
                rS = in.nextLine(); // Palabra a cifrar
            } while (rS.isEmpty());
        //}while(); // Arreglar este while, he de hacer que pida obligatoriamentem que rS tenga solo letters

        System.out.println("¿Que tipo de cifrado César quieres utilizar?");
        int rC = in.nextInt(); // Número de rotación

        char [] rCS = rS.toCharArray(); // array de carácteres basado en la palabra a cifrar

        // Cifrado
        for(int i = 0; i < rCS.length; i++){
            int b = 0;

            while(rCS[i] != abecedario[b]){
                b++;
            }
            /*if(abecedario[b].equals(" ")){
                rCS[i] = abecedario[0];
            }else{

            }*/
            rCS[i] = abecedario[b + rC];
        }

        System.out.println("Aquí tienes el texto cifrado");
        System.out.println(rCS);

    }
    /*public static void cifrar(String[] args){

    }*/
}

/*
// Storm IDEAS //
    usar un CharAt para almacenar el contenido del String en un array de letras

// URLs //
    http://puntocomnoesunlenguaje.blogspot.com/2016/02/cifrado-cesar-java.html

// PROBLEMAS //
    Como he dejado ahora esto, el cifrado funciona, pero si se pasa del limite peta, y si pongo espacios también

 */