package Programacion.Java.Proyecto;
import java.util.Scanner;

public class proyecto_JAA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n" +
                "Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke\n" +
                "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n" +
                "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n" +
                "está construyendo para destruirla.");

        System.out.println();
        System.out.println("PRESIONA ENTER PARA CONTINUAR...");
        String eR = in.nextLine();

        // NIVEL 1
        int S1 = (int) (Math.random() * (10 + 1));
        int S2 = (int) (Math.random() * ((30 - 20) + 1) + 20);
        int total = 0;
        int r1 = 0;

            System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n" +
                    "sistema " + S1 + " en el sector "+ S2 + ", pero el sistema de navegación está estropeado y el\n" +
                    "computador tiene problemas para calcular parte de las coordenadas de salto.\n" +
                    "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n" +
                    "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n" +
                    "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n" +
                    "¿Qué debe introducir?");


            for (int i = S1; i <= S2; i++) {
                total += i; // La respuesta es esta variable
            }
            System.out.println(total);
            r1 = in.nextInt();


        // NIVEL 2
            if(r1 == total){
                int P1 = (int) (Math.random() * (7 + 1));
                int P2 = (int) (Math.random() * ((30 - 20) + 1) + 20);
                int total2 = 1;
                int r2 = 0;
                System.out.println();
                System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n" +
                        "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n" +
                        "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n" +
                        "agente de espaciopuerto P1 contactando con nave imperial P2. No están destinados\n" +
                        "en este sector. ¿Qué hacen aquí?”. Han Solo coge el omunicador e improvisa. “Eh…\n" +
                        "tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para\n" +
                        "atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n" +
                        "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n" +
                        "manual del piloto que estaba en la guantera y da con la página correcta. El código\n" +
                        "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
                        "¿Cuál es el código?");

                for (int i = P1; i <= S2; i++) {
                    total2 *= i; // La respuesta es esta variable
                }
                System.out.println(total2);
                r2 = in.nextInt();

                // NIVEL 3
                    if(r2 == total2){

                    }else if(r2 != total2){
                        System.out.println("SNAKE?? SNAKEEEEEE!!!!!!");
                    }

            }else if(r1 != total){
                System.out.println("SNAKE?? SNAKEEEEEE!!!!!!");
            }

    }
}
