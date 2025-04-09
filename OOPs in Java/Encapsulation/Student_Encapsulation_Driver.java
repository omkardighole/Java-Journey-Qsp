package Principle_Of_Oop;

public class Student_Encapsulation_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentEncapsulation  s1 = new StudentEncapsulation("Omkar " , "Java FullStack" , 35000.0 , "Deccan" , 9.55 , "BE" ,85.0 , 86.66 , 7666002113l );
		
		System.out.println(s1.getInstituteName());
		System.out.println(s1.getName());
		System.out.println(s1.getCourse());
		System.out.println(s1.getFees());
		System.out.println(s1.getBranch());
		System.out.println(s1.getCga());
		System.out.println(s1.getdegree());
		System.out.println(s1.getSscPer());
		System.out.println(s1.getHscPer());
		System.out.println(s1.getPhno());
		
		
		s1.setBranch("Hadapsra", true);
		
		s1.courseChange(7666002113l, "Python FullStack");
	}
	

}
