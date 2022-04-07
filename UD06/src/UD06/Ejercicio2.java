package UD06;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public Ejercicio2() {
		// TODO Auto-generated constructor stub
		
		/*
		 * GENERADOR DE NÚMEROS RANDOM
		 * Pedir al usuario cuántos números va a querer
		 * Preguntar entre qué rango tienen que estar comprendidos los números
		 * Mostrar los números por pantalla
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		randomGenerator();

	}
	
	public static int randomGenerator() {
		JOptionPane.showMessageDialog(null, "Bienvenid@ al generador de números aleatorios. Ahora te haré una serie de preguntas:");

		String askQuantity = JOptionPane.showInputDialog("¿Cuántos números quieres generar?");
		int quantity = Integer.parseInt(askQuantity);
		
		String askFirstNum = JOptionPane.showInputDialog("¿En qué rango tienen que estar los números? Entre: ");
		int firstNum = Integer.parseInt(askFirstNum);
		
		String askLastNum = JOptionPane.showInputDialog("Y: ");
		int lastNum = Integer.parseInt(askLastNum);
		
		//Comprobar que se ha introducido un rango correcto
		if(firstNum > lastNum) {
			JOptionPane.showMessageDialog(null, "El primer número tiene que ser menor que el último.");
			return 0;
		} else if (firstNum == lastNum) {
			JOptionPane.showMessageDialog(null, "El primer número no puede ser igual que el último.");
			return 0;
		} 
		
		
		//Generar un int random de firstNum a lastNum
		JOptionPane.showMessageDialog(null, "Valor random entre "+firstNum+" y "+lastNum+ ":");


		//Bucle para generar tantos núumeros como el usuario haya pedido
		for(int i = 0; i < quantity; i++) {
			int random = firstNum + (int)(Math.random() * ((lastNum - firstNum)+1));
					
			JOptionPane.showMessageDialog(null, "Random "+(i+1)+": "+random);
		}
		
		return 0;
	}
	

}
