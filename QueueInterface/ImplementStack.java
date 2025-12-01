/*Implement a stack data structure using two queues and support push, pop, 
and top operations.
Example:
Push 1, 2, 3 → Pop → Output: 3. */

package QueueInterface;
import java.util.*;
public class ImplementStack {
   
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q1.add(x);
    }

    int pop() {
        if (q1.isEmpty()) return -1;

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int val = q1.remove();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return val;
    }

    int top() {
        if (q1.isEmpty()) return -1;

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int val = q1.remove();
        q2.add(val);

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return val;
    }

    public static void main(String[] args) {

        ImplementStack st = new ImplementStack();

        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}

 