//https://www.hackerrank.com/challenges/twostrings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
package QueueAndHashing;
import java.io.*;
import java.util.*;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {
        Set<Character> string1 = new HashSet<>();
        Set<Character> string2 = new HashSet<>();
        for(int i=0;i<s1.length();i++){
            string1.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            string2.add(s2.charAt(i));
        }
        
        string1.retainAll(string2);
        
        if(string1.isEmpty()){
            return "NO";
        }
        else{
            return "YES";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
         System.out.println("Enter Number of iterations:");
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int qItr = 0; qItr < q; qItr++) {
            System.out.println("Enter First String:");
            String s1 = scanner.nextLine();
            
            System.out.println("Enter Second String:");
            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result+" Common Substring can be formed");
        }
    }
}
