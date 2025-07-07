package arrays;

public class Non_Prmitive_Object_Array_Example_Laptop {
	String brand;
	int ram;
	String gCard;
	int ssd;
	

	public Non_Prmitive_Object_Array_Example_Laptop() {
		// TODO Auto-generated constructor stub
	}
	
	public Non_Prmitive_Object_Array_Example_Laptop(String brand , int ram , String gCard,int ssd)
	{
		this.brand = brand;
		this.ram = ram;
		this.gCard=gCard;
		this.ssd=ssd;
	}
	
	public String toString()
	{
		return "[ Brand: "+brand+ " Ram: "+ram+ " Graphics Card: "+gCard+" SSD : "+ssd+ " ]";
	}

}
