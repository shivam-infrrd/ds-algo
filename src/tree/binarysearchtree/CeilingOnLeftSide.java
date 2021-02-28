package tree.binarysearchtree;

import java.util.TreeSet;

public class CeilingOnLeftSide
{
    
    public static void main(String args[]) {
        
        int[] arr = { 10, 5, 11, 10, 20, 12 }; 
        int n = arr.length; 
        printPrevGreater(arr, n); 
    }
    
    static void printPrevGreater(int[] arr, int n) 
    { 
        TreeSet<Integer> ts = new TreeSet<>(); 
        for (int i = 0; i < n; i++) { 
            Integer c = ts.ceiling(arr[i]); 
            if (c == null) 
                System.out.print(-1 + " "); 
            else
                System.out.print(c + " "); 
            ts.add(arr[i]); 
        } 
    } 
}