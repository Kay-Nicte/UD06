package UD06;

import javax.swing.JOptionPane;

public class Ejercicio9App {

	public Ejercicio9App() {
		// TODO Auto-generated constructor stub
		
		/*
		 * Crear un array de n�meros
		 * Pedir por par�metro el tama�o del array
		 * Rellenar el array con random entre 0 y 9
		 * Mostrar por pantalla el valor de cada posici�n
		 * Mostrar la suma de todos los valores
		 */
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		array();
	}
	
	public static int[] array() {
			
		String askArraySize = JOptionPane.showInputDialog("Introduce el tama�o del array: ");
		int arraySize = Integer.parseInt(askArraySize);

		int[] array=new int[arraySize];
			
	
		int i = 0;

		//Bucle para rellenar el array de valores random
		while (i<arraySize) {
		
		int random = 0 + (int)(Math.random() * ((9 - 0)+1));
		
		//Meter el valor random en el array
		array[i] = random;
		i++;	
	}	
		
		int suma=0;
		int sumaTotal=0;
		
		//Bucle para mostrar el array
		for (int x=0; x<array.length; x++) {
		
		JOptionPane.showMessageDialog(null, "Valor "+(x+1)+": "+array[x]);
		
		suma = suma + array[x];
		
		}
		JOptionPane.showMessageDialog(null, "Suma total: "+suma);


		
		return array;
	}
}
