package UD06;

import javax.swing.JOptionPane;

public class Ejercicio7App {

	public Ejercicio7App() {
		// TODO Auto-generated constructor stub
		
		/*
		 * OBJETIVO: Convertir euros a dólares, yenes o libras
		 * 
		 * El usuario introducirá la cantidad de euros por teclado
		 * 
		 * El método tendrá de parámetros:
		 * 1) La cantidad de euros
		 * 2) La moneda de conversión (que será una cadena)
		 * 
		 * No retornará ningún valor
		 * 
		 * Mostrará un mensaje indicando el cambio
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pedir al usuario qué cantidad de euros quiere convertir
		String askQuantity = JOptionPane.showInputDialog("Bienvenido al convertidor de monedas. Introduce la cantidad de euros: ");
		int eur = Integer.parseInt(askQuantity);
		
		//Preguntar al usuario a qué moneda lo va a querer convertir
		String askCurrency = JOptionPane.showInputDialog("¿A qué moneda lo quieres convertir? Escribe 'dolar', 'yen' o 'libra'.");
		//Pasar a minúsculas lo que introduzca el usuario, para evitar problemas
		String currency = askCurrency.toLowerCase();
		
		//Llamar al método
		convertirMoneda(eur, currency);

	}
	
	//Método para convertir los euros a la moneda que el usuario haya escogido
	public static void convertirMoneda(int eur, String currency) {
		
		//Declaro el valor del cambio de cada moneda
		double libra = eur*0.86;
		double dolar = eur*1.28611;
		double yen = eur*129.852;
	
		/*Switch que cogerá el valor que el usuario haya introducido como moneda y
		 * le dirá el total del cambio teniendo en cuenta la cantidad de € que haya introducido
		 */
		switch(currency)  {
		case "dolar":
			JOptionPane.showMessageDialog(null, eur+"€ son "+dolar+"$.");
			break;
		case "dólar":
			JOptionPane.showMessageDialog(null, eur+"€ son "+dolar+"$.");
			break;
		case "yen":
			JOptionPane.showMessageDialog(null, eur+"€ son "+yen+" yenes.");
			break;
		case "libra":
			JOptionPane.showMessageDialog(null, eur+"€ son "+libra+" libras.");			
			break;
		default:
			JOptionPane.showMessageDialog(null, currency+" no es un valor válido. Escribe dolar, yen o libra.");
		}
	}
}
