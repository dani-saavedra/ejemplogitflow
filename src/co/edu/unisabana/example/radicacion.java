package co.edu.unisabana.example;

import javax.swing.JOptionPane;

public class radicacion {   

	public static void rad() {
    	System.out.println("Calcular la raíz cuadrada de un número en Java");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Pon el numero para hacer la raiz"));
        
        double resultado = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de " + numero + " es " + resultado);   
	}
}