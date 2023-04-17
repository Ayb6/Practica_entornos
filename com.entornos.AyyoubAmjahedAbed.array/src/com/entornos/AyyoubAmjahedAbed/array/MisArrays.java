package com.entornos.AyyoubAmjahedAbed.array;

public abstract class MisArrays {
    
    public static double media(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return (double) suma / numeros.length;
    }
  
}
