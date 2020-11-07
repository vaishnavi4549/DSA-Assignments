/*
Problem Statement: https://www.hackerrank.com/challenges/caesar-cipher-1
*/
package ProblemSolvingArrayString;

import java.util.*;

public class CaesarCipher {
    public static void main(String[] args) {
            int num;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String:");
            String str = sc.next();
            System.out.println("Enter Key For Encryption:");
            int k = sc.nextInt();
            StringBuffer sb = new StringBuffer(str);
            for(int i=0;i< str.length();i++){
                char ch;
                ch = str.charAt(i);
                if((int)ch >= 65 && (int)ch <= 90)//type casting
                {
                    num = (int)ch + k;
                    if(num > 90){
                        num = 64 + num - 90;
                    }                   
                    sb.setCharAt(i, (char)num);
                }
                if((int)ch >= 97 && (int)ch <= 122)
                {
                    num = (int)ch + k;
                    if(num > 122){
                        num = 96 + num - 122;
                    }
                    
                    sb.setCharAt(i, (char)num);
                }
            }
            System.out.println("Caesar Cipher: "+sb);
        }
    }

