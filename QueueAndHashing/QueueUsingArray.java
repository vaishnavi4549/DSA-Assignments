//https://www.google.com/amp/s/www.geeksforgeeks.org/array-implementation-of-queue-simple/amp/
package QueueAndHashing;

import java.util.Scanner;

public class QueueUsingArray {
    int front,rear;
    int[] queue;int size;
    QueueUsingArray(int n){
      queue = new int[n];
      front = rear = 0;
      size=n;
    }
    public void enqueue(int data){
        if(rear==size){
            System.out.println("Queue is full");
        }
        else{
            queue[rear]=data;
            rear++;
        }
    }
    public void dequeue(){
        if(front==rear){
            System.out.println("Queue is Empty");
        }
        else{
            for(int i=0;i<rear-1;i++){
                queue[i]=queue[i+1];
            }
            rear--;
        }
    }
    public void display(){
        if(front==rear){
            System.out.println("Queue is Empty");
        }
        for(int i=front;i<=rear-1;i++){
            System.out.print(queue[i]+"-");
        }
        System.out.println();
    }
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of ele:");
      int n=sc.nextInt();
      QueueUsingArray q1=new QueueUsingArray(n);
      int ch;
      do{
      System.out.println("1:Enqueue");
      System.out.println("2:Dequeue");
      System.out.println("3:Display");
      System.out.println("0:Exit");
      System.out.println("Enter choice:");
      ch=sc.nextInt();
      switch(ch){
          case 1:
              System.out.println("Enter data:");
             q1.enqueue(sc.nextInt()); 
             break;
          case 2:
              q1.dequeue();
              break;
          case 3:
              q1.display();
              break;
      }
      }while(ch!=0);
  }  
}
