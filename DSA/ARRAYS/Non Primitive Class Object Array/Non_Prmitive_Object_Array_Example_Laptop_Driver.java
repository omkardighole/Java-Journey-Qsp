package arrays;

public class Non_Prmitive_Object_Array_Example_Laptop_Driver {

	public static void main(String[] args) {

		Non_Prmitive_Object_Array_Example_Laptop [] obj = new Non_Prmitive_Object_Array_Example_Laptop[5];
		
		obj[0]=new Non_Prmitive_Object_Array_Example_Laptop("ASUS",16,"RTX 2050",512);
		obj[1]=new Non_Prmitive_Object_Array_Example_Laptop("HP",8,"IRIS",256);
		obj[2]=new Non_Prmitive_Object_Array_Example_Laptop("Lenevo",16,"RTX 3050",1024);
		obj[3]=new Non_Prmitive_Object_Array_Example_Laptop("ASUS",8,"GTX 1650",256);
		obj[4]=new Non_Prmitive_Object_Array_Example_Laptop("MSI",64,"RTX 4050",1256);
		
		System.out.println(obj[4].brand);
		
		for(int i = 0 ; i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
		

	}

}
