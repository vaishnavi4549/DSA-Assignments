/*https://www.geeksforgeeks.org/swap-kth-node-from-beginning-with-kth-node-from-end-in-a-linked-list/*/
package DataStructures;
import java.util.Scanner;
public class SwapBeginningandEndElement {
   
    class node{
       int data;
       node next;
    }
    node temp=null;node head=null;node temp2=head;
    int cnt=0;
    void create(int ele){
       node node=new node();
       node.data=ele;
       node.next=null;
       
       if(head==null){
           head=temp=node;
           cnt++;
       }
       else{
           temp.next=node;
           temp=node;
           cnt++;
       }
    }
    void swap(int k){
       temp=head;
       int i=1;node x = null;

       while(i<k){
           x=temp;
           temp=temp.next;
           i++;
       }
       i=1;
       temp2=head;node y = null;
       while(i<(cnt-k+1)){
           y=temp2;
           temp2=temp2.next;
           i++;
       }
       if(x!=null){
           x.next=temp2;
       }
       if(y!=null){
           y.next=temp;
       }
       node p=temp.next;
       temp.next=temp2.next;
       temp2.next=p;
       if(k==1){
           node c=temp.next;
           c=temp.next;
           temp2.next=c;
           head=temp2;
           y.next=temp;
           y.next.next=null;
       }
       if(k==cnt){
          head=temp2;
       }
       
    }
    void display(){
        temp=head;
        while(temp.next!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.print(" "+temp.data);
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int ch1;
        
        SwapBeginningandEndElement sp=new SwapBeginningandEndElement();
        do{
        System.out.println("1:Insert Data");
        System.out.println("2:Swap Beginning and End");
        System.out.println("3:Display Data");
         ch1=sc.nextInt();
         int ch=1;
           switch(ch1){
               case 1:
               do{
                   switch(ch){
                       case 1:
                       System.out.println("Enter data:");
                        sp.create(sc.nextInt());
                        System.out.println("To Continue insertion :1/0");
                        ch=sc.nextInt();
                        break;
                   }
                 }while(ch!=0);
               break;
               
            case 2:
                System.out.println("Enter Positon for swapping element :");
                int k=sc.nextInt();
                 sp.swap(k);
                break;
               case 3:
                  sp.display();
           }  
        }while(ch1!=0);
       
    }
}
