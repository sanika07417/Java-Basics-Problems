class greater {
	public static void main(String args[])
	{
		int height[]={1,8,6,2,5,4,8,3,7};
		int g=0;
		int ind=0;
		int a=0;
		for(int i=0;i<height.length;i++)
		{
			if(height[i]>g)
			{
				g=height[i];
				ind=i;
			}
			
		}
		for(int i=ind;i<height.length;i++)
		{
			int na=height[i]*(i-ind);
			if(na>a)
			{
				a=na;
			}
		}	
		System.out.println(a);
	}
}
	