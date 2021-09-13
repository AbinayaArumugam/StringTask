package com.string;

public class SecondMostFrequent {
    static final int NO_OF_CHAR=256;
    public static char findSecondFrequent(String str){
        int[] count= new int[NO_OF_CHAR];
        int i;
        for( i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
      //  int maxFreq=Integer.MIN_VALUE;
        int first=0;
        int second=0;
        for(i=0;i<NO_OF_CHAR;i++) {
            if (count[i] > count[first]) {
                second = first;
                first = i;
            } else if(count[i]>count[second]&&count[i]!=count[first]) {
                second=i;
            }

        }
     return (char)second;
    }
}
