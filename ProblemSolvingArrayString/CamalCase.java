/*
 Problem Statement: https://www.hackerrank.com/challenges/camelcase/problem 
 */
package ProblemSolvingArrayString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CamalCase {
    public static void main(String args[]) throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String in camal case to identify how many words are there : ");
        String s=br.readLine();
        String[] a=s.split("[A-Z]");
        System.out.println("Number of words: "+a.length);
    }
}
