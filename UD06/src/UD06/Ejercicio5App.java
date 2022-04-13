package UD06;

import javax.swing.JOptionPane;

public class Ejercicio5App {

	public Ejercicio5App() {
		// TODO Auto-generated constructor stub
		
		/*
		 * OBJETIVO: Convertir un número de base decimal a binario
		 * El usuario nos pasará un número decimal
		 * Crearé un método para pasarle el número por parámetro
		 * Debe retornar un string con el número binario
		 * 
		 * PARA CONVERTIR A BINARIO:
		 * 
		 * Dividir entre 2 el número decimal
		 * El resultado se divide entre 2 de nuevo
		 * hasta que no se pueda dividir más
		 * 
		 * El resto que quede de cada división formará el binario
		 * de abajo a arriba
		 * 
		 */
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String askNum = JOptionPane.showInputDialog("Introduce un número para saber su equivalente en binario: ");
		 int num = Integer.parseInt(askNum);
	     
		 //Llamada al método y mostrar el usuario el resultado
		JOptionPane.showMessageDialog(null, num+" en binario es: ");

		
	}

}
