package lab5;

public class Application{
	
	public static void main(String[] args) {
		
		Fifo fifo = new Fifo();
		
	    Thread consumer1 = new Consumer("consumer1", fifo, 100);
	    //consumer1.setName("consumer1");
	    Thread consumer2 = new Consumer("consumer2", fifo, 100);
	    //consumer1.setName("consumer2");
	    Thread consumer3 = new Consumer("consumer3", fifo, 100);
	    //consumer1.setName("consumer3");
	    Thread consumer4 = new Consumer("consumer4", fifo, 100);
	    //consumer1.setName("consumer4");
		
		Producer producer1 = new Producer("elso", fifo, 1000);
		Producer producer2 = new Producer("masodik", fifo, 1500);
		
		consumer1.start();
		consumer2.start();
		consumer3.start();
		consumer4.start();
		
		producer1.start();
		producer2.start();

	}

}
