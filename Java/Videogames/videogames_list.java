package Programacion.Java.Videogames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class videogames_list {

    static int i = 1;
    static String add;

    static Scanner in = new Scanner(System.in);
    static ArrayList<String> vgL = new ArrayList<>(Arrays.asList("Red Dead Redemption", "Splatoon", "Digimon", "Pokémon", "Yakuza"));
    static ArrayList<String> vgD = new ArrayList<>(Arrays.asList("ES UN VIDEOJUEGO DE TEMÁTICA DRAMA-WESTERN PROTAGONIZADO POR LA BANDA DE FORAJIDOS DE DUTCH VAN DER LINDE,\nBAJO LA PERSPECTIVA DE ARTHUR MORGAN, UN FORAJIDO CRIADO EN ESTÁ BANDA,\nY VE COMO A LO LARGO DE ESTÁ HISTORIA ESTÁ VA CAMBIANDO ANTE SUS OJOS",
            "ES UN MUNDO EN EL QUE LA HUMANIDAD FUE EXTINTA POR SUS AMBICIONES,\nY ESPECIES MARINAS ABSORBIENDO PARTE DE LA ESENCIA DE LA HUMANODAD PARA PROPSPERAR Y CONVERTIRSE EN UNA SOCIEDAD",
            "ES UNA FRANQUICIA EN EL QUE HAY CRIATURAS ELEMENTALES EN UN MUNDO DIGITAL,\nEN MUCHAS DE SUS HISTORIAS SE NARRA COMO CHAVALES ACABAN EN ESE MUNDO Y, CONGENIANDO CON LOS PROPIOS DIGIMON, DETIENEN UN MAL MAYOR",
            "UN MUNDO DONDE HAY CRIATURAS CON PODERES ELEMENTALES Y DONDE MUCHA GENTE ASPIRA A SER ENTRENADOR POKÉMON [normalmente, el jugador lo es],\nGENTE QUE CAPTURA A ESTAS CRIATURAS PARA USARLAS EN COMBATES POKÉMON,\nLA MÁXIMA CÚSPIDE DE UN ENTRENADOR EN MUCHAS REGIONES, ES EN VENCER A LA ELITE DE LA PROPIA REGIÓN Y CONVERTIRSE EN EL CAMPEÓN",
            "ES UNA SAGA EN LA QUE, SE NARRA LA HISTORIA DE UNA SERIE DE CLANES YAKUZA,\nESTO PROTAGONIZADO Y VISTO BAJO LOS OJOS DE KAZUMA KIRYU. EN LA ACTUALIDAD, KIRYU A SIDO RELEVADO COMO PROTAGONISTA POR ICHIBAN KASUGA"));

    public videogames_list(int i){
        this.i = i;
        this.add = add;

    }

    public static void games() {
        System.out.println("\n" + vgL.get(i));
        System.out.println(vgD.get(i));
    }

    public static void add(){
        System.out.println("Muy bien, escribe un juego:");
        String r = in.nextLine();
        vgL.add(r);
        System.out.println("Muy bien, ahora añadele una descripción");
        String d = in.nextLine();
        vgD.add(d);
    }

    public static void remove(){
        boolean tf = false;

        System.out.println("Muy bien, está es la lista de juegos ¿cuál quieres borrar?\n[VAN EN EL ORDEN EN EL QUE SALEN, 1, 2, 3...]\n" + vgL);
        int i = in.nextInt();
        i = i - 1;
        do {
            tf = false;
            try {
                vgL.remove(i);
                vgD.remove(i);
                tf = false;
            } catch (Exception e) {
                tf = true;
            }
            if (tf) {
                System.out.println("Valor introducido no valido");
                tf = true;
            }
        }while (tf);

    }
    public static void show(){
        System.out.println(vgL);
    }
}