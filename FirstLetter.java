package com.string;

public class FirstLetter {
    public static String findFirstLetter(String str){
        String res="";
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            res+=arr[i].charAt(0);
        }
        return res;
    }
}