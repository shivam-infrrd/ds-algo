package tree.binarytree;

public class HeightOfBinaryTree
{
    public static void main(String args[]) {
        
        Node root = new Node(10);
        root.left= new Node(20);
        root.right= new Node(30);
        
        root.left= new Node(40);
        
        HeightOfBinaryTree heightOfTree = new HeightOfBinaryTree();
        System.out.println( heightOfTree.height( root ));
    }
    
    public int height(Node root) {
        
        if(root != null) {
            return (1 + Integer.max( height( root.left ), height(root.right) ));
        }else {
            return 0;
        }
    }
}
