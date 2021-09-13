package com.string;

public class ReplaceSubString {
  public static String replaceSubString(String str,String strReplace,String strToBeReplaced){
    String newStr="";
    String[] arr= str.split(" ");
    for(int i=0;i<arr.length;i++) {
      if (arr[i].equals(strReplace)) {
        arr[i] = strToBeReplaced;
      }
      newStr += " " + arr[i];
    }
    return newStr;
  }
}
