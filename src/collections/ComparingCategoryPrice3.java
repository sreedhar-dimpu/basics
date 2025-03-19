package collections;
import java.util.Comparator;

public class ComparingCategoryPrice3 implements Comparator<Product> {
	 
	@Override
	public int compare(Product Id1, Product Id2) {
 
		
		int idComparison=Integer.compare(Id2.prodId,Id1.prodId);
		if(idComparison==0) {
			return Id1.category.compareTo(Id2.category);
		}
		return idComparison;
	}
 
	
}


