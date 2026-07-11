class max{
	public static void main(String args[])
	{
		int arr[]={50,20,70,40,90,60};
		//int arr[]={15,25,10,40,30};
		int k=3;

		int e=(arr.length)-k;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}}
		}
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
		}
		System.out.println(arr[e]);
	}
			
}