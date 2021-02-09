package tree.binarytree;

public class MaximumOfBinaryTree
{
    
    public static void main(String args[]) {
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        
        root.left.left= new Node(40);
        root.left.right = new Node(50);
        
        MaximumOfBinaryTree bTree = new MaximumOfBinaryTree();
        
        System.out.println( bTree.findMaximum(root) ); 
    }
    
    public int findMaximum(Node root) {
        
        if(root == null)
            return 0;
        
        return Math.max(root.key, Math.max( findMaximum( root.left ), findMaximum( root.right )));
    }
}
