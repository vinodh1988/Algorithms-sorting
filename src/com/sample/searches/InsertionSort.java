package com.sample.searches;

import com.sample.utilities.Printer;
import com.sample.utilities.RandomFiller;

public class InsertionSort {
    public static void main(String[] args) {
        int[] x=new int[20];
        RandomFiller.arrayFiller(x);
        System.out.println("Before Sorting");
        Printer.printArray(x);

        for(int i=1;i<x.length;i++){
            int pos=i;
            for(int j=pos-1;j>=0;j--){
                if(x[pos]>=x[j] )
                    break;
                else {
                    x[pos] = x[pos] + x[j];
                    x[j] = x[pos] - x[j];
                    x[pos] = x[pos] - x[j];
                    pos=j;
                 }

        }}
        System.out.println("After Sorting");
        Printer.printArray(x);
    }
}
