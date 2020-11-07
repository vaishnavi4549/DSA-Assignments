/*
Problem Statement:https://www.hackerrank.com/challenges/circular-array-rotation/problem
*/
package ProblemSolvingArrayString;
 import java.io.*;
import java.util.*;
public class CircularRotation {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int len=a.length;
        int[] r=new int[len];
        for(int i=0;i<len;i++){
            if((i+k)<len) 
            {
                r[i+k]=a[i];
            }
            else{
                r[(i+k)%len]=a[i];
            }
        }
        int lq=queries.length;
        int j=0;
        while(j<lq)
        {
            int temp=queries[j];
            for(int i=0;i<lq;i++){
               queries[j]=r[temp];
             }
            j=j+1;   
        }
        return(queries);
}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter 1:NO OF ELEMENTS");
        int n = scanner.nextInt();
        System.out.println("2:NO OF ROTATIONS:");
        int k = scanner.nextInt();
         System.out.println("3:ELEMENT NUMBER OF INDEXES TO PRINT");
        int q = scanner.nextInt();
   
        System.out.println("Enter array elements");
        int[] aItems = new int[n];
        for (int i = 0; i < n; i++) {
            aItems[i] = scanner.nextInt();
        }
        int[] queries = new int[q];
    
        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(aItems, k, queries);

        for (int i = 0; i < result.length; i++) {
           System.out.println(result[i]);
        }
        scanner.close();
    }
}

