package com.array.questions;

public class DuplicateInArray {
    public static void main(String[] args){
        int[] arr ={1,2,3,2,4,1};
        findDuplicate(arr);
    }
    private static void findDuplicate(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate found: " + arr[i]);
                }
            }
        }
    }
}
