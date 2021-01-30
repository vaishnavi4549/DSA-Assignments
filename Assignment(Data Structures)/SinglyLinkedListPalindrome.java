/* https://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/ */
package DataStructures;

import java.util.Scanner;

import java.util.Stack;

public class SinglyLinkedListPalindrome {
    class node {
        int data;
        node next;
    }
    node temp = null;node head = null;
    void create( int ele ){
       node node = new node();
       node.data = ele;
       node.next = null;
       if(head == null){
           head = temp = node;
       }
       else{
           temp.next = node;
           temp = node;
       }
    }
    void display(){
        temp = head;
        while( temp.next != null ){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
        System.out.print(" "+temp.data);
        System.out.println();
    }
    boolean palindrome(){
        temp = head;
        Stack<Integer> s = new Stack<>();
        while( temp.next != null){
            s.add( temp.data );
            temp = temp.next;
        }
        s.add( temp.data );
        
        temp = head;
        while( !s.isEmpty() ){
            if( temp.data != s.pop()){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int ch1;
        
        SinglyLinkedListPalindrome sp = new SinglyLinkedListPalindrome();
        do{
        System.out.println("1:Insert Data");
        System.out.println("2:Check Palindrome Data");
        System.out.println("3:Display Data");
         ch1 = sc.nextInt();
         int ch = 1;
           switch(ch1){
               case 1:
               do{
                   switch(ch){
                       case 1:
                       System.out.println("Enter data:");
                        sp.create ( sc.nextInt() );
                        System.out.println("To Continue insertion :1/0");
                        ch = sc.nextInt();
                        break;
                   }
                 }while( ch!=0 );
               break;
               
            case 2:
                 System.out.println( sp.palindrome() );
                break;
               case 3:
                  sp.display();
           }  
        }while(ch1!=0);
       
    }
}
