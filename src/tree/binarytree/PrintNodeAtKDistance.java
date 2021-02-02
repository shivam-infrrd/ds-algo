package tree.binarytree;

public class PrintNodeAtKDistance
{
    public static void main(String args[]) {
        
        Node root = new Node(10);
        root.left= new Node(20);
        root.right= new Node(30);
        
        root.left.left= new Node(40);
        root.left.right= new Node(50);
        
        PrintNodeAtKDistance printNodeAtKDistance = new PrintNodeAtKDistance();
        printNodeAtKDistance.printKElement( root, 2 );
    }
    
    public void printKElement(Node root, int k) {
        
        if(root == null)
            return;
        
        if(k ==0) {
            System.out.println( root.key );
        }
        else {
            printKElement(root.left, k-1);
            printKElement( root.right, k-1 );
        }
    }
}
