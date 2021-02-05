// https://www.hackerrank.com/challenges/largest-rectangle/problem
package DataStructures;

import java.io.*;
import java.util.*;

public class LargestRectangle {
    static long largestRectangle(int[] h) {
        int top,i,maxarea = 0,area = 0;
        Stack<Integer> st = new Stack<Integer>();
        for( i = 0; i < h.length ;){
            if( st.isEmpty()|| h[st.peek()] <= h[i] ){
                st.push(i++);
            }
            else{
                top = st.pop();
                if(st.isEmpty()){
                    area = h[top]*i;
                }
                else{
                    area = h[top]*(i-st.peek()-1);
                }
                if(area > maxarea){
                    maxarea = area;
                }
            }
        }
        while(!(st.isEmpty())){
            top = st.pop();
            if(st.isEmpty()){
                area = h[top] * i;
            }
            else{
               area = h[top] * (i-st.peek()-1); 
            }
             if(area > maxarea){
                    maxarea = area;
                }
        }
        return maxarea;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println( "Enter number of Buildings:" );
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int[] h = new int[n];
        
        System.out.println("Enter height of Buildings:");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int hItem = scanner.nextInt();
            h[i] = hItem;
        }

        long result = largestRectangle(h);
        System.out.println("maximum area of rectangle formed:"+result);

    }
}
