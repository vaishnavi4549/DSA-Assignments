//https://www.hackerrank.com/challenges/down-to-zero-ii/problem

package QueueAndHashing;

import java.io.*;
import java.util.*;

public class DownToZero {
      static int[] dp = new int[1000000+1];
        static{
            for(int i=0;i<dp.length;i++)
            dp[i] = Integer.MAX_VALUE;
            dp[0] = 0;
            dp[1] = 1;
            
            for(int i = 2;i < dp.length ; i++){
                dp[i] = Math.min(dp[i],1 +dp[i-1]);
                for(int j = 2 ; j*j <= i ; j++){
                    if(i%j==0){
                        dp[i] = Math.min(dp[i],1+dp[i/j]);
                    }
                }
            }
        }
    static int downToZero(int n) {
      if(n == 0) 
      return 0;
      if(n == 1) return 1;
      
      return dp[n];
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter Number of test cases:");
        int q = sc.nextInt();
        for (int qItr = 0; qItr < q; qItr++) {
            System.out.println("Enter Number:");
            int result = downToZero(sc.nextInt());
            System.out.println("Number of moves required:"+result);
            System.out.println();
        }

    }
}

