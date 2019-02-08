package com.techlab.async;

import java.util.Date;

public class Display implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("hello");
		}
	}

}
