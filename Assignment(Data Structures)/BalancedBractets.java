/*https://www.hackerrank.com/challenges/balanced-brackets/problem */
package DataStructures;
import java.io.*;
import java.util.*;
public class BalancedBractets {
     static String isBalanced( String s ) {
     Stack< Character > st = new Stack < > ();
        boolean sr;String str = null;
        for(int i = 0; i < s.length(); i++ ){
            char x = s.charAt(i);
            if( x == '(' || x == '[' || x == '{' ){
                st.push(x);
            }
            
            else{ 
                
                if( x == ')' ){
                    sr = Balance( st , '(');
                    if(sr == false){
                        str = "NO";
                    }
                }
                else if( x == ']' ){
                    sr = Balance( st , '[' );
                    if( sr == false){
                       str = "NO";
                    }
                }
                else if( x == '}' ){
                    sr = Balance( st , '{' );
                    if(sr == false){
                        str = "NO";
                    }
                }
            }
            if(st.size() ==0 ){
                str = "YES";
            }
            else{
            str = "NO";
            }
        }
       return str;
    }
     
    static boolean Balance(Stack<Character> st, char x){
        if( st.size() == 0 ){
            return true;
        }
        else if( st.peek() != x ){
            return false;
        }
        
            st.pop();
            return true;
        
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println( "Enter No of test cases want to enter:");
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            System.out.println(result);
        }

        scanner.close();
    }
}
