package com.algo.problems.array;

import java.util.List;

public class ValidateSubSequence {


    public boolean validateSubSequnce(List<Integer> array ,List<Integer> sequence ){

        int arrayIndex =0;
        int sequenceIndex=0;

        while(arrayIndex <= array.size() && sequenceIndex <= sequence.size()){

            if(array.get(arrayIndex) == sequence.get(sequenceIndex)){
                sequenceIndex +=1;
            }
            arrayIndex +=1;
            return  (sequenceIndex ==sequence.size());
        }


        return false;
    }

    public static void main(String[] args) {

    }



}
