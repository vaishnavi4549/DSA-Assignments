/*
 Problem Statement:https://www.hackerrank.com/challenges/anagram/problem 
 */
package ProblemSolvingArrayString;
import java.io.*;
import java.util.*;

public class Anagrams {
    static int anagram(String s) {
        int len=s.length();
        int count=0;
        if(len%2!=0){
            return(-1);
        }
        else{
       String  s1 = s.substring(0,len/2);
            String s2 = s.substring(len/2,len);
            char[] s1Chars = s1.toCharArray();
            for (char c : s1Chars){
                int index = s2.indexOf(c);
                if (index == -1){
                    count++;
                } else {
                    s2 = s2.substring(0,index)+s2.substring(index+1);
                }
            }
            return (count);
        }   
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter Number of strings want to enter:");
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter Strings");
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);
            System.out.println(result);
        }
    }
}
