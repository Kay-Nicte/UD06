package UD06;

import javax.swing.JOptionPane;

public class Ejercicio3App {

	public Ejercicio3App() {
		// TODO Auto-generated constructor stub
		
		/*
		 * OBJETIVO: Validar números primos
		 * 
		 * Pedir al usuario un número
		 * Pasar por parámetro en un método
		 * Return true si es primo y false si no lo es
		 * 
		 * Número primo: sólo se puede dividir entre 1 y entre él mismo
		 * 
		 * Ejemplo: 25 no es primo, porque se puede dividir entre 5.
		 * 17 sí lo es. 
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String askNum = JOptionPane.showInputDialog("Introduce un número para saber si es primo: ");
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
