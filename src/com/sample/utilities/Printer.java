package com.sample.utilities;

public class Printer {
    public static void printArray(int[] array) {
        System.out.println("----------------         -------------------         -------------------");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" --> ");
        }
        System.out.println();
    }
}
