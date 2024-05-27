package Programacion.Java.GUI.SillyThing;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    // Nombre de la ventana
    JFrame frame = new JFrame("HOLA TUTIMUTI, ME SALUDAS??!!??!!?!");
    ImageIcon image;
    JLabel campoImagen;

    public GUI(){

            // Variables del posicionamiento random y de imagen
            int x = (int) (Math.random()*1920+1);
            int y = (int) (Math.random()*1080+1);
            image = new ImageIcon(getClass().getResource("s.png"));
            campoImagen = new JLabel(image);

            // Especificaciones
            frame.add(campoImagen);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(190,300);
            //frame.setContentPane(new Imagea());
            frame.setLocation(x, y);
            frame.setVisible(true);

    }

    public static void main(String[] args) {
        for(int i = 0; i < 56; i++) {
            GUI g = new GUI();
        }

    }

    /*public class Image extends JPanel {
        public void ElementosGraficos(Graphics g){
            ImageIcon fondo = new ImageIcon("https://images.nightcafe.studio/jobs/d5Y1mDQ8YKCe173wWrGz/d5Y1mDQ8YKCe173wWrGz--1--2tfvm.jpg?tr=w-1600,c-at_max");
            g.drawImage(fondo.getImage(), 300,300, 90, 30,null);
        }

    }*/
}