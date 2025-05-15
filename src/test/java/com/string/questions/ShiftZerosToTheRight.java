package com.string.questions;

public class ShiftZerosToTheRight {
    public static void main(String args[]) {
        int number = 10203040;
        int result = 0;
        int multiplier = 1;
        int zerocount =0;
        while(number > 0){
            int digit = number % 10;

            if (digit == 0){
                zerocount++;
            } else{
                result += digit * multiplier;
                multiplier *= 10;
            }

            number /= 10;
        }

        for(int i=0; i<zerocount; i++){
            result *=10;
        }

        System.out.println("After moving zeros to the end:" +result);
    }
}
