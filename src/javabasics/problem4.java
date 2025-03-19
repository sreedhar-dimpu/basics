package javabasics;

public class problem4 {
	public static void checkeven(int n)
	{
		if(n%2==0)
		{
			System.out.println("n is even " +n);
		}
		else
		{
			System.out.println("n is odd "+n);

		}
	}

	
	//greetings
	public static void greeting(String name)
	{
		System.out.println("hello " + name + " how are u");
	}
	
	
	//cube
	
	public static int cube(int i)
	{
		return i*i*i;
	}
	
	//factorial
	
	public static int fact(int j)
	{
		if(j==0||j==1)
		{
			return 1;
		}
		else
		{
			int fact=1;
			for(int i=2;i<=j;i++)
			{
				fact=fact*i;
			}
			return fact;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkeven(10);
		greeting("sreedhar");
		System.out.println(cube(3));
		System.out.println(fact(3));


	}

}
