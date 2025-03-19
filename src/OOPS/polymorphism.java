package OOPS;

public class polymorphism extends inheritance {
	private double overlimit=500;
	@Override
	public void withdraw(double amount)
    {
    	if(amount>0 && amount<=(balance+overlimit))
    	{
    		balance-=amount;
    		System.out.println("withdraw money: "+amount);
    	}
    	else
    	{
    		System.out.println("invalid amount");

    	}
    }

	public static void main(String[] args)
	{
		 // these declares a references of type account from inheritance
		inheritance account=new polymorphism();
		account.accountholdername="sree";
		System.out.println("account holder: "+account.accountholdername);
		account.deposite(1000);
		account.withdraw(800);
		account.displaybalance();
		
	}
	
}
