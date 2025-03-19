package javafeatures;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {
public static void main(String [] args)
{
	Map<String,Integer>employes=new HashMap<>();
	employes.put("name1", 123);
	employes.put("name2", 234);
	employes.put("name1", 345);
	
	//lamda
	employes.keySet().forEach(name->new Employee(name));
	System.out.println("------------------");
//	employes.keySet().forEach(Employee ::new);

	
	//BIFUNCTION
	
	
//	BiFunction<String, Integer, Employee> employee = (name, id) -> new Employee(name, id);
//	employee.apply("Name1", 123);
//	BiFunction<String, Integer, Employee> employee2 = Employee::new;
//	employee2.apply("Name4", 1234);
	
	//supplier

//	Supplier<Employee>empS=()->new Employee("sreedhar");
//	empS.get();
//	Supplier<Employee>empS2= Employee() :: new;
//	empS2.get();
//	
//	//function
//	
//	Function<String,Employee>empF=Employee::new;
//	empF.apply("NameN");

	
}
}
