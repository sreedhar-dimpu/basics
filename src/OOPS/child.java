package OOPS;

public class child extends inheritance{
	private double interstrate;
	public void setinterstrate(double interstrate)
	{
		this.interstrate=interstrate;
	}
	
	public void applyinterst()
	{
		double interest =balance*(interstrate/100);
		balance+=interest;
		System.out.println("interst applied:"+interest);
	}



//main method to test inheritance
public static void main(String[] args)
{
	child account=new child();
	account.accountholdername="dimpu";
	System.out.println("account holder: "+account.accountholdername);
	account.deposite(10000);
	account.setinterstrate(10);
	account.applyinterst();
	account.displaybalance();
}
}
