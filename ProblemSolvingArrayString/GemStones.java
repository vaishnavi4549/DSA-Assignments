//Problem Statement:https://www.hackerrank.com/challenges/gem-stones/problem 
package ProblemSolvingArrayString;
import java.io.*;
import java.util.*;
public class GemStones {
    static int gemstones(String[] arr) {
       int result=0;
       for(char c='a'; c<='z';c++)
        { int count=0;
        for(int j=0; j<arr.length;j++)
            {
            if(arr[j].contains(Character.toString(c)))
                {
                count++;
            }
        }
         if(count==arr.length)
             {
             result++;
         }
    }
    return(result);
    }
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Number of Strings:");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter Strings:");
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);
        System.out.println("Number of Gem Stones:"+result);
    }
}
