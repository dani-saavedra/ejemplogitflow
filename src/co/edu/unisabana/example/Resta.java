package co.edu.unisabana.example;

import javax.swing.JOptionPane;

public class Resta{

    public static float rest(){
        
        float n1, n2;
         
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el numero 1"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el numero 2"));

        float tado = n1 - n2;
        return tado;

    }

}