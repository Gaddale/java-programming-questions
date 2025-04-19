package com.array.questions;

public class LargestSmallestElementInArray {

    public static void main(String[] args){

        int[] arr = {12,1,33,234,11,2};

        int largest = arr[0];
        int smallest = arr[0];

        for(int i=0; i < arr.length; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }else {
                if (arr[i]<smallest){
                    smallest=arr[i];
                }
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("smallest: " + smallest);
    }
}
