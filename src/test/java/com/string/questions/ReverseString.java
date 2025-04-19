package com.string.questions;

public class ReverseString {
    public static void main(String[] args) {
        String originalStr = "Hello";
        String reversedStr = "";
        System.out.println("Original string: " + originalStr);

//        for (int i = 0; i < originalStr.length(); i++) {
//            reversedStr = originalStr.charAt(i) + reversedStr;
//        }

        for(int i = originalStr.length()-1; i>=0; i--){
            reversedStr = reversedStr + String.valueOf(originalStr.charAt(i));
        }

        System.out.println("Reversed string: "+ reversedStr);
    }
}
