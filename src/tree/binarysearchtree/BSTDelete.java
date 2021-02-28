package tree.binarysearchtree;

import tree.binarytree.Node;

public class BSTDelete
{
    
    public static void main( String args[]) {
        
        Node root = new Node( 50);
        BSTDelete delete= new BSTDelete();
        delete.insertRec( root, 30 );
        delete.insertRec( root, 70 );
        delete.insertRec( root, 40);
        delete.insertRec( root, 60 );
        delete.insertRec( root,  80);
        

        delete.inorder( root );
        System.out.println(  );
        delete.deleteNode( root, 50 );
        delete.inorder( root );
    }
    
    Node insertRec(Node root, int key) {
            
            if(root == null) {
                root = new Node(key);
            }
            
            if(key < root.key) {
                root.left = insertRec(root.left, key);
            }else if(key > root.key) {
                root.right = insertRec(root.right, key);
            }
            
            return root;
    }
    
    Node deleteNode(Node root, int x) {
        
        if( root == null)
            return null;
        
        if( root.key > x)
            root.left = deleteNode( root.left, x );
        else if( root.key < x)
            root.right = deleteNode( root.right, x );
        else {
            
            if(root.left == null)
                return root.right;
            else if ( root.right == null)
                return root.left;
            else {
                Node succ = inOrderSucc( root );
                root.key = succ.key;
                root.right = deleteNode( root.right, succ.key );
            }
            
            return root;
        }
        
        return root;
    }
    
    Node inOrderSucc( Node root) {
        Node curr = root.right;
        while(curr != null && curr.left != null)
            curr = curr.left;
        
        return curr;
    }
    
    void inorder(Node root) {
        
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);
        
    }
}
