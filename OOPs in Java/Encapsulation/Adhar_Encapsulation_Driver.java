package Principle_Of_Oop;

public class Adhar_Encapsulation_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adhar_Encapsulation a1 = new Adhar_Encapsulation("Omkar Dighole" , "07/05/2003" , "Male" , "Nashik" , 11223344);
		
		System.out.println("Name: " +a1.getName());
		System.out.println("DOB: "+a1.getDob());
		System.out.println("Adhar Number: "+a1.getAdharNo());
		System.out.println("Gender: "+a1.getGender());
		System.out.println("Address : "+a1.getAddress());
		System.out.println("Ypur Virtual Id is generated Succesfully : "+a1.setVirtualId(11223344));
		
	   
		
		a1.setDob("16/05/2003", 11223344);
	
		
		a1.setGender("MALE", 11223344);
		
		a1.setAddress("Sinnar" , 11223344);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Details Of Adhar Using Virtual ID");
		
		int vid = a1.setVirtualId(11223344);
		   if(vid==0)
		   {
			   System.out.println("Adhar Number Invalid ");
			   System.out.println("Virtual Id Generation Failed RETRY ");
		   }
		   else
		   {
			   a1.getAdharDetails(vid);
			   
		   }
		
		
	}

}
