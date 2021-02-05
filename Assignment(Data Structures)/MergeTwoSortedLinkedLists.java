//https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
package DataStructures;
import java.io.*;
import java.util.*;
public class MergeTwoSortedLinkedLists {

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
       SinglyLinkedListNode temp=node;
        while(temp.next!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.print(" "+temp.data);
        System.out.println();
    }

   static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode temp1 = head1 , temp2 = head2;
         if ( head1.data > head2.data ) {
            SinglyLinkedListNode tmp = head2;
            head2 = head1;
            head1 = tmp;
        }
        temp1 = head1;
        while( temp1.next != null )
        {
            temp1 = temp1.next;
        }
        temp1.next = head2;
        temp1 = head1;
        
        SinglyLinkedListNode next;
        while( temp1.next!= null){
            next = temp1.next;
            while( next != null){
            if( temp1.data >= next.data){
                int x;
                x = next.data;
                next.data = temp1.data;
                temp1.data = x;
            }
            next = next.next;
            }
            temp1 = temp1.next;
        }
        return head1;
}



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter Number of test cases:");
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();
            System.out.println("Enter number of elements in list1:");
            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }
          
            SinglyLinkedList llist2 = new SinglyLinkedList();
            System.out.println("Enter number of elements in list2:");
            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);
            printSinglyLinkedList(llist3);
        }

        scanner.close();
    }
}

