package javabasics;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double discount =0;
		 double shippingcharge=0;
		 double finalprice=0;
		 double afterdiscount=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the total items");
		 double itemnum=sc.nextInt();
		 if(itemnum<3)
		 {
			 System.out.println("please enter min 3 items atleast");
		 }
		 double totalcost=0;
		 for(int i=1;i<=itemnum;i++)
		 {
			 System.out.println("enter the prizes"+i+"");
			 double prizes=sc.nextInt();
			 System.out.println("enter the total quantity"+i+"");
			 double quantity=sc.nextInt();
			 totalcost=totalcost+(prizes*quantity);
		 }
		 System.out.println(totalcost);
		 
		 //discount 
		 if(totalcost>=5000 && totalcost<=10000)
		 {
			 discount=totalcost*0.10;
		 }
		 else if(totalcost>10000)
		 {
			 discount=totalcost*.20;
		 }
		 afterdiscount=totalcost-discount;
		 System.out.println(afterdiscount);
         
		 //shipping charges
		 if(afterdiscount>=7500)
		 {
			 shippingcharge=0;
			 
			 System.out.println("free");

		 }
		 else if(afterdiscount<7500)
		 {
			 shippingcharge=250;

		 }
		 
		 finalprice=afterdiscount+shippingcharge;
		 System.out.println("finalprice:"+finalprice);


		 System.out.println("totalcost:"+totalcost);
		 System.out.println("afterdiscount"+afterdiscount);
		 System.out.println("finalprice:"+finalprice);
		 System.out.println("shippingcharge:"+ shippingcharge);


		 }
		 
		

	}


