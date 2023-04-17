package com.entornos.AyyoubAmjahedAbed.arrayTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.entornos.AyyoubAmjahedAbed.array.MisArrays;

class TestMaximo {

	@Test
	void testMaximo() {
		int[] numeros = {1, 2, 3, 4, 5};
	    int maximo = MisArrays.maximo(numeros);
	    assertEquals(5, maximo);
	}

}
