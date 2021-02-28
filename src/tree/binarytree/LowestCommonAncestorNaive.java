package tree.binarytree;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestorNaive
{

    public static void main( String args[] )
    {
        Node root = new Node(10);
        root.left= new Node(20);
        root.right = new Node(30);
        
        root.left.left = new Node(40);
        root.left.right= new Node(50);
        
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        
        
        LowestCommonAncestorNaive naive = new LowestCommonAncestorNaive();
        System.out.println( naive.lca( root, 50, 70 ).key);
        
    }
    
    Node lca (Node root, int first, int second) {
        
        List<Node> path1 = new ArrayList<Node>();
        List<Node> path2 = new ArrayList<Node>();
        
        if( findPath( root, path1, 60 ) == false || findPath( root, path2, 50 ) == false)
            return null;
        
        for(int i=0; i< path1.size()-1 && i< path2.size()-1;i ++) {
            
            if(path1.get( i+1 ) != path2.get( i+1 ))
                return path1.get( i );
        }
        
        return null;
    }
    
    boolean findPath( Node root, List<Node> p, int n) {
        
        if( root == null)
            return false;
        
        p.add( root );
        if(root.key == n)
            return true;
        
        if( findPath( root.left, p, n ) || findPath( root.right, p, n ))
            return true;
        
        p.remove( p.size()-1 );
        
        return false;
    }
}