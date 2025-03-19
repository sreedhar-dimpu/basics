package MultiThreading;

public class processPayment extends Thread{
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("payment processing");

			Thread.sleep(5000);
			System.out.println("payment done");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("Thread is running2"+ Thread.currentThread().getName());
	}
 
}
