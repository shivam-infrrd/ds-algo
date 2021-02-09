package tree.binarytree;

public class CheckForBalancedTree
{
    
    public static void main(String args[]) {
        
        Node root = new Node(18);
        root.left= new Node(4);
        root.right= new Node(20);
        
        root.right.left= new Node(13);
        root.right.right = new Node(70);
        
        CheckForBalancedTree isBalanced = new CheckForBalancedTree();
        System.out.println( isBalanced.isBalanced( root ));
    }
    
    public int isBalanced(Node root) {
        
        if(root == null) {
            return 0;
        }
        
        int lh = isBalanced( root.left);
        if( lh == -1) return -1;
        int rh = isBalanced( root.right );
        if( rh == -1) return -1;
        
        if(Math.abs( lh - rh ) > 1 )
            return -1;
        else 
            return 1 + Math.max( lh, rh);
    }
}
