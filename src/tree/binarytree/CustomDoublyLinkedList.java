package tree.binarytree;

public class CustomDoublyLinkedList
{
    
    Node head;
    Node end;
    
    class Node{
        
        Node prev;
        Node next;
        int data;
        
        Node(int data){
            this.data = data;
        }
    }
    
    public void add(int data) {
        
        Node newNode = new Node(data);
        
        newNode.prev= null;
        newNode.next = head;
        
        if(head == null)
            end = newNode;
        else
            head.prev= newNode;
        
        head = newNode;
    }
    
    public void addEnd(int data) {
        
        Node newNode = new Node(data);
        newNode.next= null;
        
        if(end == null) {
            head = newNode;
        }else {
            newNode.prev= end;
            end.next= newNode;
        }
        
        end = newNode;
    }
    
    public void display() {
        
        Node tmp = head;
        while(tmp != null) {
            System.out.println( tmp.data );
            
            tmp = tmp.next;
        }
    }
}
