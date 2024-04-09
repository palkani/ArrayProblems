package com.algo.problems.array;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */
    public static int sockMerchant(int n, String  path) {
        // Write your code here

        List<String> chunks = new ArrayList<>();

        Pattern pattern = Pattern.compile(".{1,2}");
        Matcher matcher = pattern.matcher(path);
        while (matcher.find()) {
            chunks.add(matcher.group());
        }
        Map<Integer ,Integer> sockMap = new HashMap<>();
        int count =0;
        for(int a =0 ; a < chunks.size() ; a++){

            if(chunks.get(a).equalsIgnoreCase("UU") || chunks.get(a).equalsIgnoreCase("DD" )){
                for(int b= a+1 ; b<chunks.size() ; b++ ){
                    if((chunks.get(a)+chunks.get(b)).equalsIgnoreCase("DDUU")){
                        count ++;
                        break;
                    }

                }
            }

        }
        return count;

    }

    public static void main(String[] args) {

        //List<Integer> test = Arrays.asList(10,10,20,30,50,30,30,20,70,100);

String test ="DUDDDUUDUU";
        System.out.println("total socks"+ Result.sockMerchant(12 ,test));
    }
}
