package com.sample.practice;

import com.sample.utilities.Printer;

public class MergeTwoSorted {
    public static void main(String[] args) {
        int a[]={43,56,90};
        int b[]={14,89,156};
        int[] result=mergeTwoSortedArrays(a,b);
        Printer.printArray(result);

    }
    public static int[] mergeTwoSortedArrays(int[] arr1,int[] arr2){
        int[] result= new int[arr1.length+arr2.length];
        int count=0;
        int arc1=0,arc2=0;
        int current=0;
        while(count<result.length){
            if(arc1<arr1.length && arc2<arr2.length){
                current=arr1[arc1]<arr2[arc2]?arr1[arc1++]:arr2[arc2++];
            }
            else if(arc1<arr1.length) {
                current=arr1[arc1++];
            }
            else if(arc2<arr2.length){
                current=arr2[arc2++];
            }

            result[count++]=current;
        }


        return result;
    }
}
