package tree.binarysearchtree;

import tree.binarytree.Node;

public class FloorInBst
{
    
    public static void main(String args[]) {
        
        Node root = new Node( 50);
        FloorInBst floorBst= new FloorInBst();
        floorBst.insertRec( root, 30 );
        floorBst.insertRec( root, 70 );
        floorBst.insertRec( root, 40);
        floorBst.insertRec( root, 60 );
        floorBst.insertRec( root,  80);
        
        System.out.println( floorBst.largestSmallestNode(root, 55).key  );
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
    
    void inorder(Node root) {
        
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);
        
    }
    
    Node largestSmallestNode( Node root, int key) {
        
        Node res = null;
        while(root != null) {
            
            if(root.key == key)
                return root;
            else if( root.key > key)
                root = root.left;
            else {
                res = root;
                root = root.right;
            }
        }
        
        return res;
    }
}
