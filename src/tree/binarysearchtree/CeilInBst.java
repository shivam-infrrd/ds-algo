package tree.binarysearchtree;

import tree.binarytree.Node;

public class CeilInBst
{
    
    public static void main(String args[]) {
        
        Node root = new Node( 50);
        CeilInBst ceilBst= new CeilInBst();
        ceilBst.insertRec( root, 30 );
        ceilBst.insertRec( root, 70 );
        ceilBst.insertRec( root, 40);
        ceilBst.insertRec( root, 60 );
        ceilBst.insertRec( root,  80);
        
        System.out.println( ceilBst.smallestLargestNode(root, 55).key  );
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
    
    Node smallestLargestNode( Node root, int key) {
        
        Node res = null;
        while(root != null) {
            
            if(root.key == key)
                return root;
            else if( root.key < key)
                root = root.right;
            else {
                res = root;
                root = root.left;
            }
        }
        
        return res;
    }
}