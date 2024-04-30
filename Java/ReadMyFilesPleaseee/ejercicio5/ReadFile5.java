package Programacion.Java.ReadMyFilesPleaseee.ejercicio5;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile5 {

    public static void main(String[] args) throws FileNotFoundException {
        // Instanciamos a la clase FILE con las rutas relativas a las carpetas que queremos borrar
        File fotografias = new File("src/Programacion/Java/ReadMyFilesPleaseee/ejercicio5/Documentos/Fotografias");
        File libros = new File("src/Programacion/Java/ReadMyFilesPleaseee/ejercicio5/Documentos/Libros");
        File documentos = new File("src/Programacion/Java/ReadMyFilesPleaseee/ejercicio5/Documentos/");

        boolean resultao = false;

        // Borramos la carpeta 'Fotografias' y to su contenido
        resultao = borrarTo(fotografias);
        if (resultao) {
            System.out.println("La carpeta 'Fotografias' ha sido borrada");
        }

        // Borramos la carpeta 'Libros' y to su contenido
        resultao = borrarTo(libros);
        if (resultao) {
            System.out.println("La carpeta 'Libros' ha sido borrada");
        }

        // Borramos la carpeta 'Documentos' y to su contenido
        resultao = borrarTo(documentos);
        if (resultao) {
            System.out.println("La carpeta 'Documentos' ha sido borrada");
        }

    }


    // MÉTODO BORRAR TO //
    public static boolean borrarTo(File directorioAborrara){
        File[] allContents = directorioAborrara.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        return directorioAborrara.delete();
    }


    // MÉTODO PARA BORRAR INDIVIDUALMENTE ARCHIVOS QUE SE ACOPLARA A UN FOR DE BORRAR TO //
    public static void deleteDirectory(File directorioAborrara){
        File f = new File(String.valueOf(directorioAborrara));
        if (f.delete()) {
            System.out.println("Se ha borrado el archivo: " + f.getName());
        } else {
            System.out.println("Fallo a la hora de borrar el archivo.");
        }
    }
}