/*
  https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem         
 */
package ProblemSolvingArrayString;

import java.io.IOException;
import java.util.Scanner;

public class SherlockAndValidString {
         public static String isValid (String s)
    {
        
        char[] res;
        res = s.toCharArray();
        int[] r=new int[s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    r[i]+=1;
                }
            }
            
        }
  
      int max=maxfrequency(r);
        for(int i=0;i<r.length;i++)
        {
            if(r[i]!=max)
                return("NO");
        }
        
        return("YES");
    }
    public static int maxfrequency(int[] r){
        int max=r[0];
        for(int i=1;i<r.length;i++){
            if(max<r[i])
            {
                max=r[i];
            }
        }
        return(max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter Number of strings");
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result=isValid(s);
            System.out.println(result);
        }
        
    }
}
