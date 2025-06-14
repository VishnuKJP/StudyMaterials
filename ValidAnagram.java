package com.example.blind75code;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        boolean result = isAnagram(s, t);
        System.out.println("Are the strings anagrams? " + result);
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] countChar = new int[26];
        for(int i=0; i< s.length();i++){
            countChar[s.charAt(i)-'a']++;
            countChar[t.charAt(i)-'a']--;
        }

        for (int count:countChar){
            System.out.println(count);
            if(count !=0) return false;
        }
        return true;
    }
}
