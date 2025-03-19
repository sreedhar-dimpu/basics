package javabasics;
import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String s2=new String("java");
		String s1="java";
		System.out.println(s1==s2); */
 //------------------------------------------------------------------------------------
		
		
		
		//we get false because both are stored in differnt location
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter password");
		String password=sc.nextLine();

		String pwd="Admin123";
		if(pwd.equals(password))
		{
			System.out.println("login successfull");
		}
		else
		{
			System.out.println("invalid");

		}
		*/
		
		//--------------------------------------------------------------------------------
		
		//email formate
	/*	String email="abc@gmail.com";
		if((email.contains("@"))&&(email.endsWith(".com")))
		{
			System.out.println("valid email");
			

		}
		else
		{
			System.out.println("invalid email");

		}
*/
		//---------------------------------------------------------------------------------------
		
		/*
		String mess="hey,hi how are you";
		String newmess=mess.replace("hi","hello");
		System.out.println(newmess);
		*/
	//-----------------------------------------------------------------------------	
		
		/*
		StringBuffer str=new StringBuffer("hello"); //string cnnot be modified in java because string are iimutavle so we havw use stringbuilder
		str.append("sreedhar");
		System.out.println(str);
		str.insert(3,"qwe");
		System.out.println(str);
		str.replace(1,3,"rty");
		System.out.println(str);
		str.delete(2,4);
		System.out.println(str);
		str.reverse();
		System.out.println(str); 
		*/
	
		
		//------------------------------------------------------------------------------------------------
		
		
		
		StringBuilder str=new StringBuilder("hello"); //string cnnot be modified in java because string are iimutavle so we havw use stringbuilder
		str.append("sreedhar");
		System.out.println(str);
		str.insert(3,"qwe");
		System.out.println(str);
		str.replace(1,3,"rty");
		System.out.println(str);
		str.delete(2,4);
		System.out.println(str);
		str.reverse();
		System.out.println(str);
	


	}

}

