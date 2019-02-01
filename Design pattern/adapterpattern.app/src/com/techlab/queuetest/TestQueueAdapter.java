package com.techlab.queuetest;

import com.techlab.queue.QueueAdapter;

public class TestQueueAdapter {

	public static void main(String[] args) {
		QueueAdapter<Integer> integerAdapterQueue = new QueueAdapter<Integer>();
		integerAdapterQueue.enqueue(10);
		integerAdapterQueue.enqueue(20);
		integerAdapterQueue.enqueue(30);
		System.out.println(integerAdapterQueue.dequeue(10));
		System.out.println(integerAdapterQueue.count());

		QueueAdapter<String> stringAdapterQueue = new QueueAdapter<String>();
		stringAdapterQueue.enqueue("Hello");
		stringAdapterQueue.enqueue("Hello");
		stringAdapterQueue.enqueue("Bye");
		System.out.println(stringAdapterQueue.dequeue("Bye"));
		System.out.println(stringAdapterQueue.count());
		
		for (Integer integer :integerAdapterQueue) {
			System.out.println(integer);
		}
		for (String string :stringAdapterQueue) {
			System.out.println(string);
		}
	}

}
