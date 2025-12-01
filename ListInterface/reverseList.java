/*Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. 
Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].*/

//using array list
/* 
import java.util.*;
public class reverseList{
    public static void main(String args[]){
        List<Integer>num=new ArrayList();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println("Original list:"+num);

        List<Integer>rev=new ArrayList();
        for(int i=num.size()-1;i>=0;i--){
            rev.add(num.get(i));

        }
            System.out.println("Reversed list:"+rev);

        }
    }
        */

//using linked list
import java.util.*;

public class reverseList {
    public static void main(String args[]) {
        List<Integer> num = new LinkedList();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println("Original list:" + num);

        List<Integer> rev = new LinkedList();
        for (int i = num.size() - 1; i >= 0; i--) {
            rev.add(num.get(i));
        }
        System.out.println("Reversed list:" + rev);
    }
}