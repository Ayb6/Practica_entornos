package com.entornos.Ayyoub.texto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.entornos.AyyoubAmjahedAbed.algoritmos.Funciones;

class TestFunciones {

	@Test
	void testPotencia() {
		int resultado1 = Funciones.potencia(1, 0);
		int resultadoEsperado1 = 1;
		
		int resultado2 = Funciones.potencia(2, 3);
		int resultadoEsperado2 = 8;
		
		int resultado3 = Funciones.potencia(3, 3);
		int resultadoEsperado3 = 9;
		
		assertEquals (resultadoEsperado1, resultado1);
		assertEquals (resultadoEsperado2, resultado2);
		assertEquals (resultadoEsperado3, resultado3);
	}
	
}
