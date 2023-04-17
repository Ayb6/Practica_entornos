package com.entornos.AyyoubAmjahedAbed.algoritmos;

public abstract class Algoritmos {
	/**
	 * Calcula el numero fibonacci del parametro recibido
	 * 
	 * @param    Un entero del cual calcularemos su numero de fibonacci.
	 * @return   Un long que representa el numero de fibonacci
	 * 
	 */
	
	public static int fibonacci(int numero) {
		int x = 1, y = 0, z = 0;
		for (int i = 1; i <= numero; i++) {
			System.out.print(y + ", ");
			z = y;
			y = x;
			x = x + z;
		}
		return y;
	}
	
	public static int factorial(int numero) {
		int total = 1;
		for (int a = 1; a <= numero; a++) {
			total = total * a;
		}
		return total;
	}
}
