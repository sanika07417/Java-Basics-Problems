class priorELement{
	public static void main(String args[])
	{
		int arr[]={2,4,8,6,9};
		int p=arr[0];
		int c=0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=p)
			{
				c++;
			}
		}
		System.out.println(c);
	}
}