class MobileDriver
{
	public static void main(String [] args)
	{
		Mobile m1 = new Mobile();
		
		m1.brand = "Realme";
	    m1.model = "9Pro+";
	    m1.ram = 6;
	    m1.rom = 128;
	    m1.camera = 3;
        m1.price = 25999;
		
		System.out.println("Address : " +m1);
		System.out.println("Brand : "+m1.brand);
		System.out.println("Model : "+m1.model);
		System.out.println(" Ram : "+m1.ram);
		System.out.println(" Rom : " +m1.rom);
		System.out.println("Camera : " +m1.camera );
		System.out.println("Price: "+m1.price);
System.out.println("*****************************************************************************************************************************************************");		
	
		Mobile m2 = new Mobile();
		
		m2.brand = "Samsung";
	    m2.model = "S25 Ultra";
	    m2.ram = 8;
	    m2.rom = 556;
	    m2.camera = 5;
        m2.price = 125999;
		
		System.out.println("Address : " +m2);
		System.out.println("Brand : "+m2.brand);
		System.out.println("Model : "+m2.model);
		System.out.println(" Ram : "+m2.ram);
		System.out.println(" Rom : " +m2.rom);
		System.out.println("Camera : " +m2.camera );
		System.out.println("Price: "+m2.price);
		
		System.out.println("*****************************************************************************************************************************************************");
	
	Mobile m3 = new Mobile();
	
	m3.brand = " VIOVO ";
	m3.model = " S1 Pro";
	m3.ram = 8;
	m3.rom = 512;
	m3.camera = 4;
	m3.price = 123456;
	
	System.out.println("Address : " + m3);
	System.out.println("Brand : " + m3.brand);
	System.out.println("Model : " + m3.model);
	System.out.println("Ram : " + m3.ram);
	System.out.println("Rom : " + m3.rom);
	System.out.println("Camera : " + m3.camera);
	System.out.println("Price : " + m3.price);
	
	}
	
}
