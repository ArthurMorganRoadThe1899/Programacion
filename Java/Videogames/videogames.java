package Programacion.Java.Videogames;
import java.util.Scanner;
public class videogames {
    static Scanner in = new Scanner(System.in);
    static int x;
    static char r;
    public static void main(String[] args) {
        System.out.println("\n¿Hola caballero, bienvenido a la lista de videojuegos, que videojuego te gustaría consultar?" +
                "\n--------------------------------" +
                "\n==== 1. RED DEAD REDEMPTION ====" +
                "\n==== 2. SPLATOON ===============" +
                "\n==== 3. DIGIMON ================" +
                "\n==== 4. POKÉMON ================" +
                "\n==== 5. YAKUZA =================" +
                "\n--------------------------------");

        boolean y;
        do {
            try {
                x = Integer.parseInt(in.nextLine());
                y = false;
            } catch (Exception err) {
                y = true;
            }
            if(y){
                System.out.println("Valor introducido no valido");
                y = true;
            }
        }while(y);

        x = x - 1;
        videogames_list value = new videogames_list(x);
        videogames_list.games();

    System.out.println("¿Quieres añadir un juego?\n[S?]");
    r = in.next().charAt(0);


    }
}

/*
   ! HACER LOOP
   ! QUE TE PIDA METER NUEVOS VALORES
   ! VALIDAR QUE CUANDO EL JUGADOR PONE UN NÚMERO DEL ARRAYLIST, NO PETE PORQUE PUSO UN NÚMERO QUE NO EXISTE AHÍ
 */