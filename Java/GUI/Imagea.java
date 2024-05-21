package Programacion.Java.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Imagea extends JPanel {
    public void ElementosGraficos(Graphics g){
        ImageIcon fondo = new ImageIcon("s.png");
        g.drawImage(fondo.getImage(), 300,300, 44, 24,null);
    }

}

// https://images.nightcafe.studio/jobs/d5Y1mDQ8YKCe173wWrGz/d5Y1mDQ8YKCe173wWrGz--1--2tfvm.jpg?tr=w-1600,c-at_max