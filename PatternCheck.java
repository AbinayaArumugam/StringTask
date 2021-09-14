package com.string;

import java.util.HashMap;
        import java.util.Map;

public class PatternCheck {
    public static boolean wordPattern(String pattern,String str){
        Map<Character,String> map=new HashMap<>();
        String[] words=str.split(" ");
        System.out.println(pattern.length());
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=map.get(ch);
            if (word==null){
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(ch,words[i]);
            }
            else if(!word.equals(words[i])){
                return false;
            }
        }
        return true;
    }
}
