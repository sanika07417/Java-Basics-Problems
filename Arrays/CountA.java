class CountA{
	public static void main(String args[])
	{
		int a[]={7,0,0,1,7,7,2,7,7};

		int c=0;
		int p=0;
		int e=0;

		for(int i=0;i<a.length;i++)
		{
			
			
			
			boolean v=false;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					v=true;
					break;
				}
			}

			if(v){
				continue;
			}
		
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j])
				{
					c++;
					
				}
			}
			System.out.println(c);
			System.out.println(a[i]+" " +c);
			
			if(c>p)
			{
				p=c;
				e=a[i];
				c=0;
				
			}
			
			
			
		}
		System.out.println("Count ="+p+" Element ="+e);

		

		
	}
}