//https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem
package QueueAndHashing;

import java.util.Scanner;
import java.util.Stack;

public class ATailOfTwoStacks {

    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<>();
        Stack<T> stackOldestOnTop = new Stack<>();

        public void enqueue(T value) { 
             stackNewestOnTop.push(value);
        }

        public T peek() {
            previousElement();
           return stackOldestOnTop.peek();  
        }

        public T dequeue() {
            previousElement();
            return stackOldestOnTop.pop();
        }
        public void previousElement(){
        if(stackOldestOnTop.isEmpty()){
              while(!stackNewestOnTop.isEmpty()) {
                  stackOldestOnTop.push(stackNewestOnTop.pop());
              } 
        }
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        System.out.println("Enter Number of Test Cases want to perform:");
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            
            for (int i = 0; i < n; i++) {
                System.out.println("1:Enqueue");
                System.out.println("2:Dequeue");
                System.out.println("3:Print");
         
                System.out.println("Enter your choice:");
                int operation = scan.nextInt();
                switch (operation) {
                    case 1:
                        // enqueue
                        queue.enqueue(scan.nextInt());
                        break;
                    case 2:
                        // dequeue
                        queue.dequeue();
                        break;
                    case 3:
                        // print peek
                        System.out.println(queue.peek());
                        break;
                    default:
                        break;
                }
            }
        }
    }
}

