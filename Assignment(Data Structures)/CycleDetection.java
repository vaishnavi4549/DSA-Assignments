// https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
package DataStructures;
import java.io.*;
import java.util.*;

public class CycleDetection {
   
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

    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        SinglyLinkedListNode temp = node;
        
        while( temp.next != null ){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
        System.out.print(" "+temp.data);
        System.out.println();
    }

  
    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode slow,fast;
        slow = fast = head;
        
        while( true ){
            slow = slow.next;
            if(slow == null){
                return(false);
            }
            if(fast.next != null){
             fast = fast.next.next;
            }
            else{
                return false;
            }
            if(slow == fast){
                return true;
            }
            if(slow == null || fast == null){
                return false;
            }
            
        }
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter number of test cses:");
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            System.out.println("Enter starting index:");
            int index = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            SinglyLinkedList llist = new SinglyLinkedList();
            System.out.println("Enter number of elements:");
            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }
          
          	SinglyLinkedListNode extra = new SinglyLinkedListNode(-1);
            SinglyLinkedListNode temp = llist.head;

            for (int i = 0; i < llistCount; i++) {
                if (i == index) {
                    extra = temp;
                }

                if (i != llistCount-1) {
                    temp = temp.next;
                }
            }
      
      		temp.next = extra;

            boolean result = hasCycle(llist.head);
            System.out.println(result);
        }

        scanner.close();
    }
}

