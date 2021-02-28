package tree.binarysearchtree;

import tree.binarytree.Node;

public class BinarySearchTree
{

    Node root;
    
    public BinarySearchTree() {
        root = null;
    }
    
    void insert(int key) {
        root = insertRec(root, key);
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
    
    boolean search(Node root, int key) {
        
        if(root == null)
            return false;
        
        if(root.key == key)
            return true;
        
        if(root.key < key)
            return search( root.right, key );
        if(root.key > key)
            return search( root.left, key);
        
        return false;
    }
    
    void printInorder() {
        System.out.println();
        this.inorder(root);
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
