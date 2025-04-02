class Shoe
{
	String brand = "Nike";
	double price ;
	int size ; 
	String type;
	
	{									//Non static block 
		System.out.println("Object loading process Started");
		
		if(brand.charAt(0)=='N')
		{
			price = 1000;
		}
		else
		{
			price = 200;
		}
	}        //non static block ends
	
	
	public void displayShoe()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(size);
		System.out.println(type);
	}
}