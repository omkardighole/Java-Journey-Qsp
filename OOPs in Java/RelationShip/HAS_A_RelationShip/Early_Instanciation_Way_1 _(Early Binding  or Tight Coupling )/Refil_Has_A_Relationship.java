package Principle_Of_Oop;

public class Refil_Has_A_Relationship {
	
	String color;
	double size;
	String type;
	
	Refil_Has_A_Relationship()
	{
	}
	
	Refil_Has_A_Relationship(String color , double size ,String type)
	{
		this.color=color;
		this.size=size;
		this.type=type;
		System.out.println("Refil is Created");
	}
	void displayRefil()
	{
		System.out.println("Refil Color : " +color);
		System.out.println("Refil Size : " +size);
		System.out.println("Refil type : " +type);
		
	}

}
