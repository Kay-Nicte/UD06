package UD06;

import javax.swing.JOptionPane;

public class Ejercicio3App {

	public Ejercicio3App() {
		// TODO Auto-generated constructor stub
		
		/*
		 * OBJETIVO: Validar n�meros primos
		 * 
		 * Pedir al usuario un n�mero
		 * Pasar por par�metro en un m�todo
		 * Return true si es primo y false si no lo es
		 * 
		 * N�mero primo: s�lo se puede dividir entre 1 y entre �l mismo
		 * 
		 * Ejemplo: 25 no es primo, porque se puede dividir entre 5.
		 * 17 s� lo es. 
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String askNum = JOptionPane.showInputDialog("Introduce un n�mero para saber si es primo: ");
		int num = Integer.parseInt(askNum);
		primeNumberValidator(num, num);


        if(primeNumberValidator(num, num) == 2)
			JOptionPane.showMessageDialog(null, "Es primo.");
        else
			JOptionPane.showMessageDialog(null, "No es primo.");
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
