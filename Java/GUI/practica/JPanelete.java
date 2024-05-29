package Programacion.Java.GUI.practica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JPanelete extends JFrame {

    public JPanelete(){
        setTitle("Formulario chistoso");

        Container conteneor = getContentPane();

        JPanel panel = new JPanel();

        conteneor.add(panel);

        panel.setBackground(Color.LIGHT_GRAY);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(700,600);
        setLocationRelativeTo(null);

        // Nombre
        JLabel name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        add(name);

        JTextField tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        add(tname);

        // Genero
        JLabel gender = new JLabel("Género");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        add(gender);

        JRadioButton male = new JRadioButton("Hombre");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(false);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        add(male);


        JRadioButton female = new JRadioButton("Mujer");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        add(female);

        JRadioButton other = new JRadioButton("Otros");
        other.setFont(new Font("Arial", Font.PLAIN, 15));
        other.setSelected(true);
        other.setSize(90, 20);
        other.setLocation(350, 200);
        add(other);

        ButtonGroup gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
        gengp.add(other);

        JLabel email = new JLabel("Correo electrónico");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setSize(100, 20);
        email.setLocation(100, 200);
        add(email);


        setVisible(true);

    }


    public static void main(String[] args) {
        JPanelete a = new JPanelete();
    }


}
