//https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem

package DataStructures;
import java.io.*;
import java.util.*;

public class InsertNodeAtTailLinkedList{

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

        public SinglyLinkedList() {
            this.head = null;
        }

        private void Display(SinglyLinkedListNode head) {
            SinglyLinkedListNode temp;
        temp=head;
        while(temp.next!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.println(" "+temp.data);
        }
      
    }
 
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode node=new SinglyLinkedListNode(data);
    node.next = null;
    if( head == null){
        head= node;
        return head;
    }
    SinglyLinkedListNode temp;
    temp = head;
    while( temp.next != null){
            temp = temp.next;
        }
    temp.next = node;
   return head;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        SinglyLinkedList llist = new SinglyLinkedList();
        System.out.println("Enter Number of elements to enter:");
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
          
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);
          llist.head = llist_head;
          llist.Display(llist.head);
        }
        scanner.close();
    }
}
