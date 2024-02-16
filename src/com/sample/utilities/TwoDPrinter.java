package com.sample.utilities;

public class TwoDPrinter {

    public static void twoDArrayPrinter(int[][] x){
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}
