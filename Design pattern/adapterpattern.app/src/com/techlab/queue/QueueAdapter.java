package com.techlab.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class QueueAdapter<T> implements Iterable<T>{
	private LinkedList<T> queue = new LinkedList<T>();

	public void enqueue(T number) {
		queue.addLast(number);
	}


	public T dequeue(T number) {
		return  queue.removeFirst();
	}

	public int count() {
		return queue.size();
	}


	@Override
	public Iterator<T> iterator() {
		return queue.iterator();
	}


	

}
