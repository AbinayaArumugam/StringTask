package com.stringtask;

public class MinimumOperationToConvert {
    public static int min(int insert,int remove,int replace){
        if(insert<=remove&&insert<=replace)
            return insert;
        if(remove<=insert&&remove<=replace)
            return remove;
        else
            return replace;
    }
    public static int editDis(String str1,String str2,int length1,int length2) {
      int temp[][]=new int[length1+1][length2+1];
      for(int i=0;i<=length1;i++) {
          for (int j = 0; j <=length2; j++) {
              if (i == 0)
                  temp[i][j] = j;
              else if (j == 0)
                  temp[i][j] = i;
              else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                  temp[i][j] = temp[i - 1][j - 1];
              else
                  temp[i][j] = 1 + min(temp[i][j - 1], temp[i - 1][j], temp[i - 1][j - 1]);
          }
      }
      return temp[length1][length2];
    }

    }
 /* if (length1 == 0)
            return length2;
        if (length2 == 0)
            return length1;
        if (str1.charAt(length1 - 1) == str2.charAt(length2 - 1))
            return editDis(str1, str2, length1-1 , length2 - 1);
        return 1 + min(editDis(str1, str2, length1, length2 - 1),
                editDis(str1, str2, length1 - 1, length2),
                editDis(str1, str2, length1 - 1, length2 - 1));*/
