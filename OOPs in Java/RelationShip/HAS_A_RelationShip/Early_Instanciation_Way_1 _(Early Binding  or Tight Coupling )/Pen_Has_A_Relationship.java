package Principle_Of_Oop;

public class Pen_Has_A_Relationship {
	
	String brand;
	double price;
	String type;
	Refil_Has_A_Relationship  ref  ;         //variable ref is declared of type Refil_Has_A_Relationship
	
	Pen_Has_A_Relationship()
	{
		
	}
	
	Pen_Has_A_Relationship(String brand , double price , String type , String color , double size , String refillType)
	{
		ref = new Refil_Has_A_Relationship(color , size , type);
		this.brand = brand;
		this.price=price;
		this.type=type;
		
		System.out.println("Pen is Created");
	}
	
	void displayPen() {
		{
			System.out.println("PEn Brand : "+brand);
			System.out.println("PEn price : "+price);
			System.out.println("PEn Type : "+type);
		}
	}
	
}
