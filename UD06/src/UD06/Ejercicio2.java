package UD06;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public Ejercicio2() {
		// TODO Auto-generated constructor stub
		
		/*
		 * GENERADOR DE N�MEROS RANDOM
		 * Pedir al usuario cu�ntos n�meros va a querer
		 * Preguntar entre qu� rango tienen que estar comprendidos los n�meros
		 * Mostrar los n�meros por pantalla
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		randomGenerator();

	}
	
	public static int randomGenerator() {
		JOptionPane.showMessageDialog(null, "Bienvenid@ al generador de n�meros aleatorios. Ahora te har� una serie de preguntas:");

		String askQuantity = JOptionPane.showInputDialog("�Cu�ntos n�meros quieres generar?");
		int quantity = Integer.parseInt(askQuantity);
		
		String askFirstNum = JOptionPane.showInputDialog("�En qu� rango tienen que estar los n�meros? Entre: ");
		int firstNum = Integer.parseInt(askFirstNum);
		
		String askLastNum = JOptionPane.showInputDialog("Y: ");
		int lastNum = Integer.parseInt(askLastNum);
		
		//Comprobar que se ha introducido un rango correcto
		if(firstNum > lastNum) {
			JOptionPane.showMessageDialog(null, "El primer n�mero tiene que ser menor que el �ltimo.");
			return 0;
		} else if (firstNum == lastNum) {
			JOptionPane.showMessageDialog(null, "El primer n�mero no puede ser igual que el �ltimo.");
			return 0;
		} 
		
		
		//Generar un int random de firstNum a lastNum
		JOptionPane.showMessageDialog(null, "Valor random entre "+firstNum+" y "+lastNum+ ":");


		//Bucle para generar tantos n�umeros como el usuario haya pedido
		for(int i = 0; i < quantity; i++) {
			int random = firstNum + (int)(Math.random() * ((lastNum - firstNum)+1));
					
			JOptionPane.showMessageDialog(null, "Random "+(i+1)+": "+random);
		}
		
		return 0;
	}
	

}
