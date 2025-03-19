package javabasics;

public class Problem5 {

	public static double calfare(int d)
	{
		return d*10;
	}
	
	//fare cal
	public static double calfare(int d,String cabtype)
	{
		double rate=0;
		if(cabtype.equals("suv"))
		{
			rate=25;
		}
		else if(cabtype.equals("premium")) //		

		{
			rate=20;
		}
		else
		{
			rate=10;
		}
		
		return d*rate;
	}
	
	//apply 10% charge
	public static double calfare(int d,String cabtype,boolean pk)
	{
	int fare=0;
	
		if(pk)
		{
			fare+=fare*0.1;
		}
	
		return fare;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println("standard fare:" +calfare(10));
		System.out.println("SUV fare:" +calfare(10,"suv"));
        System.out.println("premium fare:"+calfare(10,"premium",true));


	}

}
