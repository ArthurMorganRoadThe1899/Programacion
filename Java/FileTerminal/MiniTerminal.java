package Programacion.Java.FileTerminal;

public class    MiniTerminal {
    public static void main(String[] args) {
        String response = "a";

        do{
            response = MiniFileManager.input();



        }while(!response.equals ("exit"));

    }
}
