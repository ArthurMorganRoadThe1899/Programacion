package Programacion.Java.Videogames;
import java.util.Scanner;
public class videogames {
    static Scanner in = new Scanner(System.in);
    static int x;
    static int r;
    static int count;
    public static void main(String[] args) {
        count = 0;
        /* PARTE 1 DEL CÓDIGO */
        System.out.println("\n¿Hola caballero, bienvenido a la lista de videojuegos, que videojuego te gustaría consultar?" +
                "\n--------------------------------" +
                "\n==== 1. RED DEAD REDEMPTION ====" +
                "\n==== 2. SPLATOON ===============" +
                "\n==== 3. DIGIMON ================" +
                "\n==== 4. POKÉMON ================" +
                "\n==== 5. YAKUZA =================" +
                "\n--------------------------------");

    /* * DO-WHILE si se a la hora de mostrar un juego, el usuario intenta poner algún valor que no esté en el array*/
    do{
        count = count + 1;
        boolean y = false;
        boolean errorFatal = false;
        /* * DO-WHILE PARA CONSULTAR JUEGOS*/
        do {
            if (r == 1 || r == 2 || r == 3) {
                System.out.println("Aquí tienes la lista de juegos en corto");
                videogames_list.show();
            }

            do {
                try {
                    x = in.nextInt();
                    y = false;
                } catch (Exception err) {
                    System.out.println("Valor introducido invalido");
                    y = true;
                }
            }while (y);

            x = x - 1;
            videogames_list value = new videogames_list(x); /*Esto es para hacer referencia a unas variables de videogames_list */

            try {
                videogames_list.games();
            }catch (Exception fatal){
                errorFatal = true;
                System.out.println("ERROR, NO HAY NINGÚN JUEGO DE VALOR " + "[" + (x + 1) + "]");
            }
        }while(errorFatal);

        /* PARTE 2 DEL CÓDIGO */
            System.out.println("\nMuy bien, para acabar que te gustaría hacer algo más?\n" +
                    "=================================\n" +
                    "===== 1. AÑADIR VIDEOJUEGOS =====\n" +
                    "===== 2. ELIMINAR JUEGO =========\n" +
                    "===== 3. VOLVER VER LA LISTA ====\n" +
                    "===== 4. SALIR ==================\n" +
                    "=================================\n");
            do {
                r = in.nextInt();
                if(r != 1 && r != 2 && r != 3 && r != 4){
                    System.out.println("Valor introducido no valido");
                }
            }while(r != 1 && r != 2 && r != 3 && r != 4);

            if(r == 1){
                videogames_list.add();
            }else if(r == 2){
                videogames_list.remove();
            }
    }while(r != 4);
        System.out.print("\nAle, buenas tardes");
        if(count == 7){
            System.out.print("... pobre");
        }
    }
}

/*
 ! EN LA PARTE FINAL DEL CÓDIGO, CUANDO LLAMAS AL MÉTODO ADD, FUNCIONA BIEN, PERO A VECES ME PASA QUE COMO MANTENGO PULSADO UN RATO EL BÓTON SE ME QUEDA VACÍO EL CAMPO vgL [Lo que he de meter en el array del nombre del juego]
 */