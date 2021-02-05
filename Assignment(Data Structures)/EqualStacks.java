// https://www.hackerrank.com/challenges/equal-stacks/problem
package DataStructures;

import java.io.*;
import java.util.*;


class Result {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    Collections.reverse(h1);
    Collections.reverse(h2);
    Collections.reverse(h3);
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    Stack<Integer> stack3 = new Stack<Integer>();
   
    int sum1=0,sum2=0,sum3=0;
    for(int i=0;i<h1.size();i++){
        stack1.push(h1.get(i));
        sum1+=stack1.get(i);
    }
    for(int i=0;i<h2.size();i++){
        stack2.push(h2.get(i));
        sum2+=stack2.get(i);
    }
    for(int i=0;i<h3.size();i++){
        stack3.push(h3.get(i));
        sum3+=stack3.get(i);
    }
    int min=0;
    while(!(sum1==sum2 && sum2==sum3)){
    if(sum1<sum2 && sum1<sum3){
        min=sum1;
    }
    else{
        if(sum2<sum3 && sum2<sum3){
            min=sum2;
        }
        else{
            min=sum3;
        }
    }
    while(sum1>min){
        sum1=sum1-stack1.pop();
    }
    while(sum2>min){
        sum2=sum2-stack2.pop();
    }
    while(sum3>min){
        sum3=sum3-stack3.pop();
    }
    }
    if(sum1==sum2 && sum2==sum3){
    return sum1;
    }
    return 0;
    }
}
public class EqualStacks {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of elements of stack1:");
        int n1=sc.nextInt();
         System.out.println("Enter Number of elements of stack2:");
        int n2=sc.nextInt();
         System.out.println("Enter Number of elements of stack3:");
        int n3=sc.nextInt();
        int[] h1Temp = new int[n1];

        List<Integer> h1 = new ArrayList<>();
        System.out.println("Enter elements of stack1:");
        for (int i = 0; i < n1; i++) {
             h1Temp[i]=sc.nextInt();
            h1.add(h1Temp[i]);
        }
        int[] h2Temp = new int[n2];

        List<Integer> h2 = new ArrayList<>();
        System.out.println("Enter elements of stack2:");
        for (int i = 0; i < n2; i++) {
             h2Temp[i]=sc.nextInt();
             h2.add(h2Temp[i]);
        }
        int[] h3Temp = new int[n3];
        System.out.println("Enter elements of stack3:");
        List<Integer> h3 = new ArrayList<>();

        for (int i = 0; i < n3; i++) {
             h3Temp[i]=sc.nextInt();
            h3.add(h3Temp[i]);
        }
        

        int result = Result.equalStacks(h1, h2, h3);
        System.out.println("height of the stacks when they are equalized:"+result);
    }
}
