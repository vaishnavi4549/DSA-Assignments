/*https://www.geeksforgeeks.org/pairwise-swap-elements-of-a-given-linked-list/*/
package DataStructures;

import java.util.Scanner;

public class PairwiseSwap {

    class node{
        int data;
        node next;
    }
    node head = null;node temp=null;
    public void addnode(int data){
        node nod = new node();
        nod.data = data;
        if( head == null ){
            head = temp = nod;
            nod.next = null;
        }
        else{
           temp.next = nod;
           temp = nod;
        }
    }
    public void swap(){
        temp = head;
        
        while( temp.next != null){
        int x = temp.data;
        temp.data = temp.next.data;
        temp.next.data = x;   
        temp = temp.next.next;
        }         
    }
    public void display(){
        temp = head;
        while( temp.next != null ){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
        System.out.println(" "+temp.data);   
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        PairwiseSwap ps = new PairwiseSwap();
        System.out.println("Enter No of ele:");
        int n = sc.nextInt();
        for(int i = 0;i < n; i++){
            System.out.println("Enter data:");
            ps.addnode(sc.nextInt());
        }
        ps.display();
        ps.swap();
        ps.display();
    }
}
