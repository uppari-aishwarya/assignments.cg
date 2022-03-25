package com.assignments.cg;
	public class MyThread1 implements Runnable{
		Thread t;
		String threadName;

		MyThread1(String threadName){
			this.threadName = threadName;
		}

		@Override
		public void run() {
			System.out.println(threadName+" is running...");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(threadName+" has been terminated");
		}

		public void go() {
			t = new Thread(this,threadName);
			t.start();
		}

}
