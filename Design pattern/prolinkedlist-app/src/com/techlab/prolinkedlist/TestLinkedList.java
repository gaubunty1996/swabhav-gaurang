package com.techlab.prolinkedlist;

import java.util.Iterator;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
				
		LinkedList<Integer> linkedlist = new LinkedList(10);
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.add(40);
		linkedlist.add(50);
		linkedlist.display();
		System.out.println("\n");

		LinkedList<String> linkedlist1 = new LinkedList("z");
		linkedlist1.add("a");
		linkedlist1.add("b");
		linkedlist1.add("c");
		linkedlist1.add("d");
		linkedlist1.display();
		System.out.println("\n");
		linkedlist.removeByData(30);
		linkedlist.removeByData(40);
		linkedlist.display();
		Student student1=new Student("Gaurang");
		Student student2=new Student("Ajay");
		Student student3=new Student("Prachit");
		Student student4=new Student("Vinod");
		Student student5=new Student("Kuntan");
		LinkedList<Student>student = new LinkedList<Student>(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		student.add(student5);
		
		student.display();

	}
}
