package OOPS;

public class classAndobjects {
	//methods and attributes
	String name;
	String id;
	int age;
	
	void details()
	{
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("name: "+age);

	}



public static void main(String[] args)
{
	classAndobjects p1=new classAndobjects();
	p1.name="sreedhar";
	p1.id="qwer";
	p1.age=23;
	p1.details();
			
}
}

