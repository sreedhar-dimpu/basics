package MultiThreading;

public class TestThread2 extends Thread{
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("Thread is running2"+ Thread.currentThread().getName());
	}
 
}
