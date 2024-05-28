package Programacion.Java.GUI.DatosPersonales;

import javax.swing.*;
import java.awt.*;

public class Form extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario chistoso");
        addCustomProperties(frame);
        //addCustomThings(frame);
    }

    // MÉTODO PARA PONER LAS PROPIEDADES DE LA VENTANA DEL FORMULARIO //
    public static void addCustomProperties(JFrame f){
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(700,600);
        f.setLocation(null);
        f.setVisible(true);
        f.setResizable(false);
    }


    // MÉTODO PARA AÑADIR DATOS LOS CAMPOS DEL FORMULARIO //
    public static void addCustomThings(JPanel f){


    }
}

// Look please https://stackoverflow.com/questions/3180535/how-to-make-an-input-form-in-java-code-not-netbeans-using-jform