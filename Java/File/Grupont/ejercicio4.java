package Programacion.Java.File.Grupont;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;

public class ejercicio4 {

    public static void main(String[] args) throws IOException {
        String month = mesSelector();
        File file = new File("src/Programacion/Java/File/Grupont/"+month+".txt");
        int days = monthNumberDays();
        String weekStartingDay = startingMonthDay();

        // El deleteFIleIfExists se lo robe a Joseph, me gusto qwq
        deleteFileIfExist(String.valueOf(file));

            write(file, month, weekStartingDay, days);

    }


    // DAY SELECTOR //
    public static int monthNumberDays(){
        System.out.println("Cuantos días tiene el mes, elige entre 28 y 30 días");
        int days;

        do {
            days = Integer.parseInt(input());

                if(days < 28 || days > 30){
                    System.out.println("Introduce un número entre 28 y 30");
                }

        }while(days < 28 || days > 30);

        return days;
    }


    // STARTING DAY OF THE MONTH SELECTOR //
    public static String startingMonthDay(){
        System.out.println("¿Por cuál día empieza el mes?\n" +
                "=====================\n" +
                "==== 1. LUNES =======\n" +
                "==== 2. MARTES ======\n" +
                "==== 3. MIÉRCOLES ===\n" +
                "==== 4. JUEVES ======\n" +
                "==== 5. VIERNES =====\n" +
                "==== 6. SÁBADO ======\n" +
                "==== 7. DOMINGO =====\n" +
                "=====================");

        int userInput = Integer.parseInt(input());
        String day = "";
        boolean pass;

        do {
            pass = true;
            switch (userInput) {
                case 1:
                    day = "lunes";
                    break;
                case 2:
                    day = "martes";
                    break;
                case 3:
                    day = "miércoles";
                    break;
                case 4:
                    day = "jueves";
                    break;
                case 5:
                    day = "viernes";
                    break;
                case 6:
                    day = "sábado";
                    break;
                case 7:
                    day = "domingo";
                    break;
                default:
                    pass = false;
                    System.out.println("Introduce un valor dentro del rango");
                    break;

            }
        }while(!pass);
        return day;
    }


    // MONTH SELECTOR //
    public static String mesSelector(){
        System.out.println("Creemos un calendario ¿qué mes quieres que sea?\n" +
                           "==========================\n" +
                           "==== 1. ENERO ============\n" +
                           "==== 2. FEBRERO ==========\n" +
                           "==== 3. MARZO ============\n" +
                           "==== 4. ABRIL ============\n" +
                           "==== 5. MAYO =============\n" +
                           "==== 6. JUNIO ============\n" +
                           "==== 7. JULIO ============\n" +
                           "==== 8. AGOSTO ===========\n" +
                           "==== 9. SEPTIEMBRE =======\n" +
                           "==== 10. OCTUBRE =========\n" +
                           "==== 11. NOVIEMBRE =======\n" +
                           "==== 12. DICIEMBRE =======\n" +
                           "==========================");

        int userInput = Integer.parseInt(input());
        String month = "";
        boolean pass;

        do {
            pass = true;
            switch (userInput) {
                case 1:
                    month = "enero";
                    break;
                case 2:
                    month = "febrero";
                    break;
                case 3:
                    month = "marzo";
                    break;
                case 4:
                    month = "abril";
                    break;
                case 5:
                    month = "mayo";
                    break;
                case 6:
                    month = "junio";
                    break;
                case 7:
                    month = "julio";
                    break;
                case 8:
                    month = "agosto";
                    break;
                case 9:
                    month = "septiembre";
                    break;
                case 10:
                    month = "octubre";
                    break;
                case 11:
                    month = "noviembre";
                    break;
                case 12:
                    month = "diciembre";
                    break;
                default:
                    pass = false;
                    System.out.println("Introduce un valor dentro del rango");
                    break;

            }
        }while(!pass);
        return month;
    }


    // SCANNER, SE USA PORQUE ES VISTOSO //
    public static String input() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }


    // MÉTODO PARA IDENTIFICAR EL DÍA DE LA SEMANA //
    public static String weekDaySelector(int picker){
        String[] weekDays = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        String choosenDay = weekDays[picker];

        return choosenDay;
    }


    // MÉTODO PARA ESCRIBIR EN UN ARCHIVO //
    public static void write(File p, String month, String startingMonthDay, int numberMonthDays){
        int exactDay = 2;
        int dayUpgrader = switch (startingMonthDay) {
            case "lunes" -> 1;
            case "martes" -> 2;
            case "miércoles" -> 3;
            case "jueves" -> 4;
            case "viernes" -> 5;
            case "sábado" -> 6;
            case "domingo" -> 0;
            default -> 0;
        };

        try {
            FileWriter esc = new FileWriter(p,true);
            BufferedWriter bufbuf = new BufferedWriter(esc);
            bufbuf.write(month + "\n\n");
            bufbuf.newLine();
            bufbuf.write(startingMonthDay + " 1\n-----------------------------------------------------\n");

                for(int i = 1; i < numberMonthDays; i++){
                    bufbuf.write(weekDaySelector(dayUpgrader) + " " + exactDay +"\n-----------------------------------------------------");
                    bufbuf.newLine();
                    bufbuf.flush();

                    exactDay++;
                    dayUpgrader++;
                    if(dayUpgrader > 6){
                        dayUpgrader = 0;
                    }
                }

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
        }
    }


    // BORRAR EL ARCHIVO SI EXISTE (srry, esto se lo borre a Joseph, me gusto demasiado :P)//
    public static void deleteFileIfExist(String pathname){
        File file = new File(pathname);
        if (file.length() >0) file.delete();
    }
}

