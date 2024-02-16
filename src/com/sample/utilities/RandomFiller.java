package com.sample.utilities;

public class RandomFiller {

    public static void arrayFiller(int[] array){
        for(int i=0;i<array.length;i++) {
           array[i] =(int) Math.round(Math.random()*10000);
        }
    }
}
