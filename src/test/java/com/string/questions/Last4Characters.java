package com.string.questions;

public class Last4Characters {
    public static void main(String[] args){

        String str = "AutomationTesting";

        String last4Chars =  str.substring(str.length()-4);

        System.out.println("Last 4 chars of the String:" +last4Chars);
    }
}
