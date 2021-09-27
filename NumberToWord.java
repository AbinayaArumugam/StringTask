package com.string;

public interface NumberToWord {
    static String[] ones={"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ","thirteen ","fourteen ","fifteen ",
                              "sixteen ","seventeen ","eighteen ","nineteen "};
    static String[] tens={"","","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
    public static String convertToWord(long number){
        String out="";
        out+=numToWord((int)(number/10000000),"Crore ");
        out+=numToWord((int) ((number/100000)%100),"Lakh ");
        out+=numToWord((int)((number/1000)%100),"Thousand ");
        out+=numToWord((int)((number/100)%10),"Hundred ");
        if(number>100&&number%100>0){
            out+="And ";
        }
        out+=numToWord((int)(number%100)," ");
        return out;
    }
    public static String numToWord(int num, String word){
        String str="";
        if(num>19){
            str+=tens[num/10]+ones[num%10];
        }else {
            str+=ones[num];
        }
        if (num!=0){
            str+=word;
        }
        return str;
    }

}
