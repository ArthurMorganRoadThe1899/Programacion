package Programacion.Java.cesar.no;
import java.util.Scanner;

public class xifratCesarJoseph {
    static  final int minLowercaseValue = 97;
    static final int maxLowercaseValue = 122;
    static final int lowercaseRangeValue = 26;

    public static void main(String[] args) {



        int encodingKey;
        Scanner inputText = new Scanner(System.in);

        System.out.print("Introduce un texto:");

        String message = inputText.nextLine();
        char[] characterInMessage = message.toCharArray();

        System.out.print("Introduce valor numérico para la clave de cifrado:");
        encodingKey = getEncodingKey();

        encodeMessage(encodingKey,characterInMessage);

    }
    static int getEncodingKey(){
        Scanner codeKey = new Scanner(System.in);
        boolean valid = false;
        int increase = 0 ;
        while (!valid){
            try {
                increase = codeKey.nextInt();
                valid = true;
            } catch (Exception e){
                System.out.println("se esperaba un número entero");
                codeKey.next();
            }
        }while (increase < Math.negateExact(lowercaseRangeValue)){
            increase+=lowercaseRangeValue;
        }while (increase > lowercaseRangeValue){
            increase-=lowercaseRangeValue;
        }
        return increase;
    }

    static void encodeMessage( int increase,char[] characterInMessage){
        for (int i = 0; i < characterInMessage.length; i++ ){

            if (characterInMessage[i] >= minLowercaseValue && characterInMessage[i] <= maxLowercaseValue) {

                characterInMessage[i] += (char) increase;
                //Los siguientes if ajustan los valores de los caracteres para que no salgan del rango deseado
                while (characterInMessage[i] > maxLowercaseValue) characterInMessage[i]-=lowercaseRangeValue;
                while (characterInMessage[i] < minLowercaseValue) characterInMessage[i]+=lowercaseRangeValue;

            }
            System.out.print(characterInMessage[i]);
        }
    }

}