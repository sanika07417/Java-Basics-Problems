class primeNumSum{
	public static void main(String args[])
	{
		int n=10;
		int sum=0;
		for(int i=2;i<10;i++)
		{
			int c=0;
			for(int j=1;j<n;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{	
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}