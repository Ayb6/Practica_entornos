package com.entornos.AyyoubAmjahedAbed.arrayTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.entornos.AyyoubAmjahedAbed.array.MisArrays;

class TestMinimo {

	@Test
	void testMinimo() {
		int[] numeros = {1, 2, 3, 4, 5};
	    int minimo = MisArrays.minimo(numeros);
	    assertEquals(1, minimo);
	}

}
