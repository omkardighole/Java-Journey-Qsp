//package Non_Primitive_Typecasting;
class Doctor{
	public void CommonDoctor()
	{
		System.out.println("Simple Doctor");
	}
}
class Neurologist extends Doctor{
	public void neuroSpecialist()
	{
		System.out.println("Neuro Specialist Doctor");
	}
}

class Orthopedic extends Doctor{
	public void orthoSpecialist()
	{
		System.out.println("Ortho Specialist Doctor");
	}
}
public class DoctorDriver{
	public static void main(String [] args)
	{
		Doctor d1 = new Neurologist();  //upcasted to doctor class i.e parent class
//a neurologist object is assigned to a doctor ref . this is called upcasting 
//converted a child object to parent type
		//d1.neuroSpecialist();  CTE -variable d1 of type Doctor
		d1.CommonDoctor();
		
		Doctor d2 = new Orthopedic();
		
		//d2.orthoSpecialist();  Error-variable d2 of type Doctor
		
		d2.CommonDoctor();
	}
}
		