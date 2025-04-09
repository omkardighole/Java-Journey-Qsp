class Car_Constructor_Chaining_Driver
{
	public static void main(String [] args)
	{
		Car_Constructor_Chaining c1 = new Car_Constructor_Chaining();
		c1.displayCar();
		
		Car_Constructor_Chaining c2 = new Car_Constructor_Chaining("MAhindra","Bolero","Base Model",950000);
		c2.displayCar();
		
		Car_Constructor_Chaining c3 = new Car_Constructor_Chaining("MAhindra","Bolero","Mid Model",1150000,true);
		c3.displayCar();
		
		Car_Constructor_Chaining c4 = new Car_Constructor_Chaining("MAhindra","Bolero","Top Model",1250000,true,true);
		c4.displayCar();
		
		Car_Constructor_Chaining c5 = new Car_Constructor_Chaining("MAhindra","Bolero","Top + Model",1350000,true,true,true);
		c5.displayCar();
	}
}
		
		
		