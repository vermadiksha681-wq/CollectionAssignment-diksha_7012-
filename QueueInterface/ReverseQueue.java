/*Reverse the elements of a queue using only queue operations (e.g., add, remove, isEmpty).
Example:
Input: [10, 20, 30] → Output: [30, 20, 10]. */
package QueueInterface;
import java.util.*;
public class ReverseQueue {

    static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) return;
        int x = q.remove();
        reverse(q);
        q.add(x);
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        reverse(q);

        System.out.println(q);
    }
}
