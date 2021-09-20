package com.string;

public class RemoveWord {
    static int No_Of_Char=256;
    public static int[] getCount(String str){
        int[] count=new int[No_Of_Char];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)] ++;
        }
        return count;
    }
    public static String removeString(String str1,String str2){
        int[] count=getCount(str2);
        int k=0,i=0;
        char[] arr=str1.toCharArray();
        while(i<arr.length){
            char temp=arr[i];
            if(count[temp]==0){
                arr[k]=arr[i];
                k++;
            }
            i++;
        }
        str1= new String(arr);
        return str1.substring(0,k);
    }
}
