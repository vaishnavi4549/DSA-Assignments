// https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
package DataStructures;
import java.io.*;
import java.util.Scanner;

public class DeleteNodeLinkedList {

    
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
        
    }
    private static void printSinglyLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp=head;
        while(temp.next!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.print(" "+temp.data);
    }

    
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode temp;
        temp = null;
        SinglyLinkedListNode temp2 = null;
        temp=head;
        if(position==0){
            head=head.next;
        }
        for(int i=0;i<position-1;i++){
            temp=temp.next;
        }    
        temp2=temp.next;
        temp.next=temp2.next;
    
    return head;
}
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
         SinglyLinkedList llist = new SinglyLinkedList();
        System.out.println("Enter Number of elements:");
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }
        System.out.println("Enter position to delete elements:");
        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);
        
        printSinglyLinkedList(llist.head);
        
    }
}

