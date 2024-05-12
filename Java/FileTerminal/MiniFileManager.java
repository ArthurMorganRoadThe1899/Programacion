package Programacion.Java.FileTerminal;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MiniFileManager {

    public static String input() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }


    // CD //
    public static File changeDir(File ruta, String[] whereAreYouGoing){
        File rutaBackUp = ruta;
        // Aquí se que podría implementar un String[] más que tenga en cuenta los backslash para con un while o algo así, tirar pa' tras siempre, pero como ruta ya funciona decir ../../../ en la ruta final por ejemplo xD
        if(whereAreYouGoing[1].equals("..") || whereAreYouGoing[1].equals("../") ){
            ruta = ruta.getParentFile();
        }else{
            try{
                ruta = new File(ruta + "/" + whereAreYouGoing[1]);
                if(!ruta.exists()){
                    System.out.println("la ruta que has puesto no existe");
                    ruta = rutaBackUp;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return ruta;
    }


    // CREAR DIRECTORIOS //
    public static void createDirectory(File ruta, String[] directories) throws IOException {
        Path directoryPath = Paths.get(ruta.toURI());
        System.out.println(directoryPath);
        File dir;

        for(int i = 1; i < directories.length; i++) {
            dir = new File(directoryPath + "/" + directories[i]);

            if (!dir.exists()) {
                if (dir.mkdir()) {
                    System.out.println("El directorio " + directories[i] + " ha sido creado");
                } else if (!dir.exists()) {
                    if (dir.mkdirs()) {
                        System.out.println("Los directorios " + directories[i] + " han sido creados");
                    } else {
                        System.out.println("Algo fallo en la creación del o los directorios");
                    }
                }
            }
        }
    }


    // MV [RENAME] //
    public static boolean move(File ruta, String[] whatYouMoving){
        boolean sanMovioOcambiaoDeName = true;

            try {
                Path source = Path.of(ruta + "/" + whatYouMoving[whatYouMoving.length-1]);
                for(int i = 1; i <= whatYouMoving.length-1; i++){
                    Path getWhatYouWantToMove = Path.of(ruta + "/" + whatYouMoving[i]);
                    try {
                        Files.move(getWhatYouWantToMove, source );
                    }catch (Exception e){
                        sanMovioOcambiaoDeName = false;
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                sanMovioOcambiaoDeName = false;
                e.printStackTrace();
            }

        return sanMovioOcambiaoDeName;
    }


    // MÉTODO PARA QUE CUANDO LE PASAS PARÁMETROS AL COMANDO LS, TE DEVUELVA LOS ARCHIVOS QUE TE PASE Y TE LISTE EL CONTENIDO DE LOS ARCHIVOS QUE LE PASE //
    public static void lOut(String[] spaceDatainfo, File ruta, String tipoLs) throws FileNotFoundException {
        //File[] lista = new File[spaceDatainfo.length-1];
        ArrayList<File> lista = new ArrayList<>();

        for(int i = 1; i < spaceDatainfo.length; i++){
            File f = new File(ruta + "/" + spaceDatainfo[i]);
            if(f.exists()){
                lista.add(f);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("\n" + lista.get(i).toString() + ":");
            boolean infoExtra = !Objects.equals(tipoLs, "ls");

            // MOSTRAR DIRECTORIOS Y ARCHIVOS //
            if (lista.get(i).isDirectory()) {
                printList(lista.get(i), infoExtra);
            }

            if (lista.get(i).isFile())
                if (infoExtra)
                    System.out.println("[A] " + lista.get(i).getName() + "\t" + lista.get(i).length() + " bytes\t" + new Date(lista.get(i).lastModified()));
                else
                    System.out.println("[A] " + lista.get(i).getName());

        }
    }
    // Se que no hacía falta hacer esto, pero quería hacerlo porque en la consola de linux puedes pasarle como parámetros otros directorios para que los vaya imprimiento de uno en uno xD //


    // MÉTODO PARA MOSTRAR RUTAS //
    public static void printList(File f, boolean infoExtra) throws FileNotFoundException {

        // LANZAR ERROR EN CASO DE QUE NO EXISTA EL ARCHIVO //
        if (!f.exists())
            throw new FileNotFoundException("ERROR - Ruta no existe ");

            // SI LA RUTA ES UNA CARPETA, ABRA KADABRA ENSEÑA EL CONTENIDO //
        else if(f.isDirectory()) {
            // Array donde guardamos los archivos //
            File[] listao=f.listFiles();

            // Ordenar alfábeticamente el array //
            Arrays.sort(listao);

            // MOSTRAR DIRECTORIOS Y ARCHIVOS //
            for (int i=0; i<listao.length;i++) {
                if (listao[i].isDirectory()) {
                    if(infoExtra)
                        System.out.println("[D] "+listao[i].getName() + "\t" + listao[i].length() + " bytes\t"+ new Date(listao[i].lastModified()));
                    else
                        System.out.println("[D] "+listao[i].getName());

                }
                if (listao[i].isFile())
                    if(infoExtra)
                        System.out.println("[A] "+listao[i].getName() + "\t" + listao[i].length() + " bytes\t"+ new Date(listao[i].lastModified()));
                    else
                        System.out.println("[A] "+listao[i].getName());
            }

        }

    }
}
// Te comento acá Vero, este es tu método que pusiste en un ejemplo, pero me pase un ratito investigando cosas de este y como funciona, obvio es, //
// pero no sabía de los métodos de la clase File xD //
// Agarre y modifique un poco el método, a parte de de cambiar nombres de variables y mensajes, modifique la parte de escupir archivos y ficheros //
// no me gustaba que primero mostrase directorios y después archivos, hice un batiburrillo de mostrar alfábeticamente directorios y ficheros... //
// básicamente como en linux cuando haces ls a secas xD //