package javabasics;

public class Functions {
	public static int addition(int a,int b) //parameters
	{
		int sum=0;
		sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int result;
result = addition(10,20);// arguments
System.out.println(result);
System.out.println(addition(20,20));

//sqrt
System.out.println(Math.sqrt(6));

	}

}
