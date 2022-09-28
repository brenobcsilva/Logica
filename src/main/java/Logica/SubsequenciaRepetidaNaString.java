package Logica;

import java.util.HashMap;
import java.util.Map;

public class SubsequenciaRepetidaNaString {

   public static boolean isPalindrome(String str, int low, int high){
       if(low>=high){
           return true;
       }
       return (str.charAt(low)==str.charAt(high)) &&
               isPalindrome(str, low+1, high-1);
   }

   public static boolean hasRepeatedSubsequence(String str){
       if(str == null || str.length()==0) {
           return false;
       }
       Map<Character, Integer> freq = new HashMap<>();

       for(char c: str.toCharArray()){
           freq.put(c, freq.getOrDefault(c,0)+1);

           if(freq.get(c)>=3){
               return true;
           }
       }

       StringBuilder sb = new StringBuilder();

       for(char c: str.toCharArray()){
           if(freq.get(c)>=2){
               sb.append(c);
           }
       }
       return !isPalindrome(sb.toString(),0,sb.length()-1);
   }
    public static void main(String[] args)
    {

        //escrever 1 palavra com duas letras iguais
        String str = "BrenoBr";        // 'XB' é subsequência repetida

        if (hasRepeatedSubsequence(str)) {
            System.out.println("Repeated subsequence is present");
        }
        else {
            System.out.println("No repeated subsequence is present");
        }
    }

}
