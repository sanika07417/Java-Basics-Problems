class number{
	public static void main(String args[])
	{
		int n=31;
		int d=0;
		int r=1;
		if(n>=0&&n<=30)
		{
			if(n==1||n==0)
			{
				System.out.println("1");
			}
			else{
				if(n%2==0)
				{
					d=(n-1)/2;
					for(int i=1;i<=d;i++)
					{
						r=r*3;
					}
					System.out.println(r);
				}
				else{
					d=n/2;
					for(int i=1;i<=d;i++)
					{
						r=r*2;
					}
					System.out.println(r);
				}	
			}
		}
		else{
			System.out.println("value is more that 30");
		}
		
	}
}