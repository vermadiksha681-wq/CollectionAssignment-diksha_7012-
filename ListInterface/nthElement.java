/*Find the Nth Element from the End
Given a singly linked list (use LinkedList), find the Nth element from the end 
without calculating its size.
Example:
Input: [A, B, C, D, E], N=2 → Output: D. */

import java.util.*;
public class nthElement {
    public static void main(String[] args) {
        LinkedList <String> num=new LinkedList();
        num.add("A");
        num.add("B");
        num.add("C");
        num.add("D");
        num.add("E");
        System.out.println("Input:"+num);

        int N=2;

        Queue<String>q=new LinkedList();
        for(String s:num){
            q.add(s);
            if(q.size()>N){
              q.remove();
            }
        }
        System.out.println("Output:"+q.peek());
    }
    
}
