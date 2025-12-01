/*Union and Intersection of Two Sets
Given two sets, compute their union and intersection.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Union: {1, 2, 3, 4, 5}, Intersection: {3}. */
package SetInterface;
import java.util.HashSet;
class UnionIntersection  {
    public static void main(String[] args) {
        HashSet<Integer>s1=new HashSet<>();
        HashSet<Integer>s2=new HashSet<>();

        s1.add(10);
        s1.add(20);
        s1.add(30);

        s2.add(30);
        s2.add(40);
        s2.add(50);

        HashSet<Integer> union=new HashSet(s1);
        union.addAll(s2);

        HashSet<Integer> intersection=new HashSet(s1);
        intersection.retainAll(s2);

        System.out.println("Set 1:"+s1);
        System.out.println("Set 2:"+s2);
        System.out.println("Union:"+union);
        System.out.println("Intersection:"+intersection);


    }
    
}
