/* Linked List */

public class Node
{
    /*  **instance variables**
     Each node has an integer data variable and a next node */
    int data;
    Node next;

    //Constructor, one paramenter for data value
    public Node(int d)
    {
	data = d;
	next = null;
    }
    //Constructor, two parameters
    public Node(int d, Node nextNode)
    {
	data = d;
	next = nextNode;
    }
    public void setNext(Node nextNode)
    {
	next = nextNode;
    }
    public Node getNext()
    {
	return next;
    }
    public void append(Node head, Node newNode,  int d)
    {
	newNode = new Node(d);
	Node temp = head;
	while(temp.next != null){
	    temp = temp.next;
	}
	temp.next = newNode;
    }
    //Determine length of List
    public int length(Node head)
    {
	Node temp = head;
	int len = 0;
	while(temp != null){
	    len++;
	    temp = temp.next;
	}
	return len;
    }
    /* Can be called with any Node, must pass the head Node */
    public void printList(Node head)
    {
	Node temp = head;
	while(temp != null){
	    System.out.print(temp.data + " ");
	    temp = temp.next;
	}
	System.out.println();
    }
}