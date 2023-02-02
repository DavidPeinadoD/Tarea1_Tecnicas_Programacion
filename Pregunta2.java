// ¿Qué algoritmos crees que usan por tus juegos y aplicaciones favoritas?

//codigo de java para el algoritmo de ordenamiento de burbuja en forma recursiva con programacion orientada a objetos
package com.thealgorithms.sorts;

public class BubbleSort {
    public int[] sort(int[] unsorted) {
        int[] sorted = new int[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            sorted[i] = unsorted[i];
        }
        return sort(sorted, sorted.length);
    }

    private int[] sort(int[] unsorted, int n) {
        if (n == 1) {
            return unsorted;
        }
        for (int i = 0; i < n - 1; i++) {
            if (unsorted[i] > unsorted[i + 1]) {
                int temp = unsorted[i];
                unsorted[i] = unsorted[i + 1];
                unsorted[i + 1] = temp;
            }
        }
        return sort(unsorted, n - 1);
    }
}

