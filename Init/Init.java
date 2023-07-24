package Init;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Init extends Canvas {

    private static JFrame ventana;
    private static final String NOMBRE = "Project";
    private static final int ANCHO = 1280;
    private static final int ALTO = 720;

    private Init() {
        setPreferredSize(new Dimension(ANCHO, ALTO));

        ventana = new JFrame(NOMBRE);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLayout(new BorderLayout());
        ventana.add(this, BorderLayout.CENTER);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
    public static void main(String[] args) {
        Init juego = new Init();
    }
}    


