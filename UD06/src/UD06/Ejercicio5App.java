package UD06;

import javax.swing.JOptionPane;

public class Ejercicio5App {

	public Ejercicio5App() {
		// TODO Auto-generated constructor stub
		
		/*
		 * OBJETIVO: Convertir un n�mero de base decimal a binario
		 * El usuario nos pasar� un n�mero decimal
		 * Crear� un m�todo para pasarle el n�mero por par�metro
		 * Debe retornar un string con el n�mero binario
		 * 
		 * PARA CONVERTIR A BINARIO:
		 * 
		 * Dividir entre 2 el n�mero decimal
		 * El resultado se divide entre 2 de nuevo
		 * hasta que no se pueda dividir m�s
		 * 
		 * El resto que quede de cada divisi�n formar� el binario
		 * de abajo a arriba
		 * 
		 */
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String askNum = JOptionPane.showInputDialog("Introduce un n�mero para saber su equivalente en binario: ");
		 int num = Integer.parseInt(askNum);
	     
		 //Llamada al m�todo y mostrar el usuario el resultado
		JOptionPane.showMessageDialog(null, num+" en binario es: ");

		
	}

}
