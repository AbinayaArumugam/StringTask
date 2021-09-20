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
              System.out.println("Enter the String: ");
              in.nextLine();
              String str5 = in.nextLine();
              System.out.println(CaseConvention.convertCase(str5));
              break;
          case 6:
              System.out.println("Enter the String: ");
              in.nextLine();
              String str6 = in.nextLine();
              ConvertStringAccording.convertString(str6);
              break;
          case 7:
              System.out.println("Enter the String: ");
              String str7 = in.next();
              System.out.println(RomanToDecimal.convertToDecimal(str7));
              break;
          case 8:
              System.out.println("Enter the String: ");
              String str8 = in.next();
              System.out.println(RemoveDuplicates.removeDuplicateSort(str8));
              break;
          case 9:
              System.out.println("Enter the pattern String");
              String pattern = in.nextLine();
              System.out.println("Enter the String");
              String str9 = in.nextLine();
              System.out.println(PatternCheck.wordPattern(pattern, str9));
              break;
          case 10:
              System.out.println("Enter the number");
              int number=in.nextInt();
              System.out.println(DecimalToRoman.convertToRoman(number));
              break;
          case 11:
               System.out.println("Enter the String");
               String str11=in.next();
               System.out.println("Enter the number");
               int k=in.nextInt();
               System.out.println(RemoveConsecutiveIdenticalChar.removeDup(str11,k));
               break;
          case 12:
              System.out.println("Enter the String");
              String str1=in.next();
              System.out.println("Enter the second String ");
              String str12=in.next();
              System.out.println(MinimumOperationToConvert.editDis(str1,str12,str1.length(),str12.length()));
              break;
          case 13:
               System.out.println("Enter the String");
               String str13=in.nextLine();
               System.out.println(LastWord.printLastWord(str13));
               break;
          case 14:
              System.out.println("Enter the String");
              in.nextLine();
              String str14=in.nextLine();
              System.out.println(RemovePalindrome.removePalindrome(str14));
              break;
          case 15:
              System.out.println("Enter the String");
              String str15=in.next();
              System.out.println(Encoding.decoding(str15));
          case 16:
              System.out.println("Enter the String");
              String str16=in.nextLine();
              System.out.println(Panagram.findPanagram(str16));
              break;
          case 17:
              System.out.println("Enter the String");
              String string1=in.next();
              System.out.println("Enter the second String ");
              String string2=in.next();
              System.out.println(Isometric.areIsometric(string1,string2));
              break;
          case 18:
              System.out.println("Enter the String");
              String str18=in.next();
              char[] expr=str18.toCharArray();
              System.out.println(BalancedParenthesis.check(expr,expr.length));
              break;
          case 19:
              System.out.println("Enter the String");
              String str19=in.nextLine();
              System.out.println(FirstLetter.findFirstLetter(str19));
              break;
          case 20:
              System.out.println("Enter the String");
              String stk1=in.next();
              System.out.println("Enter the second String ");
              String stk2=in.next();
              System.out.println(RemoveWord.removeString(stk1,stk2));
              break;
          case 21:
              System.out.println("Enter the String");
              String str21=in.next();
              System.out.println(ReverseVowel.reverseVowel(str21));
              break;
          default :
              System.out.println("Invalid");
              break;
      }

    }
}
