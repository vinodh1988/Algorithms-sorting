package com.sample.searches;

import com.sample.utilities.Printer;
import com.sample.utilities.RandomFiller;

public class BubbleSort {
    public static void main(String[] args) {
        int[] x=new int[100];
        RandomFiller.arrayFiller(x);
        System.out.println("Before Sorting");
        Printer.printArray(x);

        for(int i=0;i<x.length-1;i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    x[i] = x[i] + x[j];
                    x[j] = x[i] - x[j];
                    x[i] = x[i] - x[j];
                }
            }
        }
            System.out.println(" \n After Sorting....");
           Printer.printArray(x);
        }
    }

