package Programacion.Java.GUI.traemeMiCheeseBurger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener {

    static double price;
    static double iva = (double) 21 / 100 * price;
    static double totalPricePVP = price + iva;

    public Menu() {
        setLayout(new GridLayout(3, 0));

        setElements();
        iniciarGUI();
    }


    public static void main(String[] args) {
        Menu menu = new Menu();
    }

    public void setElements(){
        JLabel title = new JLabel("Menu de 8€");
        add(title);

        JPanel izquierda = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel derecha = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel centro = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel Hamburguesa = new JLabel("Hamburguesa");
        centro.add(Hamburguesa);
    }


    public void iniciarGUI(){
        setTitle("Big Mac");
        setSize(450,520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

// Jugar con gridlayout:
// https://stackoverflow.com/questions/72178648/how-can-i-arrange-elements-in-a-javax-swing-gui