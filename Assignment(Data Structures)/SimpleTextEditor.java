
package DataStructures;
import java.util.*;

public class SimpleTextEditor {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int q = sc.nextInt();
        Stack<String> st = new Stack<String>();
        String s = "";
        st.push( s );
        do{
            System.out.println("1:Enter String");
            System.out.println("2:Delete String");
            System.out.println("3:Print String");
            System.out.println("4:Undo String");
            int t = sc.nextInt();
            switch(t){
                case 1:
                System.out.println("Enter String");
                s=s+(sc.next());
                st.push(s);
                break;
            
                case 2:
               System.out.println("Enter no of characters to delete from string:");
               s=s.substring(0,s.length()-sc.nextInt());
               st.push(s); 
                break;
                
                case 3:
               System.out.println("Enter index of character to print:");
               System.out.println(s.charAt(sc.nextInt()-1));
               break;
               
                case 4:
               st.pop();
               s=st.peek(); 
               break;           
        }
        q--;
    }while(q!=0);
}
}
