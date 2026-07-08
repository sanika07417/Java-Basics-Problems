class negativeArray{
	public static void main(String args[])
	{
		int a[]={-12,11,-13,-5,6,-7,5,-3,-6};
		
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" " );
		}
	}
}