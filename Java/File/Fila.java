package Programacion.Java.File;
import java.io.File;

public class Fila {
    public static void main(String[] args) {
        File culo = new File("/home/josalbarr/Documentos/Tareas/Programacion/Java/File/a.txt");

        if(culo.exists()){
            System.out.println("tu madre");
        }else{
            System.out.println("no existe");
        }
    }
}
