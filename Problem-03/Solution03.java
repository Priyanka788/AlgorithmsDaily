/*
This is a sample file explaining the format of your code. Do not make any changes to the file.
Author : <Pjj>
College : <GNE>
Year/Department : <3rd Year>/<CSE Department>
E-Mail Id : <p7889122486@gmail.com>

Insert Your Code Here
*/
class Node 
{ 
    int data; 
    Node next; 
    Node(int d) 
    { 
        data = d; 
        next = null; 
    } 
} 
  
class LinkedList 
{ 
    Node head; 
    
    public int GetNth(int index) 
    { 
        Node current = head; 
        int count = 0; 
        while (current != null) 
        { 
            if (count == index) 
                return current.data; 
            count++; 
            current = current.next; 
        } 
  
        assert(false); 
        return 0; 
    } 
  
    
    public void push(int new_data) 
    { 
	
        Node new_Node = new Node(new_data); 
  
        
        new_Node.next = head; 
  
       
        head = new_Node; 
    } 
  
   
    public static void main(String[] args) 
    { 
        
        LinkedList llist = new LinkedList(); 
  
        /* Use push() to construct below list 
           1->12->1->4->1  */
        llist.push(1); 
        llist.push(4); 
        llist.push(1); 
        llist.push(12); 
        llist.push(1); 
  
       
        System.out.println("Element at index 3 is "+llist.GetNth(3)); 
    } 
} 
