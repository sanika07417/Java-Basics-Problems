class iArray1{
	public static void main(String args[])
	{
		int a[]={1,1,2,2,2,3,3};
		int u=0;
		int c=0;

		for(int i=0;i<a.length-1;i++)
		{
			
			if(a[i]==a[i+1])
			{
				c++;
			}
			
		}
		
		if(c==0){
			System.out.println("Dont have equal appearance");
		}
		else if(c!=2||c!=4){
			System.out.println("it contains three consecutive elements");
		}
		else{
			
			}
		
		
	}
}