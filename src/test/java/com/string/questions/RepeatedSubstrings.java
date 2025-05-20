package com.string.questions;

import java.util.*;

public class RepeatedSubstrings {
    public static void main(String[] args) {
        String str = "abcabcabc";
        int subLength = 3;  // length of substrings to check
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i <= str.length() - subLength; i++) {
            String sub = str.substring(i, i + subLength);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }

        System.out.println("Repeated substrings:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
            }
        }
    }
}
