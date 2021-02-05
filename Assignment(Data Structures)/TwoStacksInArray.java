
package DataStructures;

import java.util.Scanner;
public class TwoStacksInArray {
    int arr[];int top1,top2;int size;
    TwoStacksInArray(int size){
        this.top1=-1;
        this.size=size;
        this.top2=size;
        arr=new int[size];
    }
    void push1(int ele){
        if(top1<top2-1){
            top1++;
            arr[top1]=ele;
        }
        else{
            System.out.println("stack overflow");
        }
    }
     void push2(int ele){
        if(top1<top2-1){
            top2--;
            arr[top2]=ele;
        }
        else{
            System.out.println("stack overflow");
        }
    }
     int pop1() 
    { 
        if (top1 >= 0) { 
            int x = arr[top1]; 
            top1--; 
            return x; 
        } 
        else { 
            System.out.println("Stack Underflow");  
        } 
        return 0; 
    } 
     int pop2() 
    { 
        if (top2 < size) { 
            int x = arr[top2]; 
            top2++; 
            return x; 
        } 
        else { 
            System.out.println("Stack Underflow"); 
        }
        return 0; 
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter size of array:");
        TwoStacksInArray ts=new TwoStacksInArray (sc.nextInt());
        int ch;
        do{
        System.out.println("1:Push In stack 1");
         System.out.println("2:Push In stack 2");
          System.out.println("3:Pop from stack 1");
           System.out.println("4:Pop from stack 2");
        System.out.println("0:Exit");        
        ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter element to push");
                ts.push1(sc.nextInt());
                break;
            case 2:
               System.out.println("Enter element to push");
                ts.push2(sc.nextInt());
                break; 
            case 3:
                System.out.println(ts.pop1());
                break;
            case 4:
                System.out.println(ts.pop2());
                break; 
        }
        }while(ch!=0);
    }
}
