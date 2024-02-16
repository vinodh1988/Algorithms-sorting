package com.sample.searches;

import com.sample.utilities.Printer;
import com.sample.utilities.RandomFiller;

public class QuickSort {
    public static void main(String[] args) {
        int[] x=new int[100];
        RandomFiller.arrayFiller(x);
        System.out.println("Before Sorting");
        Printer.printArray(x);

        quickSort(x,0,x.length-1);

        System.out.println("After Sorting");
        Printer.printArray(x);
    }

    public static void quickSort(int []store, int low, int high) {
        if(low==high)
            return;

        int pivotPosition=low+(int)Math.floor(Math.random()*(high-low+1));
        int pivotElement= store[pivotPosition];

        store[pivotPosition]=store[high];
        store[high]=pivotElement;
        pivotPosition=high;

        for(int i=low;i!=pivotPosition;i++){
            if(store[i]>pivotElement){
                int temp=store[i];
                store[i]=store[pivotPosition-1];
                store[pivotPosition]=temp;
                store[pivotPosition-1]=pivotElement;
                pivotPosition--;i--;
            }
        }
        if(pivotPosition!=low)
            quickSort(store,low,pivotPosition-1);
        if(pivotPosition!=high)
            quickSort(store,pivotPosition+1,high);
    }
}
