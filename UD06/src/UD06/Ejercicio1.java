package UD06;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public Ejercicio1() {
		
		/*
		 * Aplicación para calcular el área
		 * Pedir al usuario si quiere círculo, cuadrado o triángulo
		 * Crear un método por cada figura
		 * Los métodos tienen que retornar un número
		 * Mostrar el resultado por pantalla
		 * 
		 * Círculo: (radio^2)*PI
		 * Triángulo: (base*altura)/2
		 * Cuadrado: (lado*lado)
		 */
	}

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Vamos a calcular el área de un polígono. Escoge el polígono: 1-Círculo, 2-Triángulo, 3-Cuadrado.");
		String askPolygon = JOptionPane.showInputDialog("Escoge un polígono. Escribe '1', '2' ó '3'");

		switch(askPolygon) {
		case "1":
			JOptionPane.showMessageDialog(null, "¡De acuerdo! El área de tu círculo es: "+calculateCircleArea());
			break;
		case "2":
			JOptionPane.showMessageDialog(null, "¡De acuerdo! El área de tu triángulo es: "+calculateTriangleArea());
			break;
		case "3":
			JOptionPane.showMessageDialog(null, "¡De acuerdo! El área de tu triángulo es: "+calculateSquareArea());
			break;
		default:
			JOptionPane.showMessageDialog(null, askPolygon+" no es un número válido. Escribe 1, 2 ó 3.");
		}
	}
	
	public static double calculateCircleArea() {
		
		//Círculo: (radio^2)*PI
	
		final double PI = 3.14159;
		
		String askRadius = JOptionPane.showInputDialog("Introduce el radio: ");
		double radius = Integer.parseInt(askRadius);
		
		double squaredRadius = Math.pow(radius, 2);
		double circleArea = squaredRadius * PI;	
		
		return circleArea;
	}
	
	public static double calculateTriangleArea() {
		
		//Triángulo: (base*altura)/2

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

