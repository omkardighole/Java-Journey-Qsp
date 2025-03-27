class AceDriver{
	public static void main(String [] args)
	{
		Ace a1 = new Ace();
		
		a1.brand="Blue Star";
		a1.price = 1233.44;
		a1.ton = 3.5;
		a1.minTemp = 26;
		a1.minTemp = 30;
		
		a1.displayBrand();
		a1.displayPrice();
		a1.displayTon();
		a1.displayMintemp();
		a1.displayMaxtemp();
		
		System.out.println("-------------------------------------------------");
		
		a1.showAce();
	}
}