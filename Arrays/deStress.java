class deStress{
	public static void main(String args[])
	{
		int d=20;
		int o=5;
		int mo=2;
		int max=0;
		int ind=0;
		int ob[]={3,8,12,15,18};
		for(int i=0;i<ob.length-3;i++)
		{	int diff=ob[i+3]-ob[i];	
			if(diff>max)
			{
				max=diff;
				ind=i;
			}		
		}
		System.out.println(max-1);
	}
}