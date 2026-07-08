class iArray2{
	public static void main(String args[])
	{
		int a[]={2,2,2,2,3,1,1};
		int s=a.length;
		int hash[]=new int[7];
		
		for(int i=0;i<a.length-1;i++)
		{
			
			hash[a[i]]=+1;
			
		}
		
		
		for(int i=1;i<hash.length;i++)
		{
			System.out.println(hash[i]);
		}
	}
}