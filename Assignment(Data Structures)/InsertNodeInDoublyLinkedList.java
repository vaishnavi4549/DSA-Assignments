//https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem
package DataStructures;

import java.io.*;
import java.util.*;

public class InsertNodeInDoublyLinkedList {
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node) {
        DoublyLinkedListNode temp=node;
        while(temp.next!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.print(" "+temp.data);
        System.out.println();
    }

    
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
    DoublyLinkedListNode node = new DoublyLinkedListNode(data);
    DoublyLinkedListNode x = head;
    DoublyLinkedListNode temp = head;
    while( (x!=null) && (x.data<data) ){
        temp = x;
        x = x.next;
    }
    if(x == head){
        node.next = head;
        head.prev = node;
        head = node;
    }
    else if(x == null){
        temp.next = node;
        node.prev = temp;
        node.next = null;
        
    }
    else{
        temp.next = node;
        node.prev = temp;
        x.prev = node;
        node.next = x;
    }
    return head;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter number test cases:");
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter number of elements:");
        for (int tItr = 0; tItr < t; tItr++) {
            DoublyLinkedList llist = new DoublyLinkedList();
            
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

            DoublyLinkedListNode llist1 = sortedInsert(llist.head, data);

            printDoublyLinkedList(llist1);
            
        }

        scanner.close();
    }
}

