package Programacion.Java.GUI.traemeMiCheeseBurger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener {

    static double price;
    static double iva = (double) 21 / 100 * price;
    static double totalPricePVP = price + iva;

    public Menu() {
        getContentPane().setLayout(new GridLayout(3, 0, 20, 10));


        setElements();
        iniciarGUI();
    }


    public static void main(String[] args) {
        Menu menu = new Menu();
    }

    public void setElements(){
        JLabel title = new JLabel("Menu de 8€");
        title.setBounds(185,-30,100,100);
        title.setFont(new Font("Times new roman", Font.PLAIN, 19));
        add(title);


        JLabel hamburguesa = new JLabel("Hamburguesa");
        hamburguesa.setBounds(10,52,250,30);
        add(hamburguesa);

        JCheckBox pollo = new JCheckBox("Pollo");
        pollo.setBounds(10,80,150,30);
        pollo.setFont(new Font("Times new roman", Font.PLAIN, 10));
        //checkBox1.addChangeListener(this);
        add(pollo);

        JCheckBox cerdo = new JCheckBox("Cerdo");
        cerdo.setBounds(10,110,150,30);
        cerdo.setFont(new Font("Times new roman", Font.PLAIN, 10));
        //checkBox2.addChangeListener(this);
        add(cerdo);

        JCheckBox ternera = new JCheckBox("Ternera (+1€)");
        ternera.setBounds(10,140,150,30);
        ternera.setFont(new Font("Times new roman", Font.PLAIN, 10));
        //checkBox3.addChangeListener(this);
        add(ternera);

        JCheckBox vegana = new JCheckBox("Vegana (+1€)");
        vegana.setBounds(10,170,150,30);
        vegana.setFont(new Font("Times new roman", Font.PLAIN, 10));
        //checkBox3.addChangeListener(this);
        add(vegana);

        JLabel pan = new JLabel("Pan");
        pan.setBounds(200,52,250,30);
        add(pan);

        JCheckBox normal = new JCheckBox("Normal");
        normal.setBounds(185,80,150,30);
        normal.setFont(new Font("Times new roman", Font.PLAIN, 10));
        //checkBox1.addChangeListener(this);
        add(normal);

        JCheckBox integral = new JCheckBox("Integral");
        integral.setBounds(185,110,150,30);
        integral.setFont(new Font("Times new roman", Font.PLAIN, 10));
        //checkBox2.addChangeListener(this);
        add(integral);

        JCheckBox centeno = new JCheckBox("Centeno");
        centeno.setBounds(185,140,150,30);
        centeno.setFont(new Font("Times new roman", Font.PLAIN, 10));
        //checkBox3.addChangeListener(this);
        add(centeno);

        JLabel patatas = new JLabel("Patatas");
        patatas.setBounds(365,52,250,30);
        add(patatas);

        JCheckBox fritas = new JCheckBox("Fritas");
        fritas.setBounds(360,80,150,30);
        fritas.setFont(new Font("Times new roman", Font.PLAIN, 10));
        //checkBox1.addChangeListener(this);
        add(fritas);

        JCheckBox gajo = new JCheckBox("Gajo");
        gajo.setBounds(360,110,150,30);
        gajo.setFont(new Font("Times new roman", Font.PLAIN, 10));
        //checkBox2.addChangeListener(this);
        add(gajo);

        JCheckBox caseras = new JCheckBox("Caseras (+1€)");
        caseras.setBounds(360,140,150,30);
        caseras.setFont(new Font("Times new roman", Font.PLAIN, 10));
        //checkBox3.addChangeListener(this);
        add(caseras);
    }


    public void iniciarGUI(){
        setTitle("Big Mac");
        setLayout(null);
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