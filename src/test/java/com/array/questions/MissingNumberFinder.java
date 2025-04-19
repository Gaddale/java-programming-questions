package com.array.questions;

public class MissingNumberFinder {
    public static void main(String[] args){

        int[] nunArr = {1,2,3,5,6,7,8,9,10};

        int sum = 0;
        int expectedSum = 0;

        for(int i=0; i<nunArr.length; i++){
            sum = sum+nunArr[i];
        }

        for (int i=1; i<=10; i++){
            expectedSum = expectedSum+i;
        }

        System.out.println("Missing number " + (expectedSum-sum));

    }
}
