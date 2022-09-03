package co.edu.unisabana.example;
import javax.swing.JOptionPane;


public class Division {
    

        public static double [] doDivision() {

           double numerador = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numerador: "));
           double denominador = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el denominador: "));
            
            double cociente = new Double (numerador)/ new Double (denominador);
            double resto = new Double (numerador) % new Double (denominador);

            
            double [] result = new double[2];

            

            result [0]=cociente;
            result [1]= resto;
            JOptionPane.showMessageDialog(null, "El cociente de su division es: " + result[0] +"\n"+ "El resto de su division es: "+ result[1]);
            return result;
        }
            
        
    }
    

