package com.entornos.AyyoubAmjahedAbed.array;

/**
 * 
 * Se importan las herramientas para trabajr con arrays
 */
import java.util.Arrays;


public abstract class MisArrays {
    /**
     * 
     * Se crea el metodo media que calcula la media
     * @param numeros
     * @return
     */
    public static double media(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return (double) suma / numeros.length;
    }
    
    /**
     * Se crea el metodo mediana que calcula la mediana
     * @param numeros
     * @return
     */
    
    public static double mediana(int[] numeros) {
        Arrays.sort(numeros);
        int longitud = numeros.length;
        if (longitud % 2 == 0) {
            return (double) (numeros[longitud / 2] + numeros[longitud / 2 - 1]) / 2;
        } else {
            return numeros[longitud / 2];
        }
    }
    
    /**
     * Se crea el metodo maximo que devuelve el valor maximo 
     * @param numeros
     * @return
     */
    public static int maximo(int[] numeros) {
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }
    
    /**
     * Se crea el metodo minimo que devuelve el valor minimo
     * @param numeros
     * @return
     */
    
    public static int minimo(int[] numeros) {
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }
}

