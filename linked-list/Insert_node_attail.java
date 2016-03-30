Node Insert(Node head,int data) 
{    
    Node n = new Node();
    n.data= data;
    n.next=null;
    
    if(head==null)
        head=n;
    else
	{
        Node temp = head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=n;
    }
    return head;
        
}
