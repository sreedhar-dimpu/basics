package javafeatures;

public class Product {
	public Product(String name, String category, double price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
	}
	String name;
	String category;
	double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + price + "]";
	}

}
