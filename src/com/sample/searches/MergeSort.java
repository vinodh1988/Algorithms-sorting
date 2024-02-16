package com.sample.searches;

import com.sample.practice.MergeTwoSorted;
import com.sample.utilities.Printer;
import com.sample.utilities.RandomFiller;

public class MergeSort {
    public static void main(String[] args) {
        int[] x=new int[100];
        RandomFiller.arrayFiller(x);
        System.out.println("Before Sorting");
        Printer.printArray(x);

        int[] result=mergeSort(x);

        System.out.println("After Sorting");
        Printer.printArray(result);
    }

    public static int[] extract(int[] arr,int min,int max){
        int[] temp=new int[max-min+1];
        int k=0;
        for(int i=min;i<=max;i++){
            temp[k++]=arr[i];
        }
        return temp;
    }

    public static int[] mergeSort(int []arr){
        if(arr.length==1)
            return arr;
        int mid= arr.length/2;
        int[] result1=mergeSort(extract(arr,0,mid-1));
        int[] result2=mergeSort(extract(arr,mid,arr.length-1));


        return MergeTwoSorted.mergeTwoSortedArrays(result1,result2);
    }
}
