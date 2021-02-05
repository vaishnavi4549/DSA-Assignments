//https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem

package DataStructures;
import java.io.*;
import java.util.*;

public class InsertNodeAtPositionLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
        void Display(){
            SinglyLinkedListNode temp = head;
            while(temp.next!=null){
                System.out.print(" "+temp.data);
                temp=temp.next;
            }
            System.out.println(" "+temp.data);
        }
    }
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    SinglyLinkedListNode node=new SinglyLinkedListNode(data);
    node.next=null;
    SinglyLinkedListNode temp;
    temp=head;
    if(position==0){
        head=node;
        return head;
    }
   for(int i=0;i<position-1;i++){
        temp=temp.next;
    }
    node.next=temp.next;
    temp.next=node;
    return head;
}


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
          SinglyLinkedList llist = new SinglyLinkedList();
          System.out.println("Enter Number of Elements:");
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }
        System.out.println("Enter data to be inserted:");
        int data = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        System.out.println("Enter Position where to insert data:");
        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);
        
        llist.Display();
     
    }
}

