package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree
{
    
    public static void main(String args[]) {
        
        Node root = new Node(10);
        root.left= new Node(20);
        root.right = new Node(30);
        
        root.left.left = new Node(40);
        root.left.right= new Node(50);
        
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        
        MaximumWidthOfBinaryTree maximumWidth = new MaximumWidthOfBinaryTree();
        System.out.println( maximumWidth.maxWidth( root ));
    }
    
    int maxWidth(Node root) {
        
        if(root == null)
               return 0;
        
        Queue<Node> queue = new LinkedList<>();
        
        queue.add( root );
        int res = 0;
        while(!queue.isEmpty()) {
            
            int size = queue.size();
            res = Integer.max( res, size );
            
            for(int i=0;i<size;i++) {
                
                Node current = queue.poll();
                if(current.left != null)
                    queue.add( current.left );
                if(current.right != null)
                    queue.add( current.right );
            }
        }
        
        return res;
    }
}