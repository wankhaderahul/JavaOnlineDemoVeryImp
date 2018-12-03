package com.list;

// Abstract Data Type -->Collection of Object --> Array List, Linked List(Collection of elememt-every element linked each other)

public class LinkedList {

	
	Node head;
	
	public void add(int data) {
		
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			
			head=node;
		}
		
		else {
			
			Node n=head;
			while(n.next!=null) {
				n=n.next;
				
			}
			n.next=node;
			
		}
	}
	
	public void get() {
		Node n=head;
		
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
			
		}
		System.out.println(n.data);
	}
	
	public void insertAtStart(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	
	public void add(int index,int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(index==0) {
			insertAtStart(data);
		}
		else {
		Node n=head;
		
		for(int i=0;i<index-1;i++) {
			
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}
	}
	
	public void remove(int index) {
		
		if(index==0) {
			head=head.next;
		}
		else {
			Node n=head;
			Node n1=null;
			
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			//System.out.println(" n1 deleted : "+n1.data);
			n1=null;
		}
	}
}
