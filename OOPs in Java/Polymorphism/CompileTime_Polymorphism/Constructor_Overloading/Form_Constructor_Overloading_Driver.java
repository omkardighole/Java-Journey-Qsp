class Form_Constructor_Overloading_Driver{
	public static void main(String [] args)
	{
		Form_Constructor_Overloading f1 = new Form_Constructor_Overloading();
		f1.displayForms();
		
		Form_Constructor_Overloading f2 = new Form_Constructor_Overloading("Raju", 9865324578l,'M', "12/12/12" );
		f2.displayForms();
		
		Form_Constructor_Overloading f3 = new Form_Constructor_Overloading("rani" , 9878565656l,'F' , "12/12/03",7845965l,"O+" , "rani@gmail.com");
		f3.displayForms();
	}
}