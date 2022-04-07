package UD06;

import javax.swing.JOptionPane;

public class Ejercicio8App {

	public Ejercicio8App() {
		// TODO Auto-generated constructor stub
		
		/*
		 * OBJETIVO: Crear array de 10 posiciones de n�meros pedidos por teclado
		 * Mostrar por consola el �ndice y el valor al que corresponde
		 * Hacer dos m�todos:
		 * 
		 * 1 m�todo: rellenar valores 
		 * 2 m�todo: mostrar valores
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int[] array=new int[10];
		
		array = rellenarArray(array);	
		mostrarArray(array);
	}
	
	public static int[] rellenarArray(int[] array) {
		
		int i = 0;

		//Bucle para rellenar el array de valores introducidos por par�metro
		while (i<10) {
		String askValue = JOptionPane.showInputDialog("Introduce otro valor: ");
		int value = Integer.parseInt(askValue);
		
		//Meter el valor introducido en el array
		array[i] = value;
		i++;	
		}	
		
		return array;
	}
	
	public static void mostrarArray(int[] array) {
				
		//Bucle para mostrar el array
		for (int x=0; x<array.length; x++) {
		System.out.println("Valor "+(x+1)+": "+array[x]);
		}
	}
}