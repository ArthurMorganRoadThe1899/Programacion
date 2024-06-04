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
        // Si te me enfadas lo entiendo, mil disculpas vero, lo hice así a lo cutre y ni me moleste
        // en hacerlo de manera más limpia y menos... Barata xD
        // Me imagino que con algún ciclo de for podría ahorrar mucho código innecesario de acá ^^u

        // PONER EL TITULO
        JLabel title = new JLabel("Menu de 8€");
        title.setBounds(185,-30,100,100);
        title.setFont(new Font("Times new roman", Font.PLAIN, 19));
        add(title);


        // CAMPO DE LA CARNE USADA
        JLabel hamburguesa = new JLabel("Hamburguesa");
        ButtonGroup hamburguesaGroup = new ButtonGroup();
        hamburguesa.setBounds(10,52,250,30);
        add(hamburguesa);

        JRadioButton pollo = new JRadioButton("Pollo");
        pollo.setBounds(10,80,150,30);
        pollo.setFont(new Font("Times new roman", Font.PLAIN, 10));
        hamburguesaGroup.add(pollo);
        add(pollo);

        JRadioButton cerdo = new JRadioButton("Cerdo");
        cerdo.setBounds(10,110,150,30);
        cerdo.setFont(new Font("Times new roman", Font.PLAIN, 10));
        hamburguesaGroup.add(cerdo);
        add(cerdo);

        JRadioButton ternera = new JRadioButton("Ternera (+1€)");
        ternera.setBounds(10,140,150,30);
        ternera.setFont(new Font("Times new roman", Font.PLAIN, 10));
        hamburguesaGroup.add(ternera);
        add(ternera);

        JRadioButton vegana = new JRadioButton("Vegana (+1€)");
        vegana.setBounds(10,170,150,30);
        vegana.setFont(new Font("Times new roman", Font.PLAIN, 10));
        hamburguesaGroup.add(vegana);
        add(vegana);


        // CAMPO DEL PAN
        JLabel pan = new JLabel("Pan");
        ButtonGroup panGroup = new ButtonGroup();
        pan.setBounds(200,52,250,30);
        add(pan);

        JRadioButton normal = new JRadioButton("Normal");
        normal.setBounds(185,80,150,30);
        normal.setFont(new Font("Times new roman", Font.PLAIN, 10));
        panGroup.add(normal);
        add(normal);

        JRadioButton integral = new JRadioButton("Integral");
        integral.setBounds(185,110,150,30);
        integral.setFont(new Font("Times new roman", Font.PLAIN, 10));
        panGroup.add(integral);
        add(integral);

        JRadioButton centeno = new JRadioButton("Centeno");
        centeno.setBounds(185,140,150,30);
        centeno.setFont(new Font("Times new roman", Font.PLAIN, 10));
        panGroup.add(centeno);
        add(centeno);


        // CAMPO DE LAS PAPITAS
        JLabel patatas = new JLabel("Patatas");
        ButtonGroup papitasGroup = new ButtonGroup();
        patatas.setBounds(365,52,250,30);
        add(patatas);

        JRadioButton fritas = new JRadioButton("Fritas");
        fritas.setBounds(355,80,150,30);
        fritas.setFont(new Font("Times new roman", Font.PLAIN, 10));
        papitasGroup.add(fritas);
        add(fritas);

        JRadioButton gajo = new JRadioButton("Gajo");
        gajo.setBounds(355,110,150,30);
        gajo.setFont(new Font("Times new roman", Font.PLAIN, 10));
        papitasGroup.add(gajo);
        add(gajo);

        JRadioButton caseras = new JRadioButton("Caseras (+1€)");
        caseras.setBounds(355,140,150,30);
        caseras.setFont(new Font("Times new roman", Font.PLAIN, 10));
        papitasGroup.add(caseras);
        add(caseras);


        // BEBIDAS
        JLabel bebidas = new JLabel("Bebidas");
        ButtonGroup bebidasGroup = new ButtonGroup();
        bebidas.setBounds(200,185,250,30);
        add(bebidas);

        JRadioButton cola = new JRadioButton("Cola");
        cola.setBounds(30,215,150,30);
        cola.setFont(new Font("Times new roman", Font.PLAIN, 13));
        bebidasGroup.add(cola);
        add(cola);

        JRadioButton naranja = new JRadioButton("Naranja");
        naranja.setBounds(90,215,150,30);
        naranja.setFont(new Font("Times new roman", Font.PLAIN, 13));
        bebidasGroup.add(naranja);
        add(naranja);

        JRadioButton limon = new JRadioButton("Limón");
        limon.setBounds(175,215,150,30);
        limon.setFont(new Font("Times new roman", Font.PLAIN, 13));
        bebidasGroup.add(limon);
        add(limon);

        JRadioButton awa = new JRadioButton("Agua");
        awa.setBounds(240,215,150,30);
        awa.setFont(new Font("Times new roman", Font.PLAIN, 13));
        bebidasGroup.add(awa);
        add(awa);

        JRadioButton cerveza = new JRadioButton("Cerveza");
        cerveza.setBounds(300,215,150,30);
        cerveza.setFont(new Font("Times new roman", Font.PLAIN, 13));
        bebidasGroup.add(cerveza);
        add(cerveza);



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