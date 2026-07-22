class sum2dArray{
	public static void main(String args[])
	{
		int arr[][]={{1,2},{3,4},{5,6}};
	
		
		int min=0;

		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum+=arr[i][j];
			}
			if(sum>min)
			{
				min=sum;
				
			}
		}
		System.out.println(min);
	}
}
				 