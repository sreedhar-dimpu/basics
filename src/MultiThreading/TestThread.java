package MultiThreading;

public class TestThread implements Runnable{

	@Override
 public void run()
 
 {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("thread1 is running " +Thread.currentThread().getName());
 }
}
