package UD06;

import javax.swing.JOptionPane;

public class Ejercicio10App {

	public Ejercicio10App() {
		// TODO Auto-generated constructor stub
		
		/*
		 * OBJETIVO: Crear un array de n�meros
		 * 
		 * El tama�o del array ser� pasado por teclado
		 * El array contendr� n�meros aleatorios primos, entre los n�meros deseados
		 * 
		 * Hay que indicar cu�l es el mayor de todos
		 * 
		 * Hacer un m�todo para comprobar que el n�mero aleatorio es primo
		 * 
		 * Se pueden hacer todos los m�todos que sean necesarios
		 * 
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String askArraySize = JOptionPane.showInputDialog("Introduce el tama�o del array: ");
		int arraySize = Integer.parseInt(askArraySize);

		int[] array=new int[arraySize];
				
		String askMin = JOptionPane.showInputDialog("Introduce el rango. M�nimo: ");
		int min = Integer.parseInt(askMin);
		String askMax = JOptionPane.showInputDialog("M�ximo: ");
		int max = Integer.parseInt(askMax);
		
		primeArrayGenerator(min, max, arraySize);
		
	}
	
	
	public static void primeArrayGenerator(int min, int max, int size) {
		
		int[] primos = new int[size];
		
		for (int i = 0; i < primos.length; i++) {
		
		primos[i] = esPrimo(min, max);	
		}
		
		for (int i = 0; i < primos.length; i++) {
		System.out.println("Posici�n "+i+": "+primos[i]);	
		}
	}
	
	public static int esPrimo(int min, int max) {
	
	int controlador = 0;
	int random = 0;
	while(controlador == 0) {
	random = 0 + (int)(Math.random() * ((max - min)+1));
	controlador = primeNumberValidator(random, random);
	}
		
	return random;
	}
	
	public static int primeNumberValidator(int num, int aux) {

	    if (aux > 0) {
	        if(num % aux == 0)
	            return 1+primeNumberValidator(num, aux-1);
	        return primeNumberValidator(num, aux-1);

	    }else {
	        return 0;
	    }
	}
}		