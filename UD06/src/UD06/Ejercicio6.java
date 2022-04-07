package UD06;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public Ejercicio6() {
		// TODO Auto-generated constructor stub
		
		/*
		 * OBJETIVO: Aplicaci�n que cuente el n�mero de cifras
		 * de un decimal positivo pedido por teclado.
		 * 
		 * Crear m�todo que realice la acci�n pasando el 
		 * n�mero por par�metro
		 * 
		 * Devolver� el n�mero de cifras
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String askNum = JOptionPane.showInputDialog("Introduce un n�mero entero positivo para saber su n�mero de cifras: ");
		 int num = Integer.parseInt(askNum);
	     
		 //Llamada al m�todo y mostrar el usuario el resultado
		 if(figureCalculator(num) == 1) {
		JOptionPane.showMessageDialog(null, num+" tiene: "+figureCalculator(num)+" cifra.");
		 } else if (figureCalculator(num) > 1) {
		JOptionPane.showMessageDialog(null, num+" tiene: "+figureCalculator(num)+" cifras.");
		 }

	}
	
	public static int figureCalculator(int num) {
		
		//Comprobar que el n�mero que nos dan no sea negativo (admite el 0)
		if(num >= 0) {			
			
		 String numString=num+"";
		    
	     //Retorna el n�mero de cifras que tiene el n�mero introducido por el usuario
	     return numString.length();     
		} else {
			//Lanzo un mensaje al usuario en caso de que no haya introducido un entero positivo.
			JOptionPane.showMessageDialog(null, num+" no es un n�mero entero positivo. Haz el favor.");
		}
		
	    return 0;
	}
}
