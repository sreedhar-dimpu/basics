package MultiThreading;

public class takeOrder extends Thread{
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			System.out.println("taking order");

			Thread.sleep(5000);
			System.out.println("order taken" );

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("Thread is running2"+ Thread.currentThread().getName());
	}
 
}
