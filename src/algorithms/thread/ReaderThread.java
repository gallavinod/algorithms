package algorithms.thread;


// Reads data, never modifies it
// Many Reader Threads can be reading at the same time
public class ReaderThread implements Runnable {
	
	private int priority;
	
	public ReaderThread(int priority) {
		this.priority = priority;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
