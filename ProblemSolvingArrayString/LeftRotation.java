/*
Problem Statement:https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem 
 */
package ProblemSolvingArrayString;
import java.io.*;
import java.util.*;
public class LeftRotation {
    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int temp = 0;
        while(d!=0){
         temp = a[0];
        for(int i=0;i<n-1;i++)
        {
            a[i] = a[i+1];
        }
        a[n-1] = temp;
        d -= 1;
        }
        return(a);
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       System.out.println("Enter No of elements:");
        int n =scanner.nextInt();
       System.out.println("Enter No pf rotations");
       int d = scanner.nextInt();
        System.out.println("Enter array:");
        int[] aItems=new int[n];
        for (int i = 0; i < n; i++) {
            aItems[i] =scanner.nextInt();
        }

        int[] result = rotLeft(aItems, d);
        System.out.println("Array After Left Rotation:");
        for (int i = 0; i < result.length; i++) {
           System.out.print(result[i]+" ");
        }
        System.out.println();
        scanner.close();
    }
}

