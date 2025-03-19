//package javabasics;
//import java.util.Scanner;
//
//public class Problem3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number of employees");
//		int nemp=sc.nextInt();
//		sc.nextLine();
//
//		
//		//to store details of employee
//		String[] names=new String[nemp];
//		String[] address=new String[nemp];
//		double[] salary=new double[nemp];
//		
//		//user input of each employee
//		for(int i=0;i<nemp;i++)
//		{
//			System.out.println("PLEASE enter the details of the employee"+(i+1));
//			System.out.println("name :");
//			names[i]=sc.nextLine();
//			sc.nextLine();
//
//			System.out.println("salary:");
//			salary[i]=sc.nextDouble();
//			sc.nextLine();
//
//			System.out.println("address:");
//			address[i]=sc.nextLine();
//
//		}
//		
//		
//		//display details
//		
//		for(int i=0;i<nemp;i++)
//		{
//			System.out.println("name:"+i+"is"+names[i]); //doubt
//
//			System.out.println("employess:"+nemp);
//			System.out.println("salary:"+salary[i]);
//			System.out.println("address:"+address[i]);
//			System.out.println("total salary:"+salary[i]*3);
//
//
//
//
//
//		}
//
//	}
//
//}
