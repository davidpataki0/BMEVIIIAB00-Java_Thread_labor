package lab5;

public class Producer extends Thread{
	String str;
	Fifo fifo;
	int sleeptime;
	int i = 0;
	
	Producer(String str, Fifo fifo, int sleeptime) {
		this.str = str;
		this.fifo = fifo;
		this.sleeptime = sleeptime;
	}
	
	public void go() throws InterruptedException {
		
		while(true) {
			long ido = System.currentTimeMillis() % 10000;
			System.out.println("produced " + str + " " + i + " " + ido);
			fifo.put(str + " " + i++);
			
			Thread.sleep(sleeptime);
		}
	}
	
	@Override
	public void run() {
		try {
			go();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
