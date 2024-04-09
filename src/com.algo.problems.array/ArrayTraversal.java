package com.algo.problems.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTraversal {

    public static int[] middle(int[] array) {
        // TODO
        int [] resultArray = new int[array.length-1];
        for(int i = 1; i< array.length -1;i++ ){
            resultArray[i] = array[i];
            System.out.println(resultArray[i] );
        }
        return resultArray;
    }


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4,5,6};
        System.out.println(ArrayTraversal.middle(numbers).toString());

    }
}
