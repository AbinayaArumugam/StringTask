package com.string;

public class CaseConvention {
    public static String convertCase(String str){
        char[] ch= new char[str.length()];
        int k=0;
     //   System.out.println(str.length());
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
              ch[k++] = Character.toUpperCase(str.charAt(i));
            } else {
                ch[k++]=Character.toLowerCase(str.charAt(i));
            }
        }
        return String.valueOf(ch);
    }

}
