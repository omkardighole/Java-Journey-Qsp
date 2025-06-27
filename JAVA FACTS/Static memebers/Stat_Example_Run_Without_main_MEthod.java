public class  Stat_Example_Run_Without_main_MEthod{
	public static void main(String... args)
	{
		static {
			System.out.print("Static blocked run without the main method in jdk 7 below versions");
			 System.exit(0);
		}
	}
}