package tree.binarytree;

public class ChildrenSumProperty
{
    
    public static void main(String args[]) {
        
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        
        root.left.left= new Node(3);
        root.left.right = new Node(5);
        
        ChildrenSumProperty bTree = new ChildrenSumProperty();
        
        System.out.println( bTree.isFollowChildrenSumProperty(root));
    }
    
    public boolean isFollowChildrenSumProperty(Node root) {
        
        if(root == null) return true;
        if(root.left == null && root.right == null)
               return true;
        
        int sum = 0;
        if(root.left != null)
                sum += root.left.key;
        if(root.right != null)  
                sum += root.right.key;
        
        return (root.key == sum && isFollowChildrenSumProperty( root.left ) && isFollowChildrenSumProperty( root.right ) );
    }
}