package Programacion.Java.GUI.matematico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Calculadora extends JFrame implements ActionListener {

    static JTextField panel = new JTextField(16);

    static ArrayList<String> panelContent = new ArrayList<String>();


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

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        B6.addActionListener(this);
        B7.addActionListener(this);
        B8.addActionListener(this);
        B9.addActionListener(this);
        B0.addActionListener(this);
        BEQU.addActionListener(this);
        BSUM.addActionListener(this);
        BRES.addActionListener(this);
        BDIV.addActionListener(this);
        BMUL.addActionListener(this);
        BDEL.addActionListener(this);

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
    }

    // Iniciar la GUI //
    public void iniciarGUI(){
        setTitle("Calculadora 4K ");
        setSize(200,205);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    // Evento para añadir acciones //
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        String contentParser = "";
        int resultado = 0;

            switch (action) {
                default:
                    panelContent.add(action);
                    contentParser = operacionInterna();
                    panel.setText(contentParser);

                    break;
                case "=":
                    contentParser = operacionInterna();
                    try {
                        resultado = SacarResultado(contentParser, resultado);
                    } catch (InterruptedException ex){}
                    break;
                case "C":
                    panelContent.removeAll(panelContent);
                    panel.setText("");
                    break;

        }

    }

    // Operacion interna //
    public String operacionInterna(){
        String e = "";
        for(int i = 0; i < panelContent.size(); i++){
            e = e+panelContent.get(i);
        }
        return e;
    }

    // Sacar resultado //
    public static int SacarResultado(String operacionString, int resultado) throws InterruptedException {
        String[] numeros = operacionString.split("[+\\-*/]");
        String[] simbolosValue = operacionString.split("\\d+");

        resultado = 0;

        try {
            // Envuelvo esto en un if-else para tener en cuenta el caso el que el usuario solo inserte numeros simples
            if (numeros.length > 1) {
                // Hago un switch inicial con el que evaluare la primera operación
                switch (simbolosValue[1]) {
                    case "+":
                        resultado = resultado + Integer.parseInt(numeros[0]) + Integer.parseInt(numeros[1]);
                        break;
                    case "-":
                        resultado = resultado + Integer.parseInt(numeros[0]) - Integer.parseInt(numeros[1]);
                        break;
                    case "*":
                        resultado = resultado + Integer.parseInt(numeros[0]) * Integer.parseInt(numeros[1]);
                        break;
                    case "/":
                        resultado = resultado + Integer.parseInt(numeros[0]) / Integer.parseInt(numeros[1]);
                        break;
                }
                // Y luego iré haciendo el bucle el resto de operaciones consecuentes
                for (int i = 2; i < simbolosValue.length; i++) {
                    switch (simbolosValue[i]) {
                        case "+":
                            resultado = resultado + Integer.parseInt(numeros[i]);
                            break;
                        case "-":
                            resultado = resultado - Integer.parseInt(numeros[i]);
                            break;
                        case "*":
                            resultado = resultado * Integer.parseInt(numeros[i]);
                            break;
                        case "/":
                            resultado = resultado / Integer.parseInt(numeros[i]);
                            break;
                    }
                }
                panel.setText(String.valueOf(resultado));
            } else {
                resultado = Integer.parseInt(numeros[0]);
            }
        }catch (ArithmeticException e){
            // ! ARREGLAR, CUANDO INTENTO DIVIDIR DE 0 NO MUESTRA NINGÚN MENSAJE PERO EL THREAD SLEEP SE ACTIVA IGUALMENTE
            panel.setText("CAN'T DIVIDE BETWEEN 0!");
            //Thread.sleep(1000);
            panel.setText(operacionString);
        }
        return resultado;
    }
}
