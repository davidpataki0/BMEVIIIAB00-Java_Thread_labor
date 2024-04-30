package lab5;

import java.util.LinkedList;

public class Fifo {
	
	LinkedList<String> lt = new LinkedList<String>();
	
	public synchronized void put(String str) throws InterruptedException {
		while(lt.size() >= 10)
			this.wait();
		
		lt.add(str);
		notify();
	}
	
	public synchronized String get() throws InterruptedException {
		
		String str = new String("");
		
		while(lt.isEmpty())
			this.wait();
		
		
		str = lt.remove();
		
		notify();
		return str;
	}

}
