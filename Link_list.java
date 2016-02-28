
public class Link_list{
int data;
Link_list next = null;

Link_list(int d)
{
	data = d;
	
}
public void append_tail(int d)
{
	Link_list l = new Link_list(d);
	Link_list n = this;
	while(n.next!=null)
	{
		n =n.next;
	}
	n.next = l;
	
}
public Link_list delete(Link_list head,int d)
{
	Link_list n =head;
	if(n.data == d)
		return head.next;
	
	while(n.next!=null)
	{
		if(n.next.data==d)
		{
			n.next = n.next.next;
			return head;
		}
		n = n.next;
	}
	return head;
	
}
}
