class container{
	public static void main(String args[])
	{
		int arr[]={1,8,6,2,5,4,8,3,7};
		int g=0;
		int sg=0;
		int a=0;
		int gi=0;
		int sgi=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>g)
			{
				g=arr[i];
				gi=i;
			}
			if(g>arr[i]&&sg<g)
			{
				sg=arr[i];
				sgi=i;
			}
			a=sg*(gi-sgi);
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==g)

		
		System.out.println(g+"  "+sg);
	}
}