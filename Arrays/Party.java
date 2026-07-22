class Party{
	public static void main(String args[])
	{
		int t=2;
		int a[]={7,0,5,1,3};
		int b[]={1,2,1,3,4};
		int r=0;
		int diff=0;

		for(int i=0;i<t;i++)
		{
				r=a[i]-b[i]+r;
				if(r>diff)
				{
					diff=r;
				}
		}
		System.out.println(diff);
		
	}
}
				