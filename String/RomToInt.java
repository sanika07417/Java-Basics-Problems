class RomToInt{
	public static void main(String args[])
	{
		int roman[]={'I','V','X','L','C','D','M'};
		int romval[]={1,5,10,50,100,500,1000};

		String s="LVIII";
		char arr[]=s.toCharArray();
		int sum=0;

		for(int i=0;i<arr.length;i++)
		{
			int ind=0;
			for(int j=0;j<roman.length;j++)
			{
				if(arr[i]==roman[j])
				{
					ind=i;
					
					sum+=romval[j];
					
				}
			}
		}
		System.out.println(sum);
	}
}
			