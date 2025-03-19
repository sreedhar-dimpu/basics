package javabasics;

import java.util.Scanner;

public class ConditionalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int amount =100;
		if(amount>=100)
		{
			System.out.println("eligible");
		}
		else {
			System.out.println("not eligible");
		}
*/
		/*
		double rating=4;
		double salary=100000.000;
		if(rating>1 && rating<=2)
		{
			System.out.println("no increment:"+salary);

		}
		else if (rating>2 && rating <=3.5 )
		{
			//5% increment
			double increment=salary*0.05;
			double newsalary=salary+increment;
			System.out.println("result:"+newsalary);

		}
		else if (rating>3.5 && rating <=5 )
		{
			//10% increment
			double increment=salary*0.1;
			double newsalary=salary+increment;
			System.out.println("result:"+newsalary);

		}
		
		else
		{
			System.out.println("invalid");

		}
		*/

System.out.println("enter current salary:");

Scanner sc=new Scanner(System.in);
double currentsalary=sc.nextDouble();
System.out.println("enter rating:");
int rating =sc.nextInt();
double hike=0.0;
switch(rating)
{
case 5:
	hike=0.20;
	break;
case 4:
	hike=0.15;
	break;
case 3:
	hike=0.10;
	break;
case 2:
	hike=0.08;
	break;
case 1:
 hike=0.05;
	break;
	
default :
System.out.println("invalid");
}
double newsalary=currentsalary+(currentsalary*hike);
System.out.println(newsalary);
}
	
	

}
