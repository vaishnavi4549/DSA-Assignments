// https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem

package DataStructures;
import java.io.*;
import java.util.*;

public class ReverseLinkedList {
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

    public static void printSinglyLinkedList(SinglyLinkedListNode head) {
       SinglyLinkedListNode temp = head;
        while( temp.next != null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
        System.out.print(" "+temp.data);
        System.out.println();
    }


    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    SinglyLinkedListNode next ,current,previous;
    current = head;
    previous = null;
    while( current != null){
        next = current.next;
        current.next = previous; 
        previous = current;
        current = next;      
    }
    head = previous;
    return head;
}


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
         System.out.println("Enter Number of Test Cases:");
         int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist = new SinglyLinkedList();
            System.out.println("Enter Number of elements:");
            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }

            SinglyLinkedListNode llist1 = reverse(llist.head);

            printSinglyLinkedList(llist1);
            
        }
        scanner.close();
    }
}
