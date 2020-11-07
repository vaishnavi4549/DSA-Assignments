 
/*
 Problem Statement: https://www.hackerrank.com/challenges/grading/problem 
 */
package ProblemSolvingArrayString;
import java.util.Scanner;
public class GadientArray {
    static void Calculate(int n,int[] marks){
        int[] r = new int[marks.length];
        for(int i=0;i< marks.length;i++){
            if( marks[i] < 38 || marks[i]%5 <=2)
                r[i] = marks[i];
            else
                if(marks[i]%5 >2){
                    r[i] = marks[i] + 5-marks[i]%5;
                }
        }
        for(int i=0;i<marks.length;i++){
            System.out.println(r[i]);
        }
    }
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects :");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter Marks of Subjects: ");
        for(int i=0;i < n;i++)
        {
            marks[i] = sc.nextInt();
        }
      Calculate(n,marks);
    }
}
