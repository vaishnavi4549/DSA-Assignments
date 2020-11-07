/*
 Problem Statement: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem 
 */
package ProblemSolvingArrayString;
import java.io.*;
import java.util.*;
public class StockMerchant {
    static int sockMerchant(int n, int[] ar) {
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
            if(ar[i]==ar[j] && ar[i]!=0){
                    cnt++;
                    ar[j]=0;
                    ar[i]=0;
                }
            }
        }
       
        return(cnt);
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       System.out.println("Enter the number of socks represented :");
        int n = scanner.nextInt();
        System.out.println("Enter integers describing the colors  of the socks in the pile");
        int[] arItems = new int[n];
        for (int i = 0; i < n; i++) {
            arItems[i] = scanner.nextInt();   
        }

        int result = sockMerchant(n, arItems);
        
        System.out.println("Number of Pairs: "+result);
        scanner.close();
    }
}

