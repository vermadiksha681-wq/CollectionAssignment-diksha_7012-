/*Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a 
Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}. */

import java.util.*;

public class freqElements {
    public static void main(String args[]) {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        System.out.println("Input:" + fruits);

        Map<String, Integer> freq = new HashMap();

        for (String s : fruits) {
            Integer count = freq.get(s);
            if (count == null) {
                freq.put(s, 1);
            } else {
                freq.put(s, count + 1);
            }
        }

        System.out.println("Frequency of elements:" + freq);

    }
}
