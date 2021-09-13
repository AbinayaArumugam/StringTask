package com.string;

import java.util.Arrays;

public class RemoveDuplicates {

    public static String removeDuplicateSort(String str){
       char[] temp= str.toCharArray();
       Arrays.sort(temp);
       str= new String(temp);
    return removeDuplicates(str);
    }
    public static String removeDuplicates(String str){
        int start=1,k=1;
        char[] arr=str.toCharArray();
        while(k!=arr.length){
            if(arr[k]!=arr[k-1]){
               arr[start]=arr[k];
               start++;
            }
            k++;
        }
        str=new String(arr);
        return str.substring(0,start);
    }
}
