package com.entornos.AyyoubAmjahedAbed.algoritmos;

public abstract class Funciones {
	public static int potencia (int base, int exponente) {
		int pow = 1;
		
		for(int i=0; i < exponente; i++) {
			pow = pow * base;
		}
		return pow;
	}
}
