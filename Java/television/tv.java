package Programacion.Java.television;
import java.util.Scanner;
public class tv {
    static int canal = 1;
    static int volumen = 50;
    static int remember;
    static boolean ir = false;

    static char what = ' ';
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¡Has encendido la tv!");
        System.out.println("     -._\n" +
                "         '--._\n" +
                "    .---.     '-..\n" +
                "    )''  `'-      `._\n" +
                "    )c  -'\\\\         `.\n" +
                "  ,.|\\_=/              -._       _.\n" +
                ".' /   (                  ' ,----'|---.\n" +
                "| |  \\  )\\                  |`-.|     |\n" +
                "|  \\ '_.__`---,.____.       |   |     |\n" +
                "| `.= ..,_'\\..\\..L__//      |   |     |\n" +
                "|         .'._   `--'       |   |     |\n" +
                "\\        .'-._\\_            '`.,|     |\n" +
                " `       |    -.`.  _,..,--- `'.-----.'\n" +
                "  \\_____,|`-.   \\ \\.            | | kOs\n" +
                "  | |./| |./ \\  ,-.'            | |\n" +
                "  './  './   '...-'            |_._|\n" +
                "\n\n¿Qué te gustaría hacer?");
                    in.nextLine();

                    do {
                        System.out.println("|| CAMBIAR CANAL (UP) - U" +
                                "\n|| CAMBIAR CANAL (DOWN) - D" +
                                "\n|| SUBIR VOLUMEN (MORE) - M" +
                                "\n|| BAJAR VOLUMEN (LESS) - L" +
                                "\n|| SILENCIAR VOLUMEN VOLUMEN (SILENCE) - S [SI YA ESTA SILENCIADO, EL VOLUMEN VOLVERÁ A SU ESTADO PREVIO A HABERSE SILENCIADO]" +
                                "\n|| APAGAR TV (POWEROFF) - P" +
                                "\n\nESCRIBE ALGUNO DE ESTOS CARACTERES PARA HACER DICHAS ACCIONES" +
                                "\nLA TV ACTUALMENTE ESTA ASÍ\n");
                        display();

                        do {
                            what = in.next().charAt(0);
                            if(what != 'D' && what != 'U' && what != 'M' && what != 'L' && what != 'S' && what != 'P' && what != 'd' && what != 'u' && what != 'm' && what != 'l' && what != 's' && what != 'p'){
                                System.out.println("LO SIENTO NENO, PERO ELIGE ENTRE LAS OPCIONES QUE TE HE DADO");
                            }
                        }while(what != 'D' && what != 'U' && what != 'M' && what != 'L' && what != 'S' && what != 'P' && what != 'd' && what != 'u' && what != 'm' && what != 'l' && what != 's' && what != 'p');

                        if(what == 'U' || what == 'u'){
                            upCanal();
                        }else if(what == 'D' || what == 'd'){
                            downCanal();
                        }else if(what == 'M' || what == 'm'){
                            upVolume();
                        }else if(what == 'L' || what == 'l'){
                            downVolume();
                        }else if(what == 'S' || what == 's'){
                            silenciar();
                        }



                    }while(what != 'P' && what != 'p');
        System.out.println("\nAPAGANDO...");

    }

    //==========================================
    //== MOSTRAR EL ESTADO ACTUAL DEL TELEVISOR
    //==========================================
    public static void display(){
        System.out.println("Canal actual: " + canal +
                "\nVolumen: " + volumen);
    }

    //===================
    //== ZIPEAR PA'RRIBA
    //===================
    public static void upCanal(){
        canal++;
        if(canal > 25){
            canal = 1;
        }
    }

    //===================
    //== ZIPEAR PA' BAJO
    //===================
    public static void downCanal(){
        canal--;
        if(canal < 1){
            canal = 25;
        }
    }

    //=====================
    //== SILENCIAR VOLUMEN
    //=====================
    public static void silenciar(){
        if(volumen != 0){
            remember = volumen;
            volumen = 0;
            ir = true;
        }else if(volumen == 0){
            volumen = remember;
        }
    }

    //=================
    //== SUBIR VOLUMEN
    //=================
    public static void upVolume(){
        if(ir){
            volumen = remember;
            volumen = volumen + 2;
            ir = false;
        }else{
            volumen = volumen + 2;
        }

        if(volumen > 100){
            System.out.println("\n[[[[[[[[[[EL VOLUMEN NO PUEDE SUBIR MÁS]]]]]]]]]\n");
            volumen = 100;
        }
    }

    //=================
    //== BAJAR VOLUMEN
    //=================
    public static void downVolume(){
        if(ir){
            volumen = remember;
            volumen = volumen - 2;
            ir = false;
        }else{
            volumen = volumen - 2;
        }

        if(volumen < 0){
            System.out.println("\n[[[[[[[[[[EL VOLUMEN NO PUEDE BAJAR MÁS]]]]]]]]]\n");
            volumen = 0;
        }
    }

}
