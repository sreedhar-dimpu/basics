package OOPS;

public class inheritance {
	
	protected String accountholdername;
	protected double balance;
	// methods to deposite
	
    public void deposite(double amount)
    {
    	if(amount>0)
    	{
    		balance+=amount;
    		System.out.println("deposite amount: "+balance);
    	}
    	else
    	{
    		System.out.println("invalid amount");

    	}
    }
    
    
    // method to withdraw
    
    public void withdraw(double amount)
    {
    	if(amount>0 && amount<=balance)
    	{
    		balance-=amount;
    		System.out.println("withdraw money: "+balance);
    	}
    	else
    	{
    		System.out.println("invalid amount");

    	}
    }


public void displaybalance()
{
	System.out.println("balance :"+balance);
}
}



