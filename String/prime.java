class prime{
	public static void main(String args[])
	{
		int n1=20;
		int n2=25;
		int p=0;
		int s=0;
		
		for(int i=n1;i<=n2;i++)
		{
			int c=0;
			for(int j=1;j<=n2;j++)
			{
				if(i%j==0)
				{
					c++;
				}
							
			}
			if(c==2)
				{
					p=i;
				}

			
		}
	
		System.out.println(p);
		int r=p%10;
		 s+=r;
		p=p/10;
		s=s+p;
		
		System.out.println(s);
	}
}