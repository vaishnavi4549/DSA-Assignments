
/*
Problem Statement: https://www.hackerrank.com/challenges/simple-array-sum/problem
*/
package ProblemSolvingArrayString;
import java.util.*;
import java.io.*;

public class ArraySum {
    static int simpleArraySum(int[] ar) {
        int len = ar.length;
        int sum = 0;
        for(int i=0;i<len;i++)
        {
            sum += ar[i];
        }
        return(sum);
    }
    
    public static void main(String[] args) throws IOException {
        
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter Number of elements:");
       int n = scanner.nextInt();
       int[] ar = new int[n];
       System.out.println("Enter array");
       for(int i=0;i<n;i++)
       {
           ar[i] = scanner.nextInt();
       }
       
        int result = simpleArraySum(ar);
        System.out.println("Sum Of Array : "+result);
    }
}
