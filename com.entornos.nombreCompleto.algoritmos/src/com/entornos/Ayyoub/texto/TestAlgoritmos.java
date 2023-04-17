package com.entornos.Ayyoub.texto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.entornos.AyyoubAmjahedAbed.algoritmos.Algoritmos;

class TestAlgoritmos {

	@Test
	void testFibonacci() {
		int resultado1 = Algoritmos.fibonacci(1);
		int resultadoEsperado1 = 1;
		
		int resultado2 = Algoritmos.fibonacci(2);
		int resultadoEsperado2 = 1;
		
		int resultado3 = Algoritmos.fibonacci(3);
		int resultadoEsperado3=2;
		
		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
	}
	@Test
	void testFactorial() {
		int resultado1 = Algoritmos.factorial(1);
		int resultadoEsperado1= 1;
		
		int resultado2 = Algoritmos.factorial(2);
		int resultadoEsperado2= 2;
		
		int resultado3 = Algoritmos.factorial(3);
		int resultadoEsperado3= 6;
		
		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
		
		
	}
}
