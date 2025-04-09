class BikeThis_Keyword
{
	String name;
	String brand;
	String model;
	int  cc ;
	double price;
	int milege;
	
	public void displayBike()
	{
		String name = "CHaprri Bike    this is a local  variable name";
		System.out.println();
		System.out.println("Brand :" +brand);
		System.out.println();
		System.out.println("Name (local variable):" +name);
		System.out.println();
		
		System.out.println("NAme (this Keyword):" +this.name);
		System.out.println();
		
		System.out.println("Model :" +model);
		System.out.println();
		System.out.println("CC :" +cc);
		System.out.println();
		System.out.println("Price  :" +price);
		System.out.println();
		System.out.println("Mileage :" +milege);
		System.out.println();
		
		System.out.println("ADDRESS Stored in this keyword :" +this);
	}
		
}
	
			
			
			
			
			
			
			
			
			
			
	