/* Convert Decimal to Binary 
*  insert remainders into list
*  MSD will be at beginning of list
*  when done and LSD will be at the end 
*  Enter integer to be converted at 
*  command line.
*  Usage: java DecToBin [integer]
*/
import java.util.*;

public class DecToBin
{
    public static void main(String args[])
    {
	//number to be converted to binary
	int n = Integer.parseInt(args[0]);
	//remainder
	int r =  n % 2;
	//create empty list
	Node head = null;
	Node p = new Node(r);
	//insert LSD list
	p.next = head;
	head = p;
	//quotient
	int q = n / 2;
	//reassign n for next modulos operation
	n = q;
	while(q > 0){
	    r = n % 2;
	    p = new Node(r);
	    //next 2 lines prepend r to list
	    p.next = head;
	    head = p;
	    q = n / 2;
	    n = q;
	}
	head.printList(head);
    }
}