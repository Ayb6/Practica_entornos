package com.entornos.AyyoubAmjahedAbed.arrayTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.entornos.AyyoubAmjahedAbed.array.MisArrays;

class TestMedia {

	@Test
	void testMedia() {
		int[] numeros = {1, 2, 3, 4, 5};
	    double media = MisArrays.media(numeros);
	    assertEquals(3.0, media);
	}
		
}
