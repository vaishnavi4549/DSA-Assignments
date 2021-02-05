/*
https://www.geeksforgeeks.org/remove-duplicates-sorted-doubly-linked-list/
 */
package DataStructures;
import java.util.Scanner;

public class RemoveDuplicateDoublyLikedList {
    class node{
        int data;
        node prev;
        node next;
      }
    node head = null;
    node temp = head;
    void Insert( int ele ){
        node node = new node();
        node.data = ele;
        node.next = null;
        node.prev = null;
        if( head == null ){
            head = temp = node;
        }
        else{
            temp.next = node;
            node.prev = temp;
            temp = node;
        }
    }
    
     void Remove_Duplicate(){
        temp = head;
        while( temp.next != null ){
            if( temp.data == temp.next.data ){
                deletenode( head , temp.next );
            }
            else{
                temp = temp.next;
            }
        }   
    }
    static void deletenode(node head,node delete){
        if( head == delete ){
            head = delete.next;
        }
        if( delete.next != null ){
            delete.next.prev = delete.prev;
        }
        if( delete.prev != null ){
            delete.prev.next = delete.next;
        }
    }
     void display(){
           temp = head;
           while( temp.next != null ){
               System.out.print( " "+temp.data );
               temp = temp.next;
           }
           System.out.println();
       }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        RemoveDuplicateDoublyLikedList rd = new RemoveDuplicateDoublyLikedList();
        int ch1 = 1; 
        do{
        System.out.println("1:Insert Data");
        System.out.println("2:Remove duplicate");
        System.out.println("3:Display Data");
         ch1 = sc.nextInt();
         int ch = 1;
           switch( ch1 ){
               case 1:
               do{
                   switch( ch ){
                       case 1:
                       System.out.println("Enter data:");
                        rd.Insert(sc.nextInt());
                        System.out.println("To Continue insertion :1/0");
                        ch = sc.nextInt();
                        break;
                   }
                 }while( ch != 0 );
               break;
               
            case 2:
                
                 rd.Remove_Duplicate();
                break;
               case 3:
                  rd.display();
           }  
        }while( ch1 != 0 );
    }     
}

         