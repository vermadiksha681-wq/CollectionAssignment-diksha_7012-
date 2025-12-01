/*Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20]. */

import java.util.*;

public class rotateElements {
    public static void main(String args[]) {
        List<Integer> num = new ArrayList();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println("Input:" + num);

        int rotate = 2;
        List<Integer> rot = new ArrayList();
        for (int i = rotate; i < num.size(); i++) {
            rot.add(num.get(i));
        }

        for (int i = 0; i < rotate; i++) {
            rot.add(num.get(i));
        }

        System.out.println("Output:" + rot);
    }

}
