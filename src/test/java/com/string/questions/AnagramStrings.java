package com.string.questions;

import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {
    public static void main(String[] args) {
        String word1 = "triangle";
        String word2 = "integral";

        if (areAnagrams(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are Anagram Strings.");
        } else {
            System.out.println(word1 + " and " + word2 + " are NOT Anagram Strings.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!map1.containsKey(c)) {
                return false;
            }
            map1.put(c, map1.get(c) - 1);
            if (map1.get(c) == 0) {
                map1.remove(c);
            }
        }

        return map1.isEmpty();
    }
}
