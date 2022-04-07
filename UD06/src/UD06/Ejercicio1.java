package UD06;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public Ejercicio1() {
		
		/*
		 * Aplicaci�n para calcular el �rea
		 * Pedir al usuario si quiere c�rculo, cuadrado o tri�ngulo
		 * Crear un m�todo por cada figura
		 * Los m�todos tienen que retornar un n�mero
		 * Mostrar el resultado por pantalla
		 * 
		 * C�rculo: (radio^2)*PI
		 * Tri�ngulo: (base*altura)/2
		 * Cuadrado: (lado*lado)
		 */
	}

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Vamos a calcular el �rea de un pol�gono. Escoge el pol�gono: 1-C�rculo, 2-Tri�ngulo, 3-Cuadrado.");
		String askPolygon = JOptionPane.showInputDialog("Escoge un pol�gono. Escribe '1', '2' � '3'");

		switch(askPolygon) {
		case "1":
			JOptionPane.showMessageDialog(null, "�De acuerdo! El �rea de tu c�rculo es: "+calculateCircleArea());
			break;
		case "2":
			JOptionPane.showMessageDialog(null, "�De acuerdo! El �rea de tu tri�ngulo es: "+calculateTriangleArea());
			break;
		case "3":
			JOptionPane.showMessageDialog(null, "�De acuerdo! El �rea de tu tri�ngulo es: "+calculateSquareArea());
			break;
		default:
			JOptionPane.showMessageDialog(null, askPolygon+" no es un n�mero v�lido. Escribe 1, 2 � 3.");
		}
	}
	
	public static double calculateCircleArea() {
		
		//C�rculo: (radio^2)*PI
	
		final double PI = 3.14159;
		
		String askRadius = JOptionPane.showInputDialog("Introduce el radio: ");
		double radius = Integer.parseInt(askRadius);
		
		double squaredRadius = Math.pow(radius, 2);
		double circleArea = squaredRadius * PI;	
		
		return circleArea;
	}
	
	public static double calculateTriangleArea() {
		
		//Tri�ngulo: (base*altura)/2

		String askBase = JOptionPane.showInputDialog("Introduce la base: ");
		String askHeight = JOptionPane.showInputDialog("Introduce la altura: ");

		double base = Integer.parseInt(askBase);
		double height = Integer.parseInt(askHeight);

		double triangleArea = ((base*height)/2);	
		
		return triangleArea;
	}

	public static double calculateSquareArea() {
	
	//Cuadrado: (lado*lado)

	String askFirstSide = JOptionPane.showInputDialog("Introduce un lado: ");
	double firstSide = Integer.parseInt(askFirstSide);

	String askSecondSide = JOptionPane.showInputDialog("Introduce el otro lado: ");
	double secondSide = Integer.parseInt(askSecondSide);

	double squareArea = firstSide * secondSide;	

	return squareArea;
	}
}

