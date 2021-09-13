package com.string;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
      Scanner in=new Scanner(System.in);
        System.out.println("Enter the Question no:");
      int question=in.nextInt();
      switch(question){
          case 1:
          System.out.println("Enter the String: ");
          String str = in.nextLine();
          System.out.println("Enter the SubString to replace: ");
          String subString=in.next();
          System.out.println("Enter the subString to be replaced: ");
          String newSubString=in.next();
          System.out.println(ReplaceSubString.replaceSubString(str,subString,newSubString));
          break;
          case 2:
              System.out.println("Enter the String: ");
              String str2 = in.next();
              System.out.println(PalindromicSubString.findPalindrome(str2));
              break;
          case 3:
              System.out.println("Enter the String: ");
              String str3 = in.next();
              System.out.println(SecondMostFrequent.findSecondFrequent(str3));
              break;
          case 4:
              System.out.println("Enter the String: ");
              String str4 = in.next();
              System.out.println(LastNonRepeating.findLastNonRepeating(str4));
              break;
          case 5:
              Scanner sc= new Scanner(System.in);
              System.out.println("Enter the String: ");
              String str5 = sc.nextLine();
              System.out.println(CaseConvention.convertCase(str5));
              break;
          case 6:
              Scanner sc1= new Scanner(System.in);
              System.out.println("Enter the String: ");
              String str6 = sc1.nextLine();
              ConvertStringAccording.convertString(str6);
              break;
          case 7:
              break;
          case 8:
              System.out.println("Enter the String: ");
              String str8 = in.next();
              System.out.println(RomanToDecimal.convertToDecimal(str8));
              break;
          case 9:
              System.out.println("Enter the String: ");
              String str9 = in.next();
              System.out.println(RemoveDuplicates.removeDuplicateSort(str9));
              break;
          default :
              System.out.println("Invalid");
              break;
      }

    }
}
