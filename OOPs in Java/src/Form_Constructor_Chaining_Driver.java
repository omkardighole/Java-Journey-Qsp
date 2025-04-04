class Form_Constructor_Chaining_Driver{
	public static void main(String [] args)
	{
		Form_Constructor_Chaining f1 = new Form_Constructor_Chaining();
		f1.displayForms();
		
		Form_Constructor_Chaining f2 = new Form_Constructor_Chaining("Raju", 9865324578l,'M', "12/12/12" );
		f2.displayForms();
		
		Form_Constructor_Chaining f3 = new Form_Constructor_Chaining("rani" , 9878565656l,'F' , "12/12/03",7845965l,"O+" , "rani@gmail.com");
		f3.displayForms();
	}
}