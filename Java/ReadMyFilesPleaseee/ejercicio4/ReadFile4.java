package Programacion.Java.ReadMyFilesPleaseee.ejercicio4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

public class ReadFile4 {

    public static void main(String args[]) throws IOException {
        // Creem instàncies de la classe FILE amb les RUTES RELATIVES de les carpetes que volem crear
        File misCosas = new File("src/Programacion/Java/ReadMyFilesPleaseee/ejercicio4/Documentos/MyThings");
        File Alfabeto = new File("src/Programacion/Java/ReadMyFilesPleaseee/ejercicio4/Documentos/Alacleto");


        //CODI A COMPLETAR: Crear carpeta "Mis cosas"
        boolean resultao1;
        resultao1 = misCosas.mkdir();

        System.out.println("Se creao la carpeta 'Documentos/Mis cosas'?? " + resultao1);

        // Esto lo añado yo como regalito adicional si te da conflicto en tu pc, es para que te diga la razón por la que no pudo crear el directorio ^^
        if (!resultao1) {
            System.out.print("La razón por la que no se ha creado la carpeta ha sido porque ");
            if (misCosas.exists()) {
                System.out.print("\u001B[33mla carpeta ya existe\u001B[0m\n\n");
            } else {
                System.out.print("\u001B[33mla ruta seguramente era falsa\u001B[0m\n\n");
            }
        }

        //CODI A COMPLETAR: Crear carpeta "Alfabeto"
        boolean resultao2;
        resultao2 = Alfabeto.mkdir();
        System.out.println("Sa creao la carpeta 'Documentos/Alfabeto'?? " + resultao2);

        if (!resultao2) {
            System.out.print("La razón por la que no se ha creado la carpeta ha sido porque ");
            if (Alfabeto.exists()) {
                System.out.print("\u001B[33mla carpeta ya existe\u001B[0m");
            } else {
                System.out.print("\u001B[33mla ruta seguramente era falsa\u001B[0m");
            }
        }

        // Anem a moure les carpetes. Primer creem instàncies d'Objectes de la classe FILE amb les rutes origen i destí
        File fotoOrigen = new File("src/Programacion/Java/ReadMyFilesPleaseee/ejercicio4/Documentos/Fotografias");
        File fotoDestino = new File("src/Programacion/Java/ReadMyFilesPleaseee/ejercicio4/Documentos/MyThings/Fotografias");

        //CODI A COMPLETAR: Crea les instàncies Origen i Destí per a Libros
        File libroOrigen = new File("src/Programacion/Java/ReadMyFilesPleaseee/ejercicio4/Documentos/Libros");
        File libroDestino = new File("src/Programacion/Java/ReadMyFilesPleaseee/ejercicio4/Documentos/Alacleto/Libros");


        // Movem la carpeta 'Fotografias' dins de 'Mis cosas', i comprovem que s'ha mogut correctament
        resultao1 = fotoOrigen.renameTo(fotoDestino);
        System.out.println("\n\nSa movio la carepta 'Documentos/Fotografias' a 'Documentos/MyThings/Fotografias'? " + resultao1);

        //CODI A COMPLETAR: Mou la carpeta libros
        resultao2 = libroOrigen.renameTo(libroDestino);
        System.out.println("Sa movio la carepta 'Documentos/Libros' a 'Documentos/Alacleto/Libros'? " + resultao2);


        //CODI A COMPLETAR: Crea dins de la carpeta 'Alfabeto', una carpeta per cada una de les lletres de l'alfabet en majuscules.
        File AlfabetoMayus = new File("src/Programacion/Java/ReadMyFilesPleaseee/ejercicio4/Documentos/Alacleto/MAYUSCULAS/");

        boolean resultao3;
        resultao3 = AlfabetoMayus.mkdir();
        System.out.println("\nSa creao la carpeta 'Documentos/Alfabeto'?? " + resultao3);

        if (!resultao3) {
            System.out.print("La razón por la que no se ha creado la carpeta ha sido porque ");
            if (AlfabetoMayus.exists()) {
                System.out.print("\u001B[33mla carpeta ya existe\u001B[0m\n\n");
            } else {
                System.out.print("\u001B[33mla ruta seguramente era falsa\u001B[0m\n\n");
            }
        }

        for (int i = 65; i < 90; i++) {
            char letraElegida = (char) i;

            try {
                File carpetasMayus = new File(AlfabetoMayus + "/" + letraElegida);
                if (carpetasMayus.createNewFile()) {
                    System.out.println("Carpeta creada: " + carpetasMayus.getName());
                } else {
                    System.out.println("La carepta ya existe");
                }
            } catch (IOException e) {
                System.out.println("Nao");
                e.printStackTrace();
            }
        }



            //CODI A COMPLETAR: Mostra per pantalla el contingut de la carpeta Alfabeto
            System.out.println("\nContenido de la carpeta Anacleto:");

            if (!Alfabeto.exists())
                throw new FileNotFoundException("ERROR - Ruta no vàlida ");

            if(Alfabeto.isFile())
                System.out.println("\nEl nombre de archivo es: " + Alfabeto.getName());

            else if(Alfabeto.isDirectory()) {
                File[] listao=Alfabeto.listFiles();

                for (int i = 0; i < listao.length; i++) {

                    if (listao[i].isFile())
                        System.out.println("[A] "+listao[i].getName());
                    else if (listao[i].isDirectory()) {
                        System.out.println("[D] "+listao[i].getName());
                    }
                }


            }

    }

}
