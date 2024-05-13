package Programacion.Java.FileTerminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class MiniTerminal {
    public static void main(String[] args) throws IOException {
        String response = "inicializada";
        File ruta = new File(System.getProperty("user.dir"));

        String[] datosResponseSpace;
        // String[] datosResponseBackslash;

        // BUCLE DE LA TERMINAL //
        do{
            System.out.print("\njoselito@kyogre~$" + ruta + "/ ");
            response = MiniFileManager.input();
            datosResponseSpace = response.split("\s");

            // COMANDOS //
            switch (datosResponseSpace[0]) {
                // MOSTRAR DIRECTORIO ACTUAL //
                case "pwd":
                    System.out.println(ruta.getAbsolutePath() + "/");
                    break;
                // MOVER Y RENOMBRAR ARCHIVOS//
                case "mv":
                    MiniFileManager.move(ruta, datosResponseSpace);
                    break;
                // MOVERSE ENTRE DIRECTORIOS //
                case "cd":
                    if(datosResponseSpace.length == 2){
                        ruta = MiniFileManager.changeDir(ruta, datosResponseSpace);
                    }else if(datosResponseSpace.length > 2){
                    System.out.println("Demasiados argumentos");
                    }else{
                        ruta = new File(System.getProperty("user.dir"));
                    }
                    break;
                // CREACIÓN DE DIRECTORIOS // --> Has de cerrar el programa para que los directorios se creen, srry ;P
                case "mkdir":
                    if(datosResponseSpace.length > 1){
                        MiniFileManager.createDirectory(ruta, datosResponseSpace);
                    }else {
                        System.out.println("No has pasado como parámetro de que directorio/s quieres crear");
                    }
                    break;
                // VER CONTENIDO DE LA CARPETA ACTUAL //
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
                // LIMPIAR TERMINAL //
                case "clear":
                    // Estuve mirando de implementarlo, pero la consola de intellj no es una terminal real, los métodos que implemente no funcionaban
                    // Así que use esta cutrada XD
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    break;
                // SALIR DEL BUCLE DE TERMINAL //
                case "exit":
                    break;
                case "help":
                    System.out.println(MiniFileManager.help());
                    break;
                default:
                    System.out.println(response +": comando no encontrado");
                    break;
            }


        }while(!response.equals("exit"));

    }
}
