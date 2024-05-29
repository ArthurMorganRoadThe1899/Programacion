package Programacion.Java.GUI.matematico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {

    public Calculadora(){
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER,3,3);
        setLayout(flow);

        setButtons();
        iniciarGUI();
    }

    // Ejecutar gui //
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
    }


    // Añadir botones y el panel a la interfaz //
    public void setButtons(){
        JTextField panel = new JTextField(16);
        JButton B1 = new JButton("1");
        JButton B2 = new JButton("2");
        JButton B3 = new JButton("3");
        JButton B4 = new JButton("4");
        JButton B5 = new JButton("5");
        JButton B6 = new JButton("6");
        JButton B7 = new JButton("7");
        JButton B8 = new JButton("8");
        JButton B9 = new JButton("9");
        JButton B0 = new JButton("0");
        JButton BEQU = new JButton("=");
        JButton BSUM = new JButton("+");
        JButton BRES = new JButton("-");
        JButton BDIV = new JButton("/");
        JButton BMUL = new JButton("*");
        JButton BDEL = new JButton("C");
        JButton BP = new JButton(".");

        add(panel);
        add(B1);
        add(B2);
        add(B3);
        add(B4);
        add(B5);
        add(B6);
        add(B7);
        add(B8);
        add(B9);
        add(B0);
        add(BEQU);
        add(BSUM);
        add(BRES);
        add(BDIV);
        add(BMUL);
        add(BDEL);
        add(BP);
    }

    // Iniciar la GUI //
    public void iniciarGUI(){
        setTitle("Calculadora 4K");
        setSize(470,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    // Evento para añadir acciones //
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
