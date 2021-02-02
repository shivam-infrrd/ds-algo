package tree.binarytree;

public class TreeTraversal
{
    
    public static void main(String args[]) {
        
        Node root = new Node(10);
        root.left= new Node(20);
        root.right= new Node(30);
        
        TreeTraversal traversal = new TreeTraversal();
        System.out.println(  );
        
        traversal.inOrder( root );
        System.out.println(  );
        traversal.preOrder( root );
        System.out.println(  );
        traversal.postOrder( root );
    }
    
    public void inOrder(Node root) {
        
        if(root != null) {
            inOrder(root.left);
            System.out.print( root.key +" ");
            inOrder( root.right );
        }
    }
    
    public void preOrder(Node root) {
        if(root != null) {
            System.out.print( root.key +" ");
            preOrder( root.left );
            preOrder( root.right );
        }
    }
    
    public void postOrder(Node root) {
        
        if(root != null) {
            postOrder( root.left );
            postOrder( root.right );
            System.out.print( root.key +" ");
        }
    }
}
