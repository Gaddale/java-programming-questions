package com.array.questions;

public class FilterArray {

    public static void main(String[] args){
        String[] input = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        String[] output = new String[input.length];

        for (int i=0; i<input.length; i++){
            output[i]=input[i].substring(0,3);
        }

        for (String day:output){
            System.out.println(day);
        }
    }
}
