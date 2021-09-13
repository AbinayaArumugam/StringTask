package com.string;

public class PalindromicSubString {
    public static String findPalindrome(String str){
        int k=0;
        int l=0;
        String newStr="";
        int i=0;
        int j=0;
        for(i=0,j=str.length()-1;i<str.length()/2;i++){
                if (str.charAt(i)==str.charAt(j)&&j>i) {
                    if (k == 0 && l == 0) {
                        k = i;
                        l = j;
                    }
                } else {
                    k = 0;
                    l = 0;
                }
                j--;
        }
        if(k!=0&&l!=0){
            newStr=str.substring(k,l+1);
        }
        return newStr;
    }
}
