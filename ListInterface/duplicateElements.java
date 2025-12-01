/*Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4]. */

import java.util.*;

public class duplicateElements {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList();
        num.add(3);
        num.add(1);
        num.add(2);
        num.add(2);
        num.add(3);
        num.add(4);
        System.out.println("Elements:" + num);

        List<Integer> newNum = new ArrayList();

        for (int i = 0; i < num.size(); i++) {
            int count = 0;
            for (int j = 0; j < newNum.size(); j++) {
                if (num.get(i) == newNum.get(j)) {
                    count++;
                }
            }
            if (count == 0) {
                newNum.add(num.get(i));

            }

        }
        System.out.println(newNum);

    }
}
