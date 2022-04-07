package UD06;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public Ejercicio6() {
		// TODO Auto-generated constructor stub
		
		/*
		 * OBJETIVO: Aplicación que cuente el número de cifras
		 * de un decimal positivo pedido por teclado.
		 * 
		 * Crear método que realice la acción pasando el 
		 * número por parámetro
		 * 
		 * Devolverá el número de cifras
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String askNum = JOptionPane.showInputDialog("Introduce un número entero positivo para saber su número de cifras: ");
		 int num = Integer.parseInt(askNum);
	     
		 //Llamada al método y mostrar el usuario el resultado
		 if(figureCalculator(num) == 1) {
		JOptionPane.showMessageDialog(null, num+" tiene: "+figureCalculator(num)+" cifra.");
		 } else if (figureCalculator(num) > 1) {
		JOptionPane.showMessageDialog(null, num+" tiene: "+figureCalculator(num)+" cifras.");
		 }

	}
	
	public static int figureCalculator(int num) {
		
		//Comprobar que el número que nos dan no sea negativo (admite el 0)
		if(num >= 0) {			
			
		 String numString=num+"";
		    
	     //Retorna el número de cifras que tiene el número introducido por el usuario
	     return numString.length();     
		} else {
			//Lanzo un mensaje al usuario en caso de que no haya introducido un entero positivo.
			JOptionPane.showMessageDialog(null, num+" no es un número entero positivo. Haz el favor.");
		}
		
	    return 0;
	}
}
