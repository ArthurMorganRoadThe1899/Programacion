package Programacion.Java.GUI.ejemplos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JDialogModalE extends JDialog {
    private JTextField textField;
    /**
     * Constructor que pone titulo al dialogo, construye la ventana y
     la hace
     * modal.
     *
     * @param padre
     * Frame que hace de padre de esta dialogo.
     */
    public JDialogModalE(Frame padre) {
// padre y modal
        super(padre, true);
        setTitle("Mete un dato");
        textField = new JTextField(20);
        getContentPane().add(textField);
// Se oculta la ventana al pulsar <enter> sobre el textfield
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                setVisible(false);
            }
        });
    }
    /**
     * Devuelve el texto en el jtextfield
     *
     * @return el texto introducido por el usuario después de que se
    cierre la ventana.
     */
    public String getText() {
        return textField.getText();
    }
    public static void main(String[] args) {
//Nos creamos la ventana padre
        JFrame ventanaPadre = new JFrame();
        ventanaPadre.setTitle("Ejemplo JDialog"); //Título del JFrame
        ventanaPadre.setSize(250,200); //Dimensiones del JFrame
        ventanaPadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Cerrar proceso al cerrar ventana
        ventanaPadre.setVisible(true); //Mostrar JFrame
        JDialogModalE dialogoModal = new
                JDialogModalE((Frame) ventanaPadre);
        dialogoModal.pack(); // para darle tamaño automático a la ventana
        dialogoModal.setVisible(true);
// Al ser modal, la llamada a setVisible(true) se queda bloqueada hasta

// que el dialogo modal se oculte. Por ello, a continuación tenemos

// la seguridad de que el texto ya esta disponible.
        System.out.println("El usuario ha escrito "+dialogoModal.getText());
    }
}

