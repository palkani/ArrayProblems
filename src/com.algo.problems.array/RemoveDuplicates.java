package com.algo.problems.array;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int tremoveDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {


        int []a = {1,1,2,2,3};
        System.out.println(RemoveDuplicates.tremoveDuplicates(a)+"Arrays :-" + Arrays.toString(a));
    }
}
