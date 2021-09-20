package com.string;

public class RemovePalindrome {
    public static boolean isPalindrome(String str){
        int i=0;int j=str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)){
                return false;
            }
        }
        return true;
    }
    public static String removePalindrome(String str){
        String finalStr="";
        String word="";
        str=str+" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                word=word+str.charAt(i);
            } else{
                if(!(isPalindrome(word))){
                    finalStr+=word+" ";
                }
                word="";
            }
        }
        return finalStr;
    }
}
