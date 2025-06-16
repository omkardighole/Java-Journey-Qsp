class Pubg{
	int bullets = 30;
	public void turnRight()
	{
		System.out.println("Turned Right");
	}
	public void turnLeft()     //Glith MEthod having error
	{
		System.out.println("Turned Right");
	}
	public void fire()
	{
		if(bullets>0)
		{	bullets--;
			System.out.println("Fired!!!");
			System.out.println(bullets+ " left");
		}
		else
			System.out.println("RELOAD");
	}
	public void reload()
	{
		bullets=30;
		System.out.println("Reloaded Succesfully!!!");
	}
	public void forward(int steps)
	{
		System.out.println("Went "+steps +" forward");
	}
	public void backward(int steps)      //Glith MEthod having error
	{
		System.out.println("Went "+steps +" forward");
	}
}

class Pubgv2 extends Pubg{
	public void turnLeft()     //new method overided to solve Glitch error 
	{
		System.out.println("Turned Left");
	}
	public void backward(int steps)    //new method overided to solve Glitch error
	{
		System.out.println("Went "+steps +" backward");
	}
}
	
		