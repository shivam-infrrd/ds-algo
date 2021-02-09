package tree.binarytree;

public class LeftViewOfBinaryTree
{
    int maxLevel= 0;
    public static void main(String args[]) {
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        
        root.left.left= new Node(40);
        root.left.right = new Node(50);
        
        LeftViewOfBinaryTree bTree = new LeftViewOfBinaryTree();
        
        bTree.printLeftView(root , 1);
    }
    
    public void printLeftView(Node root, int level) {
        
        if(root == null)
            return;
        
        if(maxLevel < level) {
            System.out.print( root.key +" ");
            maxLevel = level;
        }
        
        printLeftView( root.left, level +1 );
        printLeftView( root.right, level +1 );
    }
}
