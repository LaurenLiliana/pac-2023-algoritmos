package Tarea3;

import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Layout3 extends JFrame{
    public Layout3(){
    setSize(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        setLayout(new BorderLayout());
    
    JButton boton1, boton2, boton3, boton4, boton5;
    JPanel panel; 
    
    panel = new JPanel();
    boton1 = new JButton ("Centro");
    boton2 = new JButton ("Superior");
    boton3 = new JButton ("Derecha");
    boton4 = new JButton ("Izquierda");
    boton5 = new JButton ("Inferior");
    
    add(panel, BorderLayout.CENTER);
    add(boton2, BorderLayout.NORTH);
    add(boton3, BorderLayout.EAST);
    add(boton4, BorderLayout.WEST);
    add(boton5, BorderLayout.SOUTH);

    
    setVisible(true);
    }
    
    public static void main(String[] args) {
       new Layout3();
    }
}
    

