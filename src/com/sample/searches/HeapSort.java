package com.sample.searches;

import com.sample.heap.MaxHeap;
import com.sample.utilities.Printer;
import com.sample.utilities.RandomFiller;

public class HeapSort {
    public static void main(String[] args) {
        int[] store=new int[20];
        RandomFiller.arrayFiller(store);

        System.out.println("Before Heap Creation");
        Printer.printArray(store);
        MaxHeap heap=new MaxHeap(20);

        for(int x:store){
            heap.insert(x);
        }

        System.out.println("Heapified Array");

        Printer.printArray(heap.currentHeap());

        System.out.println("REMOVING");
        for(int i=store.length-1;i>=0;i--){
            store[i]=heap.delete();
            //Printer.printArray(heap.currentHeap());

        }
        System.out.println("END OF THE REMOVAL");

        System.out.println("Sorted Array");
        Printer.printArray(store);


    }
}
