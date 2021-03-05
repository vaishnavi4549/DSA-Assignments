//https://www.hackerrank.com/challenges/phone-book/problem
package QueueAndHashing;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookProblem {
	public static void main(String []argh)
	{
            Scanner sc = new Scanner(System.in);
            HashMap<String,Long> map=new HashMap<>();
            System.out.println("Enter Number of entries want to enter to Phonebook:");
            int n=sc.nextInt();
            sc.nextLine();
            String name="";long phone=0;
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter Name:");
		name = sc.nextLine();
                System.out.println("Enter Phone:");
                phone = sc.nextLong();
                sc.nextLine();
                map.put(name,phone);
            }
            System.out.println("Enter Names to Search Entry:");
            while( sc.hasNext() ){
            String s = sc.nextLine();
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}





