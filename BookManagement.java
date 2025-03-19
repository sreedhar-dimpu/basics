package oops;

public class BookManagement {

	//private
	private String booktitle;
	private String author;
	private String isbn;
	private double price;
	private boolean present;
	
	
	// constructor
	public BookManagement(String booktitle,String author, String isbn,double price,boolean present)
	{
		this.booktitle =booktitle;
		this.author =author;
		this.isbn=isbn;
		this.price=price;
		this.present=present;
	}
	
	//getter nad setter methods
	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		this.price = price;
	}
	public void setpresent(boolean present)
	{
		this.present=present;
	}
	public boolean isava()
	{
		return present;
	}
	
	public void dis(double per)
	{
		if(per>0 && per<=100)
		{
			price-=(price*per/100);
			System.out.println("discount :"+price);
		}
		else
		{
			System.out.println("invalid dis");
		}
	}
	// display details 
	
	public void bookinfo()
	{
		System.out.println("book details:");
		System.out.println("booktitle:" +booktitle);
		System.out.println("author: "+author);
		System.out.println("isbn :"+isbn);
		System.out.println("price :"+price);
		System.out.println("avai :"+present);

		


	}

	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManagement book1=new BookManagement("chemistry","sreedhar","65432456",300.0,true);
		
		BookManagement book2=new BookManagement("physics","reddy","654324534",600.0,false);
		
		//display
		book1.bookinfo();
		System.out.println("\n");
		book2.bookinfo();
		book1.dis(10);
		

		
		
}

	
}
