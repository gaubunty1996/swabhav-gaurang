package com.techlab.prolinkedlist;

import java.util.Iterator;

public class LinkedList<T>  {
	private Node head;
	//private Node<T> first = new Node<T>(null);

	public LinkedList(T t) {
		head = new Node(t);
		
	}

	public void display() {
		Node current = head;
		while (current.getNext() != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
		System.out.println(current.getData());
	}

	public void add(T d) {
		Node current = head;
		Node end = new Node(d);

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(end);
	}
	 public void removeByData(T d){
	    	Node currentNode = head;
	    	
	        while(currentNode.getNext()!=null){
	            if(currentNode.getNext().getData()==d){
	                currentNode.setNext(currentNode.getNext().getNext());
	                
	            }
	            currentNode = currentNode.getNext();
	        }
	        
	    }



}