class chocolate{
	public static void main(String args[])
	{
		int arr[]={4,5,0,1,9,0,5,0};
		int c=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[c]==0&&arr[i+1]!=0)
			{
				int temp=arr[c];
				arr[c]=arr[i+1];
				arr[i+1]=temp;
				c++;
				
			}
			else if(arr[i]==0&&arr[c]==0)
			{
			
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}