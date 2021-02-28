package tree.binarytree;

public class CustomDoublyLinkedList
{
    
    LinkedListNode head;
    LinkedListNode end;
    
    public void add(int data) {
        
        LinkedListNode newNode = new LinkedListNode(data);
        
        newNode.prev= null;
        newNode.next = head;
        
        if(head == null)
            end = newNode;
        else
            head.prev= newNode;
        
        head = newNode;
    }
    
    public void addEnd(int data) {
        
        LinkedListNode newNode = new LinkedListNode(data);
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
        
        LinkedListNode tmp = head;
        while(tmp != null) {
            System.out.println( tmp.data );
            
            tmp = tmp.next;
        }
    }
}
