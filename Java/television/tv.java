package Programacion.Java.television;
import java.util.Scanner;
public class tv {
    static int canal = 1;
    static int volumen = 50;
    static int remember;

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
                                "\n|| SUBIR VOLUMEN - M" +
                                "\n|| BAJAR VOLUMEN - L" +
                                "\n|| SILENCIAR VOLUMEN VOLUMEN - S [SI YA ESTA SILENCIADO, EL VOLUMEN VOLVERÁ A SU ESTADO PREVIO A HABERSE SILENCIADO]" +
                                "\n|| APAGAR TV - P" +
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



                    }while(what != 'P');
        System.out.println("\nAPAGANDO...");

    }

    public static void display(){
        System.out.println("Canal actual: " + canal +
                "\nVolumen: " + volumen);
    }
    public static void upCanal(){
        canal++;
    }
    public static void downCanal(){
        boolean i = false;
        do{
        canal--;
        i = true;
        }while(canal > 0);

        if (!i){
            System.out.println("NO HAY CANALES MÁS BAJOS QUE 1");
        }
    }

    public static void silenciar(){
        if(volumen != 0){
            remember = volumen;
            volumen = 0;
        }else if(volumen == 0){
            volumen = remember;
        }
    }

    //CORREGIR TEMA DE VOLUMENES Y CANALES
    public static void upVolume(){
        if(volumen >= 98){
            volumen = volumen - 2;
        }else if(volumen < 98){
            volumen = 98;
        }
    }

    public static void downVolume(){
        if(volumen <= 2){
            volumen = volumen - 2;
        }else if(volumen > 0){
            volumen = 0;
        }
    }

}
