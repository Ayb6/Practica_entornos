package com.entornos.AyyoubAmjahedAbed.arrayTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.entornos.AyyoubAmjahedAbed.array.MisArrays;

class TestMediana {

	@Test
	void testMediana() {
		int[] numeros1 = {1, 2, 3, 4, 5};
	    double mediana1 = MisArrays.mediana(numeros1);
	    assertEquals(3.0, mediana1);

	    int[] numeros2 = {1, 2, 3, 4, 5, 6};
	    double mediana2 = MisArrays.mediana(numeros2);
	    assertEquals(3.5, mediana2);
	}

}
