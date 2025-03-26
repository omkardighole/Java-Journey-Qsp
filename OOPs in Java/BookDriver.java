class BookDriver
{
	public static void main(String [] args)
	{
		Book b1 = new Book();
		
		b1.brand = "Classmate";
		b1.price=50.0;
		b1.weight=100;
		b1.bound="Soft Bound";
		b1.noOfPages=100;
		b1.type="LongNote";
		
		System.out.println("Heap area address: " +b1);
		System.out.println("Price: "+b1.price);
		System.out.println("Weight: "+b1.weight);
		System.out.println("Pages: "+b1.noOfPages);
		System.out.println("Type: "+b1.type);
		System.out.println("Bound :"+b1.bound);
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		
		Book b2 = new Book();
		
		System.out.println("Address: "+b2);
		System.out.println("Price: "+b2.price);
		System.out.println("Weight: "+b2.weight);
		System.out.println("Pages: "+b2.noOfPages);
		System.out.println("Type: "+b2.type);
		System.out.println("Bound :"+b2.bound);
	}
}