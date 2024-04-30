package lab5;

public class Consumer extends Thread{
	public String str;
	public Fifo fifo;
	public int n;
	
	Consumer(String s, Fifo f, int n){
		str = s;
		fifo = f;
		this.n = n;
	}
	
	@Override
	public void run(){
		while(true) {
			try {
				String tmp = fifo.get();
				long ido = System.currentTimeMillis() % 10000;
				
				System.out.println("consumed " + str + " " + tmp + " " + ido);
				Thread.sleep(n);
			} catch (InterruptedException e) {
                e.printStackTrace();
			}
		}
	}

}
