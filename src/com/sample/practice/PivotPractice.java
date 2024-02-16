package com.sample.practice;

import com.sample.utilities.Printer;
import com.sample.utilities.RandomFiller;

public class PivotPractice {
    public static void main(String[] args) {
        int[] store=new int[20];
        RandomFiller.arrayFiller(store);
        int pivotPosition=(int)Math.floor(Math.random()*20);
        int pivotElement= store[pivotPosition];
        Printer.printArray(store);
        System.out.println(pivotElement+"  PivotPosition:"+pivotPosition);
        store[pivotPosition]=store[store.length-1];
        store[store.length-1]=pivotElement;
        pivotPosition=store.length-1;
        for(int i=0;i!=pivotPosition;i++){
            if(store[i]>pivotElement){
               int temp=store[i];
               store[i]=store[pivotPosition-1];
               store[pivotPosition]=temp;
               store[pivotPosition-1]=pivotElement;
               pivotPosition--;i--;
            }
        }
        Printer.printArray(store);
        System.out.println(pivotPosition);
    }
}
