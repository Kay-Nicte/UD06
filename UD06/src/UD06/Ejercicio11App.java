package UD06;

import javax.swing.JOptionPane;

public class Ejercicio11App {

	public Ejercicio11App() {
		// TODO Auto-generated constructor stub
		
		/*
		 * Pedir por teclado un tama�o
		 * Generar 2 arrays de ese tama�o
		 * Rellenar el primer array de n�meros random
		 * El segundo array apuntar� al anterior
		 * Reasignar los valores del segundo array con n�meros random
		 * 
		 * Crear un m�todo que contenga como par�metros	los dos arrays
		 * Este m�todo devolver� uno nuevo, con la multiplicaci�n de
		 * array1[i] * array2[i].
		 * 
		 * Por �ltimo, mostrar el contenido de cada array.
		 * 
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pedir por teclado el tama�o del array
		String askArraySize = JOptionPane.showInputDialog("Introduce el tama�o del array: ");
		int arraySize = Integer.parseInt(askArraySize);

		//Generar dos arrays del tama�o pasado por teclado
		int[] array1=new int[arraySize];
		int[] array2=new int[arraySize];
		
		//El segundo array apunta al primero
		array2 = array1;

	
		int i = 0;
	
		//Bucle para rellenar array1 de valores random
		while (i<arraySize) {
	
		int random = 0 + (int)(Math.random() * ((9 - 0)+1));
	
		//Meter el valor random en array1
		array1[i] = random;
		i++;	
		}	
	

		//Bucle para mostrar los dos arrays
		for (int x=0; x<array1.length; x++) {
	
		System.out.println("Array 1. Valor "+(x+1)+": "+array1[x]);
		System.out.println("Array 2. Valor "+(x+1)+": "+array2[x]+"\n");

		//Como array2 apuntaba a array1, en este momento valen lo mismo
		}
		
		/*Reasignar los valores del segundo array con n�meros random
		Bucle para rellenar array2 de valores random*/
		
		int j = 0;
		while (j<arraySize) {
			
		int random = 0 + (int)(Math.random() * ((9 - 0)+1));
			
		//Meter el valor random en array2
		array2[j] = random;
		j++;	
		}	
		
		//Bucle para mostrar de nuevo los dos arrays
		for (int z=0; z<array2.length; z++) {
			
		System.out.println("Array 1. Nuevo valor "+(z+1)+": "+array1[z]);
		System.out.println("Array 2. Nuevo valor "+(z+1)+": "+array2[z]+"\n");
		//Y, como vemos, los valores de ambos arrays siguen siendo iguales entre s� 
		}
		
		//Llamar al m�todo y pasarle por par�metro array1 y array2
		multiplicarArrays(array1, array2);
	
	}
	
	public static int[] multiplicarArrays(int[]array1, int[]array2) {
		
		int[] array3 = new int[array1.length];

		for(int y=0; y<array1.length;y++) {
			
					
		array3[y] = array1[y]*array2[y];
	
		System.out.println("Array3["+(y+1)+"]: "+array3[y]);
				
		}
		
		return array3;
	}
}
