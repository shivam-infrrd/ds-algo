package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal
{
    
    public static void main(String args[]) {
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        
        root.left.left = new Node(40);
        root.left.right=  new Node(50);
        
        LevelOrderTraversal level = new LevelOrderTraversal();
        level.doLevelOrderTraversal(root);
        
    }
    
    public void doLevelOrderTraversal(Node root) {
        
        Queue<Node> queue = new LinkedList<>();
        queue.add( root );
        while(!queue.isEmpty()) {
           Node tmp = queue.poll();
           System.out.println( tmp.key );
           
           if(tmp.left != null)
           queue.add( tmp.left );
           if(tmp.right != null)
           queue.add( tmp.right );
        }
    }
}
