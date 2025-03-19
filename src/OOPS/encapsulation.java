package OOPS;

public class encapsulation {
	private String accountholdername;
	private double balance;
	
	// getter and setter methods
	public String getaccountholdername()
	{
	return accountholdername;
	}
	public void setaccountholdername(String accountholdername)
	{
		this.accountholdername=accountholdername;
	}
    public double getbalance()
    {
    	return balance;
    }
    
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




// main method 


public static void main(String[] args)
{
	encapsulation bankaccount=new encapsulation ();
	bankaccount.setaccountholdername("sreedhar");
	System.out.println("account holder name is :"+bankaccount.getaccountholdername());
	bankaccount.deposite(10000);
	bankaccount.withdraw(5000);
	System.out.println("final balance :"+bankaccount.getbalance());

	
}	
	
}
