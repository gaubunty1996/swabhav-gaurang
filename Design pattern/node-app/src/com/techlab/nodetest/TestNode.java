package com.techlab.nodetest;

import com.techlab.node.Node;

public class TestNode {
	public static void main(String[] args) {
		Node<Integer> node1 = new Node<Integer>();
		node1.setData(10);
		Node<Integer> node2 = new Node<Integer>();
		node2.setData(20);
		Node<Integer> node3 = new Node<Integer>();
		node3.setData(30);

		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(null);
		printDetails(node3);

	}
	
	public static <T> void printDetails(Node<T> node) {
		Node<T> tempVariabe=node;
		while(tempVariabe!=null) {
			System.out.println(tempVariabe.getData());
			tempVariabe=tempVariabe.getNext();
		}
	}
}
