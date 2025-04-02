class Mango{
	
	String type;
	double price ;
	String origin;

public Mango printPrice()
{
	System.out.println(price);
	return this ;				//returns reference of object to the calling method
}

public Mango printType()
{
	System.out.println(type);
	return this ;
}

public Mango printOrigin()
{
	System.out.println(origin);
	return this ;
}
}