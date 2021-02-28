package tree.binarytree;

public class DiameterOfBinaryTree
{

    public static void main(String args[]) {
        
        Node root = new Node(10);
        root.left= new Node(20);
        root.right = new Node(30);
        
        root.left.left= new Node(40);
        root.left.right= new Node(50);
        
        root.right.left= new Node(60);
        root.right.right= new Node(70);
        
        DiameterOfBinaryTree bTreeDiameter = new DiameterOfBinaryTree();
        System.out.println( bTreeDiameter.diameter(root) );
    }
    
    public int diameter(Node root) {
        
        if(root == null)
            return 0;
        
        int d1  = (1 +height(root.left) +height (root.right));
        
        int dleft= diameter(root.left);
        int dright= diameter(root.right);
        
        return Integer.max( d1, Integer.max( dleft, dright ) );
    }
    
    public int height(Node root) {
        
        if(root == null)
            return 0;
        
        return 1 + Integer.max( height(root.left), height(root.right) );
    }
}
