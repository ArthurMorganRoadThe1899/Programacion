package Programacion.Java.MáquinaDeSnacks;
import java.util.Scanner;
public class maquinaSnacks_JAA {
    public static void main(String[] args) {
        String[][] nombreCochinada = {
                {"Chocapic", "Sugus", "Schokobons"},
                {"Papas", "Pipas", "Nueces"},
                {"Coca-cola", "Monster", "Agua"},
        };
        double[][] precio = {
                {1.1, 0.8, 1.5},
                {1.8, 1, 1.2},
                {1.8, 1.3, 1.2},
        };
        int rF;
        int rD;
        char reF;

        Scanner in = new Scanner(System.in);
        String spa;
        System.out.println("\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⠀⢀⣀⡀⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⣿⣿⡟⠛⣿⣿⠋⣿⣿⣿⣿⣿⠀⣿⠉⣿⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⣿⣏⣁⣀⣉⣁⣀⣉⣉⣉⣉⣿⠀⠿⠶⠿⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⡿⠛⢿⣿⣿⠀⠰⠶⠆⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⣿⣯⣭⣭⣭⣭⣭⣥⣤⣬⣭⣿⠀⠐⠶⠆⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⣿⣿⡟⢿⣿⠁⣿⣿⠉⢹⣿⣿⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⣿⣧⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⣿⣿⠉⠙⣿⠉⠉⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣿⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠰⠶⠆⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⢻⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⠀⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "\n Vaya, te has topado con una máquina expendedora salvaje\n" +
                "\n[DALE A ENTER]");

            spa = in.nextLine();

        System.out.println("\n¿Qué snack te hace pillarte?\n" +
                "FILA 0: 0-Chocapic | 1-Sugus | 2-Schokobons\n" +
                "FILA 1: 0-Papas | 1-Pipas | 2-Nueces\n" +
                "FILA 2: 0-Coca-cola | 1-Monster | 2-Agua\n" +
                "\nespecífica ¿qué fila quieres pillar?");

        do {
            rF = in.nextInt();

            if(rF > 2 || rF < 0){
                System.out.println("Solo hay filas de 0 a 2");
            }
        }while(rF > 2 || rF < 0);

        System.out.println("Vaale ¿de esa fila cuál te hace?");

        do {
            rD = in.nextInt();

            if(rD > 2 || rD < 0){
                System.out.println("Solo hay 3 porquerías, así que esto es de 0 a 2");
            }
        }while(rD > 2 || rD < 0);

        System.out.println("Muy bien, vas a sacar un " + nombreCochinada[rF][rD] + ", te costará " + precio[rF][rD] + "€\n" +
                "\n[¿METES TU DINERO PARA SACAR EL " + nombreCochinada[rF][rD] + "?\nRESPONDE CON Y/N");


           do{
               reF = in.next().charAt(0);
               if(reF != 'Y' && reF != 'N' && reF != 'y' && reF != 'n'){
                   System.out.println("[SOLO ADMITO Y/N]");
               }
           }while(reF != 'Y' && reF != 'N' && reF != 'y' && reF != 'n');

           if(reF == 'Y' || reF == 'y'){
               System.out.println("Aquí tienes un " + nombreCochinada[rF][rD] + " mi rey");
               System.out.println("\n[PERDISTE -" + precio[rF][rD] + "€]");
           }else if(reF == 'N' || reF == 'n'){
               System.out.println("Vete con tu sucio dinero, si esque tienes... Pobre");
           }

        System.out.print("\nGRACIAS POR EJECUTARME");

           if(reF == 'N' || reF == 'n'){
               System.out.print("... pobre");
           }
    }
}
