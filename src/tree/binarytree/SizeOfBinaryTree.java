package tree.binarytree;

public class SizeOfBinaryTree
{
    
    public static void main(String args[]) {
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        
        root.left.left= new Node(40);
        root.left.right = new Node(50);
        
        SizeOfBinaryTree bTree = new SizeOfBinaryTree();
        
        System.out.println( bTree.sizeOfBinaryTree(root) ); 
    }
    
    public int sizeOfBinaryTree( Node root) {
        
        if( root == null)
               return 0;
        
        return 1+ sizeOfBinaryTree( root.left ) + sizeOfBinaryTree( root.right );
    }
}
