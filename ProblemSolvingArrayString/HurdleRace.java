/*
 Problme statement:https://www.hackerrank.com/challenges/the-hurdle-race/problem 
*/
package ProblemSolvingArrayString;
  import java.io.*;
import java.util.*;

public class HurdleRace {
   
        static int hurdleRace(int k, int[] height) {
        int max = height[0];
        for(int i=1;i< height.length-1;i++){
            if(height[i] > max){
                max = height[i];
            }
        }
        if(k > max){
            return(0);
        }
        return(max-k);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      
        System.out.println("Enter the number of hurdles");
        int n = scanner.nextInt();
        System.out.println("The maximum height the character can jump naturally: ");
        int k = scanner.nextInt();
        System.out.println("Enter heights:");
        int[] heightItems = new int[n];
        for (int i = 0; i < n; i++) {
            heightItems[i]=scanner.nextInt();
        }
        int result = hurdleRace(k, heightItems);
        System.out.println("Number of Dose required: "+result);

    }
}


