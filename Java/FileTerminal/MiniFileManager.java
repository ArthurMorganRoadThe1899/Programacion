package Programacion.Java.FileTerminal;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MiniFileManager {
    Path currRelativePath = Paths.get("");
    String currAbsolutePathString = currRelativePath.toAbsolutePath().toString();
    String home = System.getProperty("user.home");


    /*public String PWD(){
    // Mirar de modificar correctamente con el cd
        Path currRelativePath = Paths.get("");
        String currAbsolutePathString = currRelativePath.toAbsolutePath().toString();
        return
    }*/
    public void cd(){

    }
}

// Será útil mirar las expresiones regulares:
// https://www.w3schools.com/java/java_regex.asp