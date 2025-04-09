class BikeThis_KeywordDriver
{
		public static void main(String [] args)
		{
			BikeThis_Keyword b1 = new BikeThis_Keyword();
			
			b1.name = "KTM RC   this is a name printed using the this keyword which stores the refernece of current object";
			System.out.println();
			b1.brand = " KTM Company ";
			System.out.println();
			b1.model = " 390 ";
			System.out.println();
			
			b1.cc = 390;
			System.out.println();
			
			b1.price = 523432;
			
			System.out.println();
			b1.milege = 20;
			
			
			b1.displayBike();
		}
}
