package UD06;

import javax.swing.JOptionPane;

public class Ejercicio4App {

	public Ejercicio4App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String askNum = JOptionPane.showInputDialog("Introduce un n�mero para saber su factorial: ");
		 int num = Integer.parseInt(askNum);
	     
		 //Llamada al m�todo y mostrar el usuario el resultado
		JOptionPane.showMessageDialog(null, "El factorial de "+num+" es "+factorialCalculator(num));

	}

	//M�todo para calcular el factorial
	  public static int factorialCalculator(int num){
	        int factorial = 1;
	        int i = 1;
	        
	       /*
	        * Inicializo un contador i a 1
	        * Lo voy incrementando hasta que llegue al valor del n�mero del usuario
	        * Creo la variable factorial para poder ir multiplicando 
	        * Mutiplicar� hasta el n�mero de veces que el usuario hay introducido en num
	        * 
	        * EJEMPLO: El usuario quiere saber el factorial de 5
	        * 5 en este caso ser�a num, porque me lo ha pasado el usuario
	        * Con el bucle while hago la operaci�n (factorial = factorial + i) 5 veces (num veces)
	        * para obtener el factorial
	        */
	        
	        while(i <= num){
	           System.out.println("Factorial: "+factorial+" = Factorial: "+factorial+" * i: "+i+" => " +(factorial=factorial*i)); 
	            i++;
	        }
	        
	        return factorial;
	    }
	  
	
	
}
