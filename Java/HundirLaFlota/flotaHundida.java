package Programacion.Java.HundirLaFlota;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class flotaHundida {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String enter;
        int difficulty, max_disparos, longitud_t, lanchaN = 0, portaavionesN = 0, buqueN = 0, acorazadoN = 0, totalB = 0;
        char lancha = 'L', portaaviones = 'P', buques = 'B',  acorazados = 'Z', awa = 'a', tocado = 'X', hundido = 'X', fallo = '0';

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
        in.nextLine();

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
            if (difficulty != 1 && difficulty != 2 && difficulty != 3 && difficulty != 4) {
                System.out.println("El rango de dificultades está entre 1 y 4");
            }
        } while (difficulty != 1 && difficulty != 2 && difficulty != 3 && difficulty != 4);

        if (difficulty == 1) {
            max_disparos = 50;
            longitud_t = 10;
            lanchaN = 5;
            portaavionesN = 1;
            buqueN = 2;
            acorazadoN = 1;
            totalB = lanchaN + portaavionesN + buqueN + acorazadoN;
            char[][] tablero = crearTablero(lancha, buques, acorazados, portaaviones, difficulty, longitud_t, awa, lanchaN, portaavionesN, buqueN, acorazadoN, totalB);
            mostrarTablero(tablero, awa, lancha, portaaviones, buques, acorazados);
            int barcoSinDetectar = totalB;
            while (barcoSinDetectar > 0){
                int[] adivinadorMagico = obtenerCoordenadas(longitud_t);
                char actualizadorTablero = evObt(adivinadorMagico, tablero, awa, lancha, portaaviones, buques, acorazados, tocado, hundido, fallo);
                if (actualizadorTablero == tocado){
                    barcoSinDetectar--;
                }
                tablero = actTab(tablero, adivinadorMagico, actualizadorTablero);
                mostrarTablero(tablero, awa, lancha, portaaviones, buques, acorazados);
            }
        }
        else if (difficulty == 2) {
            System.out.println("prueba2");
        }
        else if (difficulty == 3) {
            System.out.println("prueba3");
        }
        else if (difficulty == 4) {
            System.out.println("prueba4");
        }


    }

    //====================
    //== MOSTRAR TABLERO
    //====================
    static void mostrarTablero(char[][] tablero, char awa, char lancha, char buques, char acorazados, char portaaviones){
        int longitudTablero = tablero.length;
        System.out.print(" ");
        for(int i = 0; i < tablero.length; i++){
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for(int fila = 0; fila < longitudTablero; fila++){
            System.out.print(fila + " ");
            for(int colu = 0; colu < longitudTablero; colu++){
              char pos = tablero[fila][colu];

              if(pos == lancha){
                  System.out.print(pos + " "); //SI AQUÍ CAMBIAR "awa" por "pos" REVELA LA POSICIÓN DE LOS BARCOS //
              }else{
                    System.out.print(pos + " ");
                }
              }
            System.out.println();
            }
        System.out.println();
        }

    //============================================
    //== PARÁMETROS DE LA PARTIDA | CREAR TABLERO
    //============================================
    static char[][] crearTablero(char lancha, char buques, char acorazados, char portaaviones, int difficulty, int longitud_t, char awa, int lanchaN, int portaavionesN, int buqueN, int acorazadoN, int totalB){
        char[][] tablero = new char[longitud_t][longitud_t];

        for(char[]filas:tablero){
            Arrays.fill(filas,awa);
        }
     return situarCosas(tablero, lancha, lanchaN, portaaviones, portaavionesN, buques, buqueN, acorazados, acorazadoN, awa, totalB);
    }

    //=================
    //== SITUAR BARCOS
    //=================
    static char[][] situarCosas(char[][] tablero, char lancha, int lanchaN, char portaaviones, int portaavionesN, char buques, int buqueN, char acorazados, int acorazadoN, char awa, int totalB){
        int barcosSituados = 0;
        int longitudTablero = tablero.length;
        //METER VARIABLES LOOPS PARA EL RESTO DE VEHICULOS
        while (barcosSituados < lanchaN) {
            int[] ubicar = coordenadas(longitudTablero);

            char ubicacion = tablero[ubicar[0]][ubicar[1]];
            if (ubicacion == awa) {
                tablero[ubicar[0]][ubicar[1]] = lancha;
                barcosSituados++;
            }
        }
        return tablero;
    }

    //==========================================
    //== GENERAR COORDENADAS DE CADA TRANSPORTE
    //==========================================
    static int[] coordenadas(int longitudTablero){
        int[] coordenadas = new int[2];
        for(int i = 0; i < coordenadas.length; i++){
            coordenadas[i] = new Random().nextInt(longitudTablero);
        }
        return coordenadas;
    }

    //==================
    //== REVELAR BARCOS
    //==================
    static int[] obtenerCoordenadas(int longitudT) {
    int fila;
    int colu;
    do {
        System.out.println("Elige fila: ");
        fila = new Scanner(System.in).nextInt();
    }while(fila < 1 || fila > longitudT + 1);

    do {
        System.out.println("Elige columna: ");
        colu = new Scanner(System.in).nextInt();
    }while(colu < 1 || colu > longitudT + 1);
    return new int[]{fila, colu - 1}; //TESTESTESTESTESTESTESTEWSTSAFWA
}

    //============================================
    //== EVALUADOR DE LA POSICIÓN DE LAS CASILLAS
    //============================================
    static char evObt(int[] adivinadorMagico, char[][] tablero, char awa, char lancha, char portaaviones, char buques, char acorazados, char tocado, char hundido, char fallo) {
        String mensajin;
        int fila = adivinadorMagico[0];
        int colu = adivinadorMagico[1];
        char casObjet = tablero[fila][colu];
        if(casObjet == lancha || casObjet == portaaviones || casObjet == buques || casObjet == acorazados){
            mensajin = "¡¡TOCADO!!";
            casObjet = tocado;
        }else if(casObjet == awa){
            mensajin = "jsjsjs, fallaste pringao";
            casObjet = tocado;
        }else{
            mensajin = "je, ya lo golpeaste pndejo";
        }
        System.out.println(mensajin);
        return casObjet;
    }

    //========================================
    //== ACTUALIZADOR INTERACTIVO DEL TABLERO
    //========================================
    static char[][] actTab(char[][] tablero, int[] adivinadorMagico, char actualizadorTablero) {
        int fila = adivinadorMagico[0];
        int colu = adivinadorMagico[1];
        tablero[fila][colu] = actualizadorTablero;
        return tablero;
    }
}


