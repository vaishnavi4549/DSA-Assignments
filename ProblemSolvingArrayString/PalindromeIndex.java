/*
 problem statement:https://www.hackerrank.com/challenges/palindrome-index/problem
 */
package ProblemSolvingArrayString;

import java.io.IOException;
import java.util.Scanner;
public class PalindromeIndex {   
 static int palindromeIndex(String s)
    {
        if(ispalindrome(s)){
            return(-1);
        }
        for(int i=0;i< s.length();i++){
            String str1 = s.substring (0,i);
            String str2 = s.substring (i+1,s.length());
            if(ispalindrome (str1 + str2) == true){
                return(i);
            }
        }
        return(-1);
    } 
    static boolean ispalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            else{
                return(false);
            }
            
        }
        return true;       
    }
     private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Number of strings");
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = palindromeIndex(s);
            System.out.println(result);
            
        }
        
    }
}
