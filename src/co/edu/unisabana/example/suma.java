package co.edu.unisabana.example;

import javax.swing.JOptionPane;
public class suma {
    
    public static float doSuma (float x, float y){
        float result; 
        x= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número"));
        y= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Segundo número"));
        result= x+y;
        JOptionPane.showMessageDialog(null,x+" + "+y+" = "+result);
        return(result);
    }
    
}
