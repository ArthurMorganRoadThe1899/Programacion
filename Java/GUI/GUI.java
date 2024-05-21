package Programacion.Java.GUI;

import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void main(String[] args) {


        for(int i = 0; i < 26; i++){
            int x = (int) (Math.random()*1920+1);
            int y = (int) (Math.random()*1080+1);
            JFrame frame = new JFrame("HOLA TUTIMUTI, ME SALUDAS??!!??!!?!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(90,300);
            frame.setContentPane(new Image());
            frame.setLocation(x, y);
            frame.setVisible(true);
        }
    }

    public class Image extends GUI{
        public void ElementosGraficos(Graphics g){
            ImageIcon fondo = new ImageIcon("https://images.nightcafe.studio/jobs/d5Y1mDQ8YKCe173wWrGz/d5Y1mDQ8YKCe173wWrGz--1--2tfvm.jpg?tr=w-1600,c-at_max");
            g.drawImage(fondo.getImage(), 300,300, 90, 30,null);
        }

    }

}
