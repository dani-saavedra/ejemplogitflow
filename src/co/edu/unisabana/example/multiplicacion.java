package co.edu.unisabana.example;

import javax.swing.JOptionPane;

public class multiplicacion{

    public static float mult(){
        float num1, num2;
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Por favor, digite su primer número a multiplicar."));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Por favor, digite su segundo número a multiplicar."));
        float temp = num1 * num2;
        return temp;
    }
}