/*Implement a circular buffer (fixed-size queue) using an array-based queue. 
When full, overwrite the oldest element.
Example:
Buffer size=3: Insert 1, 2, 3 → Insert 4 → Buffer: [2, 3, 4]. */

package QueueInterface;
import java.util.*;
public class BufferSimulation {
    int arr[];
    int size;
    int front = 0;   
    int count = 0;   

    BufferSimulation(int size) {
        this.size = size;
        arr = new int[size];
    }

    void add(int x) {

        int pos = (front + count) % size;  

        arr[pos] = x;

        if (count < size) {
            count++;
        } else {
            front = (front + 1) % size;  
        }
    }

    void printBuffer() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        BufferSimulation cb = new BufferSimulation(3);

        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.printBuffer();   

        cb.add(4);         
        cb.printBuffer();   

        cb.add(5);          
        cb.printBuffer();   
    }
}
 

