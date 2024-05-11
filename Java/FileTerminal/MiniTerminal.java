package Programacion.Java.FileTerminal;

import java.io.File;
import java.io.FileNotFoundException;

public class    MiniTerminal {
    public static void main(String[] args) throws FileNotFoundException {
        String response = "inicializada";
        File ruta = new File("src/");

        String[] datosResponseSpace;
        String[] datosResponseBackslash;

        // BUCLE DE LA TERMINAL //
        do{
            System.out.print("\njoselito@kyogre~$" + ruta + "/ ");
            response = MiniFileManager.input();
            datosResponseSpace = response.split("\s");

            // COMANDOS //
            switch (datosResponseSpace[0]) {
                // MOSTRAR DIRECTORIO ACTUAL //
                case "pwd":
                    System.out.println(ruta + "/");

                    break;
                // MOVER Y RENOMBRAR ARCHIVOS//
                case "mv":
                    File mv1 = new File(datosResponseSpace[1]);
                    File mv2 = new File(datosResponseSpace[2]);
                    break;
                // MOVERSE ENTRE DIRECTORIOS //
                case "cd":
                    break;
                case "mkdir":
                    MiniFileManager.createDirectory(ruta, datosResponseSpace);
                    break;
                // VER CONTENIDO DE LA CARPETA ACTUAL//
                case "ls":
                    if (datosResponseSpace.length > 1){
                        MiniFileManager.lOut(datosResponseSpace, ruta, datosResponseSpace[0]);
                    }else{
                        MiniFileManager.printList(ruta, false);
                    }
                    break;
                // VER CONTENIDO DE LA CARPETA ACTUAL + DATOS AMPLIADOS//
                case "ll":
                    if (datosResponseSpace.length > 1){
                        MiniFileManager.lOut(datosResponseSpace, ruta, datosResponseSpace[0]);
                    }else{
                        MiniFileManager.printList(ruta, true);
                    }
                    break;
                case "exit":
                    break;
                default:
                    System.out.println(response +": command not found");
                    break;
            }


        }while(!response.equals("exit"));

    }
}
