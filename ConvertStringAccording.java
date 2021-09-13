package com.string;

public class ConvertStringAccording {
    public static void convertString(String str) {
        String first = "";
        int i;
        for (i = 0; i < str.length(); ) {
            while (str.charAt(i) != ' ') {
                first = first + str.charAt(i);
                i++;
            }
            break;
        }
        String last = "";
        int j = 0;
        for (j = str.length() - 1; j >= i; ) {
            while (str.charAt(j) != ' ') {
                last = str.charAt(j)+last;
                j--;
            }
            break;
        }
        System.out.print(last);
        for(int m=j;m>=i;m--){
            System.out.print(str.charAt(m));
        }
        System.out.print(first);
    }
}
