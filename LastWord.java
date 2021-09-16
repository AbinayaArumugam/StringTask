package com.stringtask;

public class LastWord {
    public static int printLastWord(String str){
        String[] arr=str.split(" ");
        String newStr=arr[arr.length-1];
        
        return newStr.length();
    }
}
