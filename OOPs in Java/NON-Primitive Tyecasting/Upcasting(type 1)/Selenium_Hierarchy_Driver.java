class WebDriver{
	public void webDriverMethod()
	{
		System.out.println("Web Driver MEthods");
	}
	public void getcurrentUrl()
	{
		System.out.println("Web Driver MEthods of url getting");
	}
	public void getTitle()
	{
		System.out.println("Web Driver MEthods of getting title");
	}
}
class ChromeDriver extends WebDriver{
	public void chromeMethods()
	{
				System.out.println("Chrome Driver MEthods");
	}
}
class SafariDriver extends WebDriver{
	public void safariMethods()
	{
				System.out.println("Safari Driver MEthods");
	}
}
class EdgeDriver extends WebDriver{
	public void edgeMethods()
	{
				System.out.println("Edge Driver MEthods");
	}
}
class OperaDriver extends WebDriver{
	public void operaMethods()
	{
				System.out.println("Opera Driver MEthods");
	}
}

public class Selenium_Hierarchy_Driver{
	public static void main(String [] args)
	{
		WebDriver w1 = new ChromeDriver();
		
		w1. webDriverMethod();
		w1.getcurrentUrl();
		w1.getTitle();
		//w1. chromeMethods();
		
		System.out.println("____________________________________________________");
		
		WebDriver w2 = new SafariDriver();
		
		w2. webDriverMethod();
		w2.getcurrentUrl();
		w2.getTitle();
	//	w2. safariMethods();
		
	}
}



	
