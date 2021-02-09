package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine
{
    public static void main(String args[]) {
        
        Node root = new Node(10);
        root.left= new Node(20);
        root.right = new Node(30);
        
        root.left.left = new Node(40);
        root.left.right= new Node(50);
        
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        
        LevelOrderTraversalLineByLine traverseLineByLine = new LevelOrderTraversalLineByLine();
        traverseLineByLine.levelOrderTraversalLineByLine( root );
    }
    
    public void levelOrderTraversalLineByLine(Node root) {
        
        Queue<Node> queue = new LinkedList<>();
        queue.add( root );
        queue.add( null );
        
        while(queue.size() > 1) {
            
            Node tmp = queue.poll();
            if(tmp == null) {
                System.out.println(  );
                queue.add( null );
            }else {
                System.out.print( tmp.key +" ");
                
                if(tmp.left != null)
                    queue.add( tmp.left );
                
                if(tmp.right != null)
                    queue.add( tmp.right );
            }
        }
    }
}