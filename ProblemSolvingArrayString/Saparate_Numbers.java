/*
Problem Statement: https://www.hackerrank.com/challenges/separate-the-numbers/problem 
*/
package ProblemSolvingArrayString;
import java.io.IOException;
import java.util.Scanner;
public class Saparate_Numbers {
       static void separateNumbers(String s) {
        int q=s.length();
        boolean valid = false;
        long firstx = -1;   
        for(int a0 = 0; a0 < q; a0++) {  
        for (int i=1; i<=s.length()/2; ++i) {
            Long x = Long.parseLong(s.substring(0,i));
            firstx = x;
            String test = Long.toString(x);
            while (test.length() < s.length()) {
                test += Long.toString(++x);
            }
            if (test.equals(s)) {
                valid = true;
                break;
            }
        }
        }
       if(valid){System.out.println("YES "+firstx);}
       else{
           System.out.println("NO");
       }
    }
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Number of strings");
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            
           separateNumbers(s);
        }
        
    }
}
