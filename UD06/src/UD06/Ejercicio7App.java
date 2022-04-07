package UD06;

import javax.swing.JOptionPane;

public class Ejercicio7App {

	public Ejercicio7App() {
		// TODO Auto-generated constructor stub
		
		/*
		 * OBJETIVO: Convertir euros a d�lares, yenes o libras
		 * 
		 * El usuario introducir� la cantidad de euros por teclado
		 * 
		 * El m�todo tendr� de par�metros:
		 * 1) La cantidad de euros
		 * 2) La moneda de conversi�n (que ser� una cadena)
		 * 
		 * No retornar� ning�n valor
		 * 
		 * Mostrar� un mensaje indicando el cambio
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pedir al usuario qu� cantidad de euros quiere convertir
		String askQuantity = JOptionPane.showInputDialog("Bienvenido al convertidor de monedas. Introduce la cantidad de euros: ");
		int eur = Integer.parseInt(askQuantity);
		
		//Preguntar al usuario a qu� moneda lo va a querer convertir
		String askCurrency = JOptionPane.showInputDialog("�A qu� moneda lo quieres convertir? Escribe 'dolar', 'yen' o 'libra'.");
		//Pasar a min�sculas lo que introduzca el usuario, para evitar problemas
		String currency = askCurrency.toLowerCase();
		
		//Llamar al m�todo
		convertirMoneda(eur, currency);

	}
	
	//M�todo para convertir los euros a la moneda que el usuario haya escogido
	public static void convertirMoneda(int eur, String currency) {
		
		//Declaro el valor del cambio de cada moneda
		double libra = eur*0.86;
		double dolar = eur*1.28611;
		double yen = eur*129.852;
	
		/*Switch que coger� el valor que el usuario haya introducido como moneda y
		 * le dir� el total del cambio teniendo en cuenta la cantidad de � que haya introducido
		 */
		switch(currency)  {
		case "dolar":
			JOptionPane.showMessageDialog(null, eur+"� son "+dolar+"$.");
			break;
		case "d�lar":
			JOptionPane.showMessageDialog(null, eur+"� son "+dolar+"$.");
			break;
		case "yen":
			JOptionPane.showMessageDialog(null, eur+"� son "+yen+" yenes.");
			break;
		case "libra":
			JOptionPane.showMessageDialog(null, eur+"� son "+libra+" libras.");			
			break;
		default:
			JOptionPane.showMessageDialog(null, currency+" no es un valor v�lido. Escribe dolar, yen o libra.");
		}
	}
}
