package com.stringtask;
import java.util.*;

public class RemoveConsecutiveIdenticalChar {
    public static class Pair {
        char c;
        int count;

        Pair(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }

    public static String removeDup(String str, int k) {
        if (k == 1) {
            String ans = "";
            return ans;
        }
        Stack<Pair> st = new Stack<>();
        int l = str.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (st.size() == 0) {
                st.push(new Pair(str.charAt(i), 1));
                continue;
            }
            if (st.peek().c == str.charAt(i)) {
                Pair p=st.peek();
                st.pop();
                p.count+=1;
                if(p.count==k){
                    continue;
                } else{
                    st.push(p);
                }
            }else{
                st.push(new Pair(str.charAt(i),1));
            }
        }
        String ans="";
        while(st.size()>0){
            char c=st.peek().c;
            int cnt=st.peek().count;
            while (cnt-->0){
                ans=c+ans;
                st.pop();
            }
        }
        return ans;
    }
}
