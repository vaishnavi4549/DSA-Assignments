/*
 Problem Statement: https://www.hackerrank.com/challenges/equality-in-a-array/problem 
 */
package ProblemSolvingArrayString;
import java.util.Scanner;
public class EqualizingArray {
    static int EqualizeArray(int n,int[] a){
        int[] r = new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(a[i] == a[j]){
                    r[i] += 1;
                }
            }
        }
         int max = 0;
        for(int i=0;i<n;i++){
            if(r[i] > max){
                max = r[i];
            }
        }
        return( n-max );
    }
    public static void main(String args[]){
        System.out.println("Enter No of array elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Number of Elements to be Removed: "+EqualizeArray(n,a));
    }
}
