Node Insert(Node head,int x) 
{
    Node n = new Node();
    n.data= x;
    n.next= null;
	
    if(head==null)
        return n;
    else
	{
        n.next=head;
        return n;
    }   
}
