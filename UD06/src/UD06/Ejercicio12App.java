package UD06;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio12App {

	public Ejercicio12App() {
		// TODO Auto-generated constructor stub
		/*
		 * OBJETIVO: Crear un array de números
		 * La extensión será pasada por teclado
		 * El array contendrá números random entre 1 y 300
		 * Sólo mostrará los que acaben por el dígito
		 * que nosotros le digamos por teclado
		 * 
		 * Nota: Habrá que controlar que se introduce un 
		 * número correcto.
		 * 
		 * Nota2: Estos números se deberán guardar en un
		 * nuevo array.
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pedir por teclado el tamaño del array
		String askArraySize = JOptionPane.showInputDialog("Introduce el tamaño del array: ");
		int arraySize = Integer.parseInt(askArraySize);

		randomArrayGenerator(arraySize);
		
		String askLastNum = JOptionPane.showInputDialog("Introduce el dígito final: ");
		int num = Integer.parseInt(askLastNum);
		
		lastNumValidator(arraySize, num);
		
	}
	
	public static int[] randomArrayGenerator(int arraySize) {

		//Generar array del tamaño pasado por teclado
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
			System.out.println("· Coincidencia en posición "+(x+1)+": "+array[x]);
			
			coincidencias.add(array[x]);
				
			}
				
		}
			int numElementos = coincidencias.size();
			System.out.println("\nTotal coincidencias: "+numElementos+"\n");

	}else if (arraySize <= 0 || arraySize > 300){
		System.out.println("Tamaño del array incorrecto. Introduce un valor entero entre 1 y 300.");
	}else if(lastNum < 0 || lastNum > 9) {
		System.out.println("Error. Introduce un solo dígito, entero y positivo.");
	}
}
		
}