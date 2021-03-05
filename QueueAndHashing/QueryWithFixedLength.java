// https://www.hackerrank.com/challenges/queries-with-fixed-length/problem
package QueueAndHashing;
import java.io.*;
import java.util.*;

public class QueryWithFixedLength {
    static int[] solve(int[] arr, int[] queries) {
     int n=arr.length;
     int[] ans=new int[queries.length];
     int maxi,mini,k;
     
     for(int i=0;i<queries.length;i++){
         maxi=0;
         k=0;
         for(int r=0;r<queries[i];r++){
             if(arr[r]>maxi){
                 maxi=arr[r];
                 k=r;
             }
         }
         mini=maxi;
         for(int s=1,e=queries[i];e<n;s++,e++){
             if(s-1==k||arr[e]>=maxi){
                 maxi=arr[s];
                 k=s;
                 for(int r=s+1;r<=e;r++){
                    if(arr[r]>maxi){
                    maxi=arr[r];
                    k=r;
                    }
                  }
                 if (maxi<mini)
                 {
                      mini=maxi;
                 } 
             }
         }
        ans[i]=mini;     
     } 
    
    return ans;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        
        System.out.println("Enter no of array elements:");
        int n = scanner.nextInt();
        System.out.println("Enter no of queries:");
        int q = scanner.nextInt();

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        
        System.out.println("Enter array elements:");
        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = scanner.nextInt();
            arr[arrItr] = arrItem;
        }
        System.out.println("Enter queries array:");
        int[] queries = new int[q];

        for (int queriesItr = 0; queriesItr < q; queriesItr++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[queriesItr] = queriesItem;
        }

        int[] result = solve(arr, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            System.out.println((result[resultItr]));

            if (resultItr != result.length - 1) {
                System.out.println(("\n"));
            }
        }
    }
}
