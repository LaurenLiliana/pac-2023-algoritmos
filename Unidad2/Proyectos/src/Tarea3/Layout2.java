package Tarea3;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Layout2 extends JFrame {
    public Layout2(){
        
    setSize(300, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     setLayout(new GridLayout(3 , 3));
    
    JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;
    
    boton1 = new JButton ("Boton 1");
    boton2 = new JButton ("Boton 2");
    boton3 = new JButton ("Boton 3");
    boton4 = new JButton ("Boton 4");
    boton5 = new JButton ("Boton 5");
    boton6 = new JButton ("Boton 6");
    boton7 = new JButton ("Boton 7");
    boton8 = new JButton ("Boton 8");
    boton9 = new JButton ("Boton 9");
    
    add(boton1);
    add(boton2);
    add(boton3);
    add(boton4);
    add(boton5);
    add(boton6);
    add(boton7);
    add(boton8);
    add(boton9);
    
    setVisible(true);
    }
    
    public static void main(String[] args) {
       new Layout2();
    }
    
}
