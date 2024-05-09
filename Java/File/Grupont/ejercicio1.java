    package Programacion.Java.File.Grupont;
    import java.io.File;
    import java.io.FileWriter;
    import java.util.Objects;
    import java.util.Scanner;
    import java.io.IOException;

    public class ejercicio1 {

        public static void main(String[] args) throws IOException {
            String oracion1 = "";
            String oracion2 = "";
            String absoluteSentence = oracion1 + "\n" + oracion2;

            // Le pregunto al usuario la primera oración
            System.out.println("Dame una oración, no puede estar vacía");
            do {
                oracion1 = input();
                checkIfIsEmpty(oracion1);
            } while (Objects.equals(oracion1, ""));

            // Ahora la segunda
            System.out.println("Otra más");
            do {
                oracion2 = input();
                checkIfIsEmpty(oracion2);
            } while (Objects.equals(oracion2, ""));


            // Preparo la variable en la que escribir data
            File twoSentences = new File("src/Programacion/Java/File/Grupont/twoSentences.txt");

            // Creo el archivo
            createNewFile(twoSentences);

            writeFileTwoSentences(twoSentences, absoluteSentence);


        }


        // SCANNER, SE USA PORQUE ES VISTOSO //
        public static String input() {
            Scanner in = new Scanner(System.in);
            return in.nextLine();
        }


        // MÉTODO PARA COMPROBAR SI UN DATO ESTA VACÍO //
        public static void checkIfIsEmpty(String p) {
            if (Objects.equals(p, "")) {
                System.out.println("Tu oración esta vacía, pon algo por favor");
            }
        }


        // MÉTODO PARA CREAR ARCHIVOS //
        public static void createNewFile(File p) throws IOException {

            try {
                if (p.createNewFile()) {
                    System.out.println("Archivo creado: " + p.getName());
                } else {
                    System.out.println("El archivo ya existe.");
                }
            } catch (IOException e) {
                System.out.println("Ha ocurrido algún error.");
                e.printStackTrace();
            }


        }

        // MÉTODO PARA ESCRIBIR EN UN ARCHIVO //
        public static void writeFileTwoSentences(File p, String f){
            try {
                FileWriter esc = new FileWriter(p, true);
                esc.write(f);
                esc.close();
                System.out.println("Se ha añadido el contenido al archivo.");
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error.");
                e.printStackTrace();
            }
        }
    }

