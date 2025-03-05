class LabelLoops{
	public static void main(String [] args){
		outerLoop:     // label for the outer loop
		
		{
			for(int i = 1; i<=3;i++){
				innerLoop:
					for(int j = 1; j<=3;j++)
					{
						if(j==2)
							break outerLoop;
						System.out.println(i+":"+j);
					}
			}
		}
	}
}