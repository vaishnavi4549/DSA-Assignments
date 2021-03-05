//https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
package QueueAndHashing;
import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Stack<Integer> front=new Stack<>();
        Stack<Integer> rear =new Stack<>();
        int q;
        System.out.println("Enter number of test cases:");
        q = sc.nextInt();
        do{
        System.out.println("1:Enqueue");
        System.out.println("2:Dequeue");
        System.out.println("3:Print");
        System.out.println("0:exit");
        System.out.println("Enter choice:");
        
            int ch = sc.nextInt();
            if(ch == 1){
                int x = sc.nextInt();
                rear.push(x);
            }
            else{
                if(front.isEmpty()){
                    while( !rear.isEmpty()){ 
                    front.push( rear.peek() );
                    rear.pop();
                    }
                }
                if(!front.isEmpty()){
                    if(ch == 2){
                        front.pop();
                    }
                    if(ch == 3){
                       System.out.println(front.peek()); 
                    }
                }
            }
            
        }while( q != 0 );
    }
}

