package com.sample.searches;

import com.sample.utilities.Printer;
import com.sample.utilities.RandomFiller;

public class SelectionSort {
    public static void main(String[] args) {
        int[] x=new int[20];
        RandomFiller.arrayFiller(x);
        System.out.println("Before Sorting");
        Printer.printArray(x);

        for(int i=0;i<x.length-1;i++){
              int min=x[i];
              int pos=i;
              for(int j=i+1;j<x.length;j++){
                  if(min>x[j]) {
                      min = x[j];
                      pos=j;
                  }
              }
              if(pos!=i){
                  x[i]=x[i]+x[pos];
                  x[pos]=x[i]-x[pos];
                  x[i]=x[i]-x[pos];
              }
           }
        System.out.println("After Sorting");
        Printer.printArray(x);
    }
}
