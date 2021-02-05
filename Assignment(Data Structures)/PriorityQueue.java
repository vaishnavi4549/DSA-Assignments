//https://www.geeksforgeeks.org/priority-queue-using-linked-list/
package DataStructures;

import java.util.Scanner;

public class PriorityQueue {
    class node{
        int data;
        int priority;
        node next;
    }
    node head,temp;
    void create( int ele, int p){
        node node = new node();
        node.next = null;
        node.priority = p;
        node.data = ele;
        temp = head;
        if( head == null ){
           head = temp = node; 
        }
        else{
            if( head.priority > p ){
                node.next = head;
                head = node;
                temp = head.next;
            }
            else{
                node start = head;
                while( start.next != null && ( p > start.next.priority) ){
                    start = start.next;
                }
                node.next = start.next;
                start.next = node;
            }
        }
    }
    void pop(){
        node temp = head;
        head = head.next;
    }
    void display(){
       System.out.println( head.data );
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int ch1;
        
        PriorityQueue pq = new PriorityQueue();
        do{
        System.out.println("1:Insert Data");
        System.out.println("2:Pop");
        System.out.println("3:Peek");
         ch1 = sc.nextInt();
         int ch = 1;
           switch(ch1){
               case 1:
               do{
                   switch( ch ){
                       case 1:
                        System.out.println("Enter data:");
                        int ele = sc.nextInt();
                        System.out.println("Enter priority:");
                        int p = sc.nextInt();
                        pq.create( ele , p );
                        System.out.println("To Continue insertion :1/0");
                        ch = sc.nextInt();
                        break;
                   }
                 }while(ch != 0);
               break;
               
            case 2:
                 pq.pop();
                break;
               case 3:
                  pq.display();
           }  
        }while(ch1 != 0);
       
    }
}
