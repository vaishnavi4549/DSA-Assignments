// https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
package DataStructures;
import java.util.*;
public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void enqueue(int x){
        while( ! s1.isEmpty()){
         s2 . push ( s1.pop() );
        }
        s1 . push ( x );
        while( ! s2.isEmpty() ){
            s1.push( s2.pop() );
        }
    }
    void dequeue(){
        if( s1.isEmpty() ){
            return;
        }
        int data = s1.peek();
        s1 . pop();
    }
    int show(){
        return s1.peek();
    }
    public static void main(String[] args) {
        QueueUsingStack s = new QueueUsingStack();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
        System.out.println("1:Enqueue");
        System.out.println("2:Dequeue");
        System.out.println("3:Print");
        System.out.println("0:exit");
        System.out.println("Enter choice:");
        choice = sc . nextInt();
        switch( choice ){
            case 1:
                s . enqueue( sc . nextInt() ) ;
                break ;
            case 2:
            s . dequeue();
            break;
            case 3:
            System.out.println(s.show());
            break;
        }
        }while(choice!=0);          
        }
     
    }

