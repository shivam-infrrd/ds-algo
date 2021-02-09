package array;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EvenSUm
{
    public static void main(String args[]) {
        
        int[] a = {2, 3, 4};
        System.out.println( solve (a) );
    }
    
    public static int solve(int[] A) {
        
        int sum = 0;
        LinkedHashSet<Integer> hm = new LinkedHashSet();
        for (int i = 0; i < A.length; i++) {
          hm.add(A[i]);
        }
        Iterator<Integer> lm = hm.iterator();
        while (lm.hasNext()) {
          int b = lm.next();
          if (b % 2 == 0)
            sum = sum + b;
        }
        return sum;
        
    }
}
