package tree.binarytree;

public class ConvertBTreeToDll
{
    
    Node prev= null;
    public static void main(String args[]) {
        
        Node root = new Node(10);
        root.left= new Node(20);
        root.right = new Node(30);
        
        root.left.left = new Node(40);
        root.left.right= new Node(50);
        
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        
        ConvertBTreeToDll btreeToDll = new ConvertBTreeToDll();
        Node head = btreeToDll.convertBtreeToDll( root );
        btreeToDll.linkedListTraversal( head );
        
    }
    
    public Node convertBtreeToDll( Node root) {
        
        if(root == null)
            return root;
        
        Node head = convertBtreeToDll(root.left);
        
        if(prev == null) {
            head = root;
        }else {
            root.left = prev;
            prev.right = root;
        }
        
        prev= root;
        
        convertBtreeToDll(root.right);
        
        return head;
    }
    
    public void linkedListTraversal(Node head) {
        
        while(head != null) {
            System.out.print( head.key +" " );
            head = head.right;
        }
    }
}