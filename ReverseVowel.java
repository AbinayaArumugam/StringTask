package com.string;

public class ReverseVowel {
    public static boolean isVowel(char c){
        return (c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||
                c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    public static String reverseVowel(String str){
        int j=0;String vowel="";
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])) {
                j++;
                vowel += arr[i];
            }
        }
        for (int i=0;i<arr.length;i++){
            if(isVowel(arr[i]))
                arr[i]=vowel.charAt(--j);
        }
        return String.valueOf(arr);
    }
}
