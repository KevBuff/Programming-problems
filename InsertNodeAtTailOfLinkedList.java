
public class InsertNodeAtTailOfLinkedList {
	
	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as */
	
	  class Node {
	     int data;
	     Node next;
	  }
	
	Node Insert(Node head,int data) {
	// This is a "method-only" submission. 
	// You only need to complete this method. 
		Node realHead=head;
		if(head==null){
		head.data=data;
		head.next=new Node();
		}
		else{
			while(head.next!=null){
				head=head.next;
			}
			
			head.next.data=data;
			head.next.next=null;
		}
		return realHead;
	  
	}

}
