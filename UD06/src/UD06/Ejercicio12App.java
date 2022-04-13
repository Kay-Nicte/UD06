package UD06;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio12App {

	public Ejercicio12App() {
		// TODO Auto-generated constructor stub
		/*
		 * OBJETIVO: Crear un array de n�meros
		 * La extensi�n ser� pasada por teclado
		 * El array contendr� n�meros random entre 1 y 300
		 * S�lo mostrar� los que acaben por el d�gito
		 * que nosotros le digamos por teclado
		 * 
		 * Nota: Habr� que controlar que se introduce un 
		 * n�mero correcto.
		 * 
		 * Nota2: Estos n�meros se deber�n guardar en un
		 * nuevo array.
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pedir por teclado el tama�o del array
		String askArraySize = JOptionPane.showInputDialog("Introduce el tama�o del array: ");
		int arraySize = Integer.parseInt(askArraySize);

		randomArrayGenerator(arraySize);
		
		String askLastNum = JOptionPane.showInputDialog("Introduce el d�gito final: ");
		int num = Integer.parseInt(askLastNum);
		
		lastNumValidator(arraySize, num);
		
	}
	
	public static int[] randomArrayGenerator(int arraySize) {

		//Generar array del tama�o pasado por teclado
		int[] array=new int[arraySize];
		
		
		//Bucle para rellenar el array de valores random
		int i = 0;
		
		while (i<arraySize) {
			
		int random = 0 + (int)(Math.random() * ((300 - 1)+1));
			
		//Meter el valor random en el array
		array[i] = random;
		i++;	
		}
		
		return array;
	}
	
	
		public static void lastNumValidator(int arraySize, int lastNum) {
			
			ArrayList<Integer> coincidencias = new ArrayList<>();
		
		if(arraySize > 0 && arraySize <= 300) {
		int[] array = randomArrayGenerator(arraySize);
		
			for (int x=0; x<array.length; x++) {
	
			int lastNumber = array[x]%10;
		
			if(lastNumber == lastNum) {
			System.out.println("� Coincidencia en posici�n "+(x+1)+": "+array[x]);
			
			coincidencias.add(array[x]);
				
			}
				
		}
			int numElementos = coincidencias.size();
			System.out.println("\nTotal coincidencias: "+numElementos+"\n");

	}else if (arraySize <= 0 || arraySize > 300){
		System.out.println("Tama�o del array incorrecto. Introduce un valor entero entre 1 y 300.");
	}else if(lastNum < 0 || lastNum > 9) {
		System.out.println("Error. Introduce un solo d�gito, entero y positivo.");
	}
}
		
}