/*
Problem Statement: https://www.hackerrank.com/challenges/counting-valleys/problem 
*/
package ProblemSolvingArrayString;

import java.io.*;
import java.util.Scanner;

class Result {
    public static int countingValleys(int steps, String path) {
    int len = path.length();
    int alt=0,valley=0;
     char[] r = path.toCharArray();
     for(int i=0;i<len;i++){
         if(r[i] =='U'){
            alt += 1;
            if(alt == 0)
                valley += 1;
         }
         else{
             alt -= 1;
         }
     }
    return(valley);
    }
}

public class CountingValleys {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Steps:");
            int steps = sc.nextInt();
            System.out.println("Enter path:");
            String path = sc.next();
            int result = Result.countingValleys(steps, path);
      
            System.out.println("Number Of Valleys:"+result);
        }
    }

