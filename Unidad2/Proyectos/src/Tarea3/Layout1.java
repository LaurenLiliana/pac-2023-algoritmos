package Tarea3;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout1 extends JFrame{

    JButton boton1, boton2, boton3, boton4;
    
    public Layout1(){
    setSize(300, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

    boton1 = new JButton("Boton 1");
    boton2 = new JButton("Boton 2");
    boton3 = new JButton("Boton 3");
    boton4 = new JButton("Boton 4");
    
    add(boton1);
    add(boton2);
    add(boton3);
    add(boton4);
    
    setVisible(true);
    }
    
    public static void main(String[] args) {
    new Layout1();       
    }
    
}

