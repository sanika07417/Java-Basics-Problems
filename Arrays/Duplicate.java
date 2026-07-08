class Duplicate{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4};
		boolean v=false;
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int k=0;k<i;k++)
			{
				if(arr[i]==arr[k])
				{
					System.out.println("Visited");
				}
				else{
					System.out.println("Not visited");
				}
			}
		}
	}
}
	