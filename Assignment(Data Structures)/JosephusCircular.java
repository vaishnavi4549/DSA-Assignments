/* https://www.geeksforgeeks.org/josephus-circle-using-circular-linked-list/*/
package DataStructures;

import java.util.Scanner;

public class JosephusCircular {
    class node{
        int data;
        node next;
        
        node(int data){
            this.data=data;
        }
    }
    node temp;
    void create( int n , int m){
        node head = new node ( 1 );
        temp = head;
        for(int i = 2 ; i <= n; i++ ){
           temp.next = new node(i); 
           temp = temp.next; 
        }       
        temp.next = head;
  
        node temp2;
        node ptr1 = head;
        temp2 = head;
        int cnt;
        while( ptr1.next != ptr1 ){
            cnt = 1;
            while ( cnt != m ){
            temp2 = ptr1;
            ptr1 = ptr1.next;
            cnt++;
            }
            temp2.next = ptr1.next;
             ptr1 = temp2.next;
        }
        
         
        System.out.println("Person should stand at this position :"+ptr1.data);
    }   
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter No of elements in list:" );
        int n = sc.nextInt();
        System.out.println("Enter No elements to skip");
        int m = sc.nextInt();
        JosephusCircular jc = new JosephusCircular();
        jc.create ( n , m );
    }
}
