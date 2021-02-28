package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversalInSpiral
{
    
    public static void main(String args[]) {
        
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        
        root.right.left= new Node(6);
        root.right.right= new Node(7);
        
        TreeTraversalInSpiral treeTraversal = new TreeTraversalInSpiral();
        treeTraversal.printSpiral(root);
    }
    
    public void printSpiral(Node root) {
        
        if(root == null)
           return;
        
        Queue<Node> queue = new LinkedList<Node>();
        
        Stack<Integer> tmpStack = new Stack<Integer>();
        
        boolean reverse = false;
        queue.add( root );
        
        while(!queue.isEmpty()) {
            
            int size = queue.size();
            for(int i=0;i<size;i++) {
                
                Node pop = queue.poll();
                if(reverse) {
                    tmpStack.push( pop.key );
                }
                else {
                    System.out.print( pop.key+ " " );
                }
                
                if(pop.left != null)
                    queue.add( pop.left );
                if(pop.right != null)
                    queue.add( pop.right );
            }
            
            if(reverse == true) {
                while(tmpStack.isEmpty() == false)
                    System.out.print( tmpStack.pop()+" ");
            }
            reverse = !reverse;
            System.out.println(  );
        }
    }
}
