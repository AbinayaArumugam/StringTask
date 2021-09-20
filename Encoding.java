package com.string;


public class Encoding {
    public static String decoding(String str){
        String word="";
        int count=0;
        String result = "";
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                count =str.charAt(i)-'0';
            }
            else if (str.charAt(i) == '[') {
                int j=i+1;
                word="";
                while (str.charAt(j) != ']') {

                    word += str.charAt(j);
                    j++;
                }
            }
            else if(str.charAt(i)==']') {
                for (int k = 1; k < count; k++) {
                    result += word;
                }
            } else {
                result+=str.charAt(i);
            }

        }
        return result ;
    }

}