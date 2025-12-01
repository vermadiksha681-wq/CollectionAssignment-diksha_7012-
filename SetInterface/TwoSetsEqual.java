/*Check if Two Sets Are Equal
Compare two sets and determine if they contain the same elements, regardless of order.
Example:
Set1: {1, 2, 3}, Set2: {3, 2, 1} → Output: true.
*/

package SetInterface;

import java.util.HashSet;

public class TwoSetsEqual {
    public static void main(String[] args) {

        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        s1.add(1);
        s1.add(2);
        s1.add(3);

        s2.add(3);
        s2.add(2);
        s2.add(1);

        boolean result = s1.equals(s2);

        System.out.println("Are both sets equal? " + result);  
    }
}

