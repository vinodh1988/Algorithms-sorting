package com.sample.searches;

import com.sample.utilities.Printer;
import com.sample.utilities.RandomFiller;
import com.sample.utilities.TwoDPrinter;
import jdk.net.NetworkPermission;

public class RadixSort {


    public static void main(String[] args) {

        int[] x=new int[20];
        RandomFiller.arrayFiller(x);
        System.out.println("Before Sorting");
        Printer.printArray(x);

        radixSort(x);

        System.out.println("After Sorting");
        Printer.printArray(x);
    }

    public static void radixSort(int[] original){
        int[][] buckets=new int[7][];

        for(int i=0;i<buckets.length;i++){
            buckets[i]=new int[0];
        }

        //bucketing
        for(int index=0;index<original.length;index++){
            String temp=new Integer(original[index]).toString();
            buckets[temp.length()-1]=arrayAdder(buckets[temp.length()-1],original[index]);
        }

        TwoDPrinter.twoDArrayPrinter(buckets);
        int finalIndex=0;
        //integrating
        for(int bucket=0; bucket<buckets.length;bucket++){
            for(int current=0;current<buckets[bucket].length;current++){
                original[finalIndex++]=buckets[bucket][current];
            }
        }
    }

    // this adds a new element into the already sorted array
    public static int[] arrayAdder(int[] n,int current){

        int[] result=new int[n.length+1];
        if(result.length==1){
            result[0]=current;
            return result;
        }
        boolean added=false;
        int originalIndex=0;
        for(int i=0;i<result.length;i++){

            if(added || (originalIndex<n.length? n[originalIndex]<current:false)
            )
                result[i] = n[originalIndex++];
            else {
                result[i] = current;
                added = true;
            }

        }
        return result;
    }
}
