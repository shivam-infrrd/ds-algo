package tree.binarysearchtree;

import tree.binarytree.Node;

public class TryIt
{
    
    public static void main(String args[]) {
        
        BinarySearchTree bSearch = new BinarySearchTree();
        Node root = new Node(1);

        bSearch.insertRec( root, 1 );
        bSearch.insertRec( root, 5 );
        bSearch.insertRec( root, 2 );
        bSearch.insertRec( root, 10 );
        bSearch.insertRec( root, 7 );
        bSearch.insertRec( root, 4 );

        bSearch.insertRec( root, 9 );
        
        bSearch.inorder( root );
        
        System.out.println( bSearch.search( root, 5 ));
    }
}
