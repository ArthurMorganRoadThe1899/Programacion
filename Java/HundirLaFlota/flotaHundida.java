package Programacion.Java.HundirLaFlota;
import java.util.Scanner;
public class flotaHundida {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] tablero = new int[10][10];
        int[][] tableroO = new int[10][10];
        String enter;
        int difficulty;


        System.out.println("\n" +
                "\n" +
                "888             888   888   888                888     d8b         \n" +
                "888             888   888   888                888     Y8P         \n" +
                "888             888   888   888                888                 \n" +
                "88888b.  8888b. 888888888888888 .d88b. .d8888b 88888b. 88888888b.  \n" +
                "888 \"88b    \"88b888   888   888d8P  Y8b88K     888 \"88b888888 \"88b \n" +
                "888  888.d888888888   888   88888888888\"Y8888b.888  888888888  888 \n" +
                "888 d88P888  888Y88b. Y88b. 888Y8b.         X88888  888888888 d88P \n" +
                "88888P\" \"Y888888 \"Y888 \"Y888888 \"Y8888  88888P'888  88888888888P\"  \n" +
                "                                                          888      \n" +
                "                                                          888      \n" +
                "                                                          888      \n" +
                "\n");

        System.out.println("[PRESIONA CUALQUIER BOTÓN PARA EMPEZAR]");
            enter = in.nextLine();

        System.out.println("#########################\n" +
                "###-MENU-DE-DIFICULTAD-##\n" +
                "@1·-FÁCIL---------------#\n" +
                "@2·-NORMAL--------------#\n" +
                "@3·-DIFÍCIL-------------#\n" +
                "@4·-PERSONALIZADO-------#\n" +
                "#########################\n");
        System.out.println("SELECCIONA ALGUNA DE ESTAS DIFICULTADES \n[1 | 2 | 3 | 4]");
        do {
            difficulty = in.nextInt();
            if(difficulty != 1 && difficulty != 2 && difficulty != 3 && difficulty != 4){
                System.out.println("El rango de dificultades está entre 1 y 4");
            }
        }while(difficulty != 1 && difficulty != 2 && difficulty != 3 && difficulty != 4);


    }
}
