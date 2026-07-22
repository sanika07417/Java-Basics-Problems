class naturalNums{
	public static void main(String args[])
	{
		int n=4;
		int c=1;
		int arr[]={1,3,4,5};
		/*for(int i=0;i<=n;i++)
		{	
			if(c!=arr[i])
			{
				System.out.println(c);
				break;
				
			}
			c++;
		}*/
		
		int sum=(n*(n+1))/2;
		int suma=0;
		for(int i=0;i<arr.length;i++)
		{
			suma+=arr[i];
		}
		int mn=sum-suma;
		//System.out.println(suma-sum);
		System.out.println(suma);
		System.out.println(sum);
	}
}