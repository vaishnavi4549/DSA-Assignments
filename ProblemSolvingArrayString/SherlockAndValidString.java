/*
  https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem         
 */
package ProblemSolvingArrayString;

import static Other.Shrellockvalid.maxfrequency;
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
    
    public static int minfrequency(int[] r){
        int min=r[0];int cnt=0;
        for(int i=0;i<r.length;i++){
            System.out.println(r[i]);
        }
        for(int i=1;i<r.length;i++){
            cnt++;
            if(r[i]<min)
            { 
                min=r[i];
            }
        }
        return(cnt);
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
