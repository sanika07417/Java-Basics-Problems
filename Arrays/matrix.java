class matrix{
	public static void main(String args[])
	{
		int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int c=0;
		int t=4;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(t==arr[i][j])
				{
					c++;
				}
				
			}
		}
		if(c==0)
		{
			System.out.println("false");
		}
		else{
			System.out.println("true");
		}
	}

}
				