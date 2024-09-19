import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Crear el marco (ventana)
        JFrame frame = new JFrame("Mi Aplicación Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear un panel y añadirlo al marco
        JPanel panel = new JPanel();
        JLabel label = new JLabel("¡Hola, Swing!");
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
    }
}
