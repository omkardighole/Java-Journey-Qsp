class MangoDriver{
	public static void main(String [] args)
	{
		Mango m1 = new Mango();
		
		m1.origin="Ratnagiri";
		m1.price=2000;
		m1.type = "Hapus";
		
		
		m1.printType().printPrice().printOrigin();   //Method Chaining Process 
	}
}