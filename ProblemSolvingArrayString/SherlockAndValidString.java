/*
  https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem         
 */
package ProblemSolvingArrayString;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SherlockAnsValidString {
   
  static String isValid(String s) {
       final String YES = "YES";
       final String NO = "NO";
       if(s.isEmpty()){
           return (NO);
       }
       if(s.length() <= 3){
           return (YES);
       }
       int[] letters = new int[26];
       for(int i=0 ; i < s.length() ; i++){
           letters[ s.charAt(i) - 'a']++;
       }
       Arrays.sort(letters);
       int i=0;
       while( letters[i] == 0){
          i++;
       }
       int min = letters[i];
       int max = letters[25];
       String temp = NO;
        if(min == max){
          temp = YES;
        }
        else{
           if(( (max-min==1) && (max>letters[24]) )||(min==1) && (letters[i+1]==max) ){
                temp = YES;
           }  
        }
        return(temp);
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
